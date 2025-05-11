// Да се създаде AdminUserImpl клас, който е User(AbstractUser) и AdminUser
public class AdminUserImpl extends AbstractUser implements AdminUser{

    //Всеки AdminUser ще си има собствена база от данни(DataBase) с хардкодната стойност по подразбиране
    //за големината на броя потребители, които могат да бъдат създавани.

    private DataBase dataBase;
    private static final int MAX_USERS = 10;

    public AdminUserImpl(String username) {
        super(username);
        this.dataBase = new DataBase(MAX_USERS);
    }

    // Методът, който ще създава потребител, ще се съобразява с това дали да създаде нормален потребител
    // или админ, в зависимост от подадените параметри.

    @Override
    public User createUser(String username, boolean isAdmin) {
        // Ако вече има съществуващ потребител с такова име,
        // той НЕ се добавя и се изписва съобщение в конзолата, че е вече съществуващ
        for (User user : dataBase.getAllUsers()) {
            if (user != null && user.getUsername().equals(username)) {
                System.out.println("User with name " + username + " already exists.");
                return null;
            }
        }

        // Ако базата данни е вече пълна,

        User[] users = dataBase.getAllUsers();
        for (int i = 0; i < users.length; i++) {
            if (users[i] == null) {
                User newUser = isAdmin ? new AdminUserImpl(username) : new UserImpl(username);
                users[i] = newUser;
                System.out.println("User " + username + " created successfully.");
                return newUser;
            }
        }

        // ще изписва съобщение, че няма повече място за нови потребители

        System.out.println("No space left in the database to create new user.");
        return null;
    }

    // Методът, който ще изтрива потребители от базата, просто ще го прави null.

    @Override
    public void deleteUser(String username) {
        User[] users = dataBase.getAllUsers();
        boolean isEmpty = true;

        for (int i = 0; i < users.length; i++) {
            if (users[i] != null) {
                isEmpty = false;
                if (users[i].getUsername().equals(username)) {
                    users[i] = null;
                    System.out.println("User " + username + " has been deleted.");
                    return;
                }
            }
        }
        // Ако базата е празна и се опита да изтрие потребител,
        // ще изкарва съобщение в конзолата, че няма какво да се трие от празна база данни.

        if (isEmpty) {
            System.out.println("Database is empty. Nothing to delete.");
        } else {
            System.out.println("User " + username + " not found.");
        }
    }

    @Override
    public void viewAllUsers() {

    }
}
