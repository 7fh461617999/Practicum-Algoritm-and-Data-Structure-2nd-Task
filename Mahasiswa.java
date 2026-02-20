public class Mahasiswa {
    String nama;
    String nim;
    String kelas;
    double ipk;

    void tampilkanInformasi (){
        System.out.println("Nama "+ nama);
        System.out.println("NIM "+ nim);
        System.out.println("kelas "+kelas);
        System.out.println("IPK "+ ipk);
    }
    void UbahKelas (String kelasBaru){
        kelas = kelasBaru;
    }
    void updateIpk(double ipkBaru) {
    // Check if GPA is valid (between 0.0 and 4.0)
    if (ipkBaru >= 0.0 && ipkBaru <= 4.0) {
        ipk = ipkBaru;  // Valid - update the GPA
        System.out.println("IPK berhasil diupdate menjadi: " + ipk);
    } else {
        // Invalid - show error message
        System.out.println("IPK tidak valid. Harus antara 0.0 dan 4.0");
    }
}
  String nilaiKinerja() {
    // Step 1: Check if ipk >= 3.5? (3.2 >= 3.5? NO)
    if (ipk >= 3.5) {
        return "Kinerja sangat baik";
    } 
    // Step 2: Check if ipk >= 3.0? (3.2 >= 3.0? YES)
    else if (ipk >= 3.0) {
        return "Kinerja baik";  // Returns this!
    }
    else if (ipk >= 2.0) {
        return "Kinerja cukup";
    }
    else {
        return "Kinerja kurang";
    }
}
}