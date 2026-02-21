package Exercise;
public class DosenMain {
    public static void main(String[] args) {
        // Create first lecturer using default constructor
        Dosen dosen1 = new Dosen();
        dosen1.idLecturer = "D001";
        dosen1.name = "Dr. Budi Santoso";
        dosen1.activeStatus = true;
        dosen1.yearOfEntry = 2010;
        dosen1.expertiseCompetency = "Artificial Intelligence";
        
        // Create second lecturer using parameterized constructor
        Dosen dosen2 = new Dosen("D002", "Prof. Siti Aminah", true, 2005, "Database Systems");
        
        // Test all methods on dosen1
        System.out.println("=== Lecturer 1 Information ===");
        dosen1.displayInformation();
        
        dosen1.setActiveStatus(false);
        dosen1.calculateTimeWork(2026);
        dosen1.changeSkill("Machine Learning");
        dosen1.displayInformation();
        
        // Test all methods on dosen2
        System.out.println("\n=== Lecturer 2 Information ===");
        dosen2.displayInformation();
        
        dosen2.setActiveStatus(true);
        dosen2.calculateTimeWork(2026);
        dosen2.changeSkill("Big Data Analytics");
        dosen2.displayInformation();
    }
}