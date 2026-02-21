package Exercise;

public class Dosen {
    // ATTRIBUTES
    String idLecturer;      // Lecturer ID
    String name;            // Lecturer name
    boolean activeStatus;   // true = active, false = inactive
    int yearOfEntry;        // Year they started teaching
    String expertiseCompetency;  // Field of expertise
    
    // CONSTRUCTORS
    // Default constructor
    public Dosen() {
        // Empty
    }
    
    // Parameterized constructor
    public Dosen(String idLecturer, String name, boolean activeStatus, 
                 int yearOfEntry, String expertiseCompetency) {
        this.idLecturer = idLecturer;
        this.name = name;
        this.activeStatus = activeStatus;
        this.yearOfEntry = yearOfEntry;
        this.expertiseCompetency = expertiseCompetency;
    }
    
    // METHODS
    void displayInformation() {
        System.out.println("Lecturer ID: " + idLecturer);
        System.out.println("Name: " + name);
        System.out.println("Active Status: " + (activeStatus ? "Active" : "Inactive"));
        System.out.println("Year of Entry: " + yearOfEntry);
        System.out.println("Expertise: " + expertiseCompetency);
        System.out.println("------------------------");
    }
    
    void setActiveStatus(boolean status) {
        this.activeStatus = status;
        System.out.println("Status changed to: " + (status ? "Active" : "Inactive"));
    }
    
    int calculateTimeWork(int YearNow) {
        int yearsWorked = YearNow - yearOfEntry;
        System.out.println("Years worked: " + yearsWorked);
        return yearsWorked;
    }
    
    void changeSkill(String Skill) {
        System.out.println("Changing expertise from " + expertiseCompetency + " to " + Skill);
        this.expertiseCompetency = Skill;
    }
}