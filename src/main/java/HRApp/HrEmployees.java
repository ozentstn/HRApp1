package HRApp;

import java.sql.Timestamp;

public class HrEmployees {
    String name;
    String surname;
    Timestamp DateOfBirth;
    String phoneNumber;
    String email;
    String educationInfo;
    Timestamp DateOfStart;
    String title;
    int salary;
    String department;
    int empNo;

    public void employeesInfo() {
        System.out.println("Ad: " + name + " Soyad: " + surname +
                "\nDoğum Tarihi: " + DateOfBirth +
                "\nTelefon Numarası: " + phoneNumber +
                "\ne-Posta: " + email +
                "\nEğitim: " + educationInfo
        );
    }
    public void employeesJobInfo() {
        System.out.println("\nİşe Başlama Tarihi: " + DateOfStart +
                "\nUnvan: " + title +
                "\nBirim: " + department +
                "\nPersonel Numarası: " + empNo +
                "\nMaaş: " + salary);
    }
}