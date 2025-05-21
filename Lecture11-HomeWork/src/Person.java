public class Person {
    private String name;
    private int age;
    private double height;
    private double weight;

    // Constructor
    public Person(String name, int age, double height, double weight) throws InvalidValueException {
        setName(name);
        setAge(age);
        setHeight(height);
        setWeight(weight);
    }

    // Getters
    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public double getHeight() {
        return height;
    }

    public double getWeight() {
        return weight;
    }

    // Setters with validation
    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) throws InvalidValueException {
        if (age < 0) {
            throw new InvalidValueException("Age cannot be negative.");
        }
        this.age = age;
    }

    public void setHeight(double height) throws InvalidValueException {
        if (height < 0) {
            throw new InvalidValueException("Height cannot be negative.");
        }
        this.height = height;
    }

    public void setWeight(double weight) throws InvalidValueException {
        if (weight < 0) {
            throw new InvalidValueException("Weight cannot be negative.");
        }
        this.weight = weight;
    }

    @Override
    public String toString() {
        return String.format("Name: %s | Age: %d | Height: %.2f | Weight: %.2f", name, age, height, weight);
    }
}

