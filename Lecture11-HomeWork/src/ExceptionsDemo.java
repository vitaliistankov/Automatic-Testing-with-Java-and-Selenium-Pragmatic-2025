public class ExceptionsDemo {
    public static void main(String[] args) {
        try {
            // Създаване на човек с валидни данни
            Person person = new Person("Ivan", 30, 180.5, 75.0);
            System.out.println(person);

            // Опит за задаване на невалидна стойност
            person.setWeight(-10.0); // Това ще хвърли exception

        } catch (InvalidValueException e) {
            System.err.println("Error: " + e.getMessage());
        }
    }
}

