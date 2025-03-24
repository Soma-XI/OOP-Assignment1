class Student extends Person {
    // Attributes
    private String studentId;
    private static int idCounter = 20251000;
    private String major;
    private double GPA;

    // Constructor
    public Student(String userName, int userAge, String userAddress, String newMajor, double newGPA) {
        super(userName, userAge, userAddress);
        this.studentId = generateStudentId(); 
        this.major = newMajor;
        this.GPA = newGPA;
    }

    // Generate unique student ID
    private static String generateStudentId() {
        return "S" + (idCounter++);
    }

    // Method to display student details
    void displayDetails() {
        System.out.println("===== Student Details =====");
        System.out.println("Student ID: " + studentId);
        System.out.println("Student Name: " + getName()); 
        System.out.println("Major: " + major);
        System.out.println("GPA: " + GPA);
        System.out.println("===== End of Student Details =====");
    }

    // Getter for studentId
    public String getStudentId() {
        return studentId;
    }

    // Getters for other fields if needed
    public String getMajor() {
        return major;
    }

    public double getGPA() {
        return GPA;
    }
}
