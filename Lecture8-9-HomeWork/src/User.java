
//Да се създаде интерфейс User
public interface User {

    // юзърите трябва да могат да се логват
    void logIn();
    // да се логаутват
    void logOut();
    // да се взима username на всеки юзър
    String getUsername();
    // да се взима датата, на която се е регистрирал
    String getRegistrationDate();

}
