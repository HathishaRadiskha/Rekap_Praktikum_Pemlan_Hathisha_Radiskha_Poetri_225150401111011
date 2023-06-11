package modulpraktikum.tugasmodulconstructor;

import java.util.Scanner;

public class student {
    private String name; 
    private String address; 
    private int age; 
    private double mathGrade; 
    private double englishGrade; 
    private double scienceGrade; 
    private double average;
    private boolean passed = false;
    private int jumlah;
    private student[] siswa = new student[jumlah];
    private int jumlahObjek = 0;

    public student(){ 
        name = ""; 
        address = ""; 
        age = 0;
        jumlahObjek++;
    } 

    public student(String n, String a, int ag) { 
        name = n; 
        address = a; 
        age = ag; 
        jumlahObjek++;
    }
    
    public student(int mathGrade, int englishGrade, int scienceGrade) {
        this.mathGrade = mathGrade;
        this.englishGrade = englishGrade;
        this. scienceGrade = scienceGrade;
        jumlahObjek++;
    }

    public void getJumlah(int jumlah) {
        this.jumlah = jumlah;
    }

    // public void loopingInput() {
    //     Scanner in = new Scanner(System.in);
    //     for (int i = 0; i < jumlah; i++) {
    //         // setName(in.nextLine());
    //         siswa[i] = setName(in.nextLine());
    //         setAddress(in.nextLine());
    //         setAge(in.nextInt());
    //         setMath(in.nextInt());
    //         setEnglish(in.nextInt());
    //         setScience(in.nextInt());
    //         getAverage();
    //         statusAkhir();
    //     }
    // }

    public void setName(String n){
        name = n; 
    }

    public void setAddress(String a){ 
        address = a; 
    }

    public void setAge(int ag){ 
        age = ag; 
    }

    public void setMath(int math){ 
        mathGrade = math; 
    }

    public void setEnglish(int english){ 
        englishGrade = english; 
    }

    public void setScience(int science){ 
        scienceGrade = science; 
    } 

    private double getAverage(){ 
        // double result = 0; 
        average = (mathGrade + scienceGrade + englishGrade) / 3; 
        return average; 
    }

    private boolean statusAkhir() {
        if (average >= 61) {
            passed = true;
        }
        return passed;
    }

    public void displayMessage(){ 
        System.out.println("Siswa dengan nama "+ name); 
        System.out.println("Beramalat di "+ address); 
        System.out.println("Berumur "+ age);
        System.out.println("Nilai Matematika: " + mathGrade);
        System.out.println("Nilai Bahasa Inggris: " + englishGrade);
        System.out.println("Nilai Ilmu Pengetahuan Alam: " + scienceGrade);
        System.out.println("Mempunyai nilai rata-rata "+ getAverage());
        statusAkhir();
        if (passed == false) {
            System.out.println("Dinyatakan Tidak Lulus!");
        } else {
            System.out.println("Dinyatakan Lulus!");
        }
    }
    
    public void totalObjek() {
        System.out.println("Jumlah objek yang ada pada program adalah: " + jumlahObjek);
    }
}