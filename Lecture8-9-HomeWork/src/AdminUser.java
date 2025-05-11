// Да се създаде интерфейс AdminUser, като той е и User
public interface AdminUser extends User {
    // админ юзърите ще могат да правят всичко, което и нормалните,

    @Override
    void logIn();

    @Override
    void logOut();

    @Override
    String getUsername();

    @Override
    String getRegistrationDate();

    // но също така, ще могат и да –
    //Изтриват юзър, който ще намират на базата на неговия username

    public void deleteUser(String username);

    // Ще могат да създават нови юзъри и от тях ще зависи дали те
    // ще могат да са админи или не

    User createUser(String username, boolean isAdmin);


    // Ще могат да преглеждат всички потребители, метод който принтира цялата информация
    // за всеки един потребител в конзолата(без значение дали е админ или не)
    void viewAllUsers();

}
