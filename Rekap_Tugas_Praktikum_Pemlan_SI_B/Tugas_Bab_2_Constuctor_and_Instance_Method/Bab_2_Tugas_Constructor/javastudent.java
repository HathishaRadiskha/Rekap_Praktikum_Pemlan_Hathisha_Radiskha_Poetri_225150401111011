package modulpraktikum.tugasmodulconstructor;

import java.util.Scanner;

public class javastudent {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Masukkan jumlah siswa yang akan didata: ");
        int jumlahSiswa = in.nextInt();

        student[] siswa = new student[jumlahSiswa];
        
        System.out.println("===================");
        for (int i = 0; i < jumlahSiswa; i++) {
            System.out.println("Masukkan nama siswa: ");
            String nama = in.nextLine();
            in.nextLine();
            System.out.println("Masukkan alamat siswa: ");
            String alamat = in.nextLine();
            System.out.println("Masukkan umur siswa: ");
            int age = in.nextInt();
            siswa[i] = new student(nama, alamat, age);

            System.out.println("Nilai Matematika: ");
            int math = in.nextInt();
            System.out.println("Nilai Bahasa Inggris: ");
            int english = in.nextInt();
            System.out.println("Nilai Ilmu Pengetahuan Alam: ");
            int science = in.nextInt();
            siswa[i].setMath(math);
            siswa[i].setEnglish(english);
            siswa[i].setScience(science);

            System.out.println("===================");
            siswa[i].displayMessage();
            System.out.println("===================");
        }
        in.close();

        // student reuben = new student(80, 90, 75);
        // reuben.setName("Reuben Razzani");
        // reuben.setAddress("Jombang");
        // reuben.setAge(13);
        // reuben.displayMessage();

        // System.out.println("===================");
        // student anna = new student(); 
        // anna.setName("Anna"); 
        // anna.setAddress("Malang"); 
        // anna.setAge(20); 
        // anna.setMath(100); 
        // anna.setScience(89); 
        // anna.setEnglish(80); 
        // anna.displayMessage();

        // System.out.println("==================="); 
        // student chris = new student("Chris", "Kediri", 21); chris.setMath(70); 
        // chris.setScience(60); 
        // chris.setEnglish(90); 
        // chris.displayMessage();

        // // System.out.println("==================="); 
        // // anna = new student("anna", "Batu", 18); 
        // // anna.displayMessage(); 

        // System.out.println("==================="); 
        // chris.setAddress("Surabaya"); 
        // chris.setAge(22); 
        // chris.displayMessage();
    }
}
