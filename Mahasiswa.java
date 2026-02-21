public class Mahasiswa {
    // Attributes
    String nama;
    String nim;
    String kelas;
    double ipk;
    
    public Mahasiswa() {
        
    }
    
    public Mahasiswa(String nm, String nim, double ipk, String kls) {
        nama = nm;           // Set name from parameter
        this.nim = nim;      // 'this' refers to the object's attribute
        this.ipk = ipk;      // 'this' distinguishes between parameter and attribute
        kelas = kls;         // Set class from parameter
    }
    
}