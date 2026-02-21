### Practicum 1
1. Think of a real object like my phone:  
Attributes/Properties - What it HAS  
- Color: Black  
- Screen size: 6.1 inches  
- Battery: 4000 mAh  
Behaviors/Methods - What it DOES  
- Make a call  
- Take a photo  
- Play music  
2. In this class is there 4 attributes. There is String nama; // Student's nama ,String nim; // Student ID number, String kelas; // Class,and double ipk; // GPA  
3. In this class is there 4 methods, There is void tampilkanInformasi() // Displays info, void ubahKelas(String kelasBaru) // Changes class, void updateIpk(double ipkBaru) // Updates GPA,and String nilaiKinerja() // Evaluates performance
4. Done
5. The logic:
≥ 3.5 → "Sangat baik" (Excellent)  
≥ 3.0 but < 3.5 → "Baik" (Good)  
≥ 2.0 but < 3.0 → "Cukup" (Fair)  
< 2.0 → "Kurang" (Poor)  
  
The method returns (gives back) a String with the evaluation.  

### practicum 2
1. The instantiation line is:  
line4 Mahasiswa mhs1 = new Mahasiswa ();
2. Use the DOT (.) operator:  
// Accessing attributes (to SET values)  
objectName.attributeName = value;  

// Accessing attributes (to GET values)  
System.out.println(objectName.attributeName);  

// Accessing methods  
objectName.methodName();  
objectName.methodName(parameters);  
3. Because data changed between calls:
// First call - shows original data  
mhs1.tampilkanInformasi();   
// Output: Nama: Muhammad Ali Farhan, Kelas: SI 2J, IPK: 3.55  
  
// We changed the data!  
mhs1.ubahKelas("SI 2K");     // Class changed from SI 2J to SI 2K  
mhs1.updateIpk(3.60);        // GPA changed from 3.55 to 3.60  
  
// Second call - shows NEW data  
mhs1.tampilkanInformasi();    
// Output: Nama: Muhammad Ali Farhan, Kelas: SI 2K, IPK: 3.60  

### practicum 3
1. // THIS LINE declares the parameterized constructor  
public Mahasiswa(String nm, String nim, double ipk, String kls) {  
    nama = nm;  
    this.nim = nim;  
    this.ipk = ipk;  
    kelas = kls;  
}  
2. Mahasiswa mhs2 → Declares a variable that can hold a Mahasiswa object  
new → Creates a NEW object in memory  
Mahasiswa(...) → Calls the constructor with parameters  
"Annisa Nabila" → Passed as nm parameter  
"2141720160" → Passed as nim parameter  
3.25 → Passed as ipk parameter  
"TI 2L" → Passed as kls parameter  
3. If you remove:
public Mahasiswa() { }  // Delete this
And keep only:
public Mahasiswa(String nm, String nim, double ipk, String kls) { ... }

Then this line will FAIL:
Mahasiswa mhs1 = new Mahasiswa();  // ERROR! No default constructor
Why? Because Java only provides a default constructor automatically if you don't create ANY constructors. Once you create a parameterized constructor, the default one disappears unless you explicitly write it.

Ande the Error message:
constructor Mahasiswa in class Mahasiswa cannot be applied to given types;
  required: String, String, double, String
  found: no arguments

4. NO! Methods can be called in ANY order, depending on what you want to do.
Think of it like a TV remote:
- You can change volume Before changing channel
- You can turn on TV Before adjusting settings
- The order depends on what you want to accomplish

5.The new object is: 
Mahasiswa mhsBudi = new Mahasiswa("Budi Santoso", "2241720999", 3.75, "TI 3A");