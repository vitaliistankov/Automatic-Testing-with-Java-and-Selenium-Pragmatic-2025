// Да се създаде клас DataBase, който съдържа в себе си масив от User[]
public class DataBase {

    private User[] users;
    private int index = 0;

    // Има конструктор, който приема колко голям да е масива
    public DataBase(int size) {
        this.users = new User[size];
    }
    // Има гетър, който ви дава възможност да вземете всички потребители

    public User[] getAllUsers() {
        return users;
    }

}
