abstract class Person {
    // Private attributes (Encapsulation)
    private String name;
    private int age;
    private String address;

    // Constructor
    public Person(String userName, int userAge, String userAddress) {
        this.name = userName;
        this.age = userAge;
        this.address = userAddress;
    }

    // Abstract method (to be implemented in subclasses)
    abstract void displayDetails();

    // Getters
    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public String getAddress() {
        return address;
    }

    // Setters (if modification is required)
    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setAddress(String address) {
        this.address = address;
    }
}