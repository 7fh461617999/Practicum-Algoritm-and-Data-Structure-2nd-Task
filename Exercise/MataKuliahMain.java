package Exercise;
public class MataKuliahMain {
    public static void main(String[] args) {
        // Create first course using default constructor
        MataKuliah mk1 = new MataKuliah();
        mk1.kodeCourse = "CS101";
        mk1.name = "Algoritma dan Struktur Data";
        mk1.credits = 3;
        mk1.numberOfHours = 6;
        
        // Create second course using parameterized constructor
        MataKuliah mk2 = new MataKuliah("CS102", "Pemrograman Java", 4, 8);
        
        // Test all methods on mk1
        System.out.println("=== Course 1 Information ===");
        mk1.showInformation();
        
        mk1.updateSKS(4);
        mk1.addHour(2);
        mk1.reduceHours(1);
        mk1.showInformation();
        
        // Test all methods on mk2
        System.out.println("\n=== Course 2 Information ===");
        mk2.showInformation();
        
        mk2.updateSKS(3);
        mk2.addHour(3);
        mk2.reduceHours(5);
        mk2.showInformation();
    }
}