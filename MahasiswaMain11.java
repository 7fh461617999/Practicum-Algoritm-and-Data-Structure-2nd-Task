public class MahasiswaMain11{
    public static void main(String[] args) {
        // INSTANTIATION - Creating an actual student from the blueprint
        Mahasiswa mhs1 = new Mahasiswa ();
        //           ↑              ↑
        //    Object name    The 'new' keyword creates the object
        
        mhs1.nama = "Muhammad Ali Farhan";  // Set name
        mhs1.nim = "2241720171";            // Set NIM
        mhs1.kelas = "SI 2J";               // Set class
        mhs1.ipk = 3.55;
  
        mhs1.tampilkanInformasi();  
        mhs1.UbahKelas("SI 2K");    
        mhs1.updateIpk(3.60);       
        mhs1.tampilkanInformasi();
    
} 
}
