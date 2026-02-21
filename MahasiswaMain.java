public class MahasiswaMain {
    public static void main(String[] args) {
        // Using DEFAULT constructor - set values manually
        Mahasiswa mhs1 = new Mahasiswa();  // Calls default constructor
        mhs1.nama = "Muhammad Ali Farhan";
        mhs1.nim = "2241720171";
        mhs1.kelas = "SI 2J";
        mhs1.ipk = 3.55;
        
        // Using PARAMETERIZED constructor - set values at creation
        Mahasiswa mhs2 = new Mahasiswa("Annisa Nabila", "2141720160", 3.25, "TI 2L");
        // All values set in ONE line!
        
        mhs1.tampilkanInformasi();
        mhs2.tampilkanInformasi();
    }
}