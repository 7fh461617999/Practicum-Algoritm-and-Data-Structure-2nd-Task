package Exercise;
public class MataKuliah {
    // ATTRIBUTES (What a course HAS)
    String kodeCourse;     // Course code (e.g., "CS101")
    String name;           // Course name (e.g., "Programming Fundamentals")
    int credits;           // Number of credits
    int numberOfHours;     // Hours per week
    
    // CONSTRUCTORS
    // Default constructor
    public MataKuliah() {
        // Empty - values will be set later
    }
    
    // Parameterized constructor
    public MataKuliah(String kodeCourse, String name, int credits, int numberOfHours) {
        this.kodeCourse = kodeCourse;
        this.name = name;
        this.credits = credits;
        this.numberOfHours = numberOfHours;
    }
    
    // METHODS
    void showInformation() {
        System.out.println("Course Code: " + kodeCourse);
        System.out.println("Course Name: " + name);
        System.out.println("Credits: " + credits);
        System.out.println("Hours per Week: " + numberOfHours);
        System.out.println("------------------------");
    }
    
    void updateSKS(int sksNew) {
        System.out.println("Changing credits from " + credits + " to " + sksNew);
        credits = sksNew;
        System.out.println("Credits have been changed!");
    }
    
    void addHour(int hours) {
        numberOfHours = numberOfHours + hours;
        System.out.println("Hours increased. Now: " + numberOfHours);
    }
    
    void reduceHours(int hours) {
        if (numberOfHours >= hours) {
            numberOfHours = numberOfHours - hours;
            System.out.println("Hours reduced. Now: " + numberOfHours);
        } else {
            System.out.println("Cannot reduce hours below 0!");
        }
    }
}