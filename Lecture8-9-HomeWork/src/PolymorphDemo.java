
// Създайте Demo клас с main метод
public class PolymorphDemo {
    public static void main(String[] args) {

        // Създайте един AdminUser
        AdminUserImpl admin = new AdminUserImpl("admin1");

        // Създайте N на брой потребителя извиквайки
        // метода за създаване на потребител на AdminUser(и админи и нормални потребители)

        admin.createUser("user1", false);
        admin.createUser("admin2", true);
        admin.createUser("user1", false);
        for (int i = 0; i < 8; i++) {
            admin.createUser("user" + (i + 2), false);
        }

        admin.createUser("userOverflow", false);

        admin.viewAllUsers();

        admin.deleteUser("user3");
        admin.deleteUser("unknown");
    }
}
