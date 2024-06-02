package IKApp;

import java.sql.Timestamp;

public class Employee {
    String name;
    String surname;
    int id;
    String email;
    String title;
    Timestamp DateOfStart;

    public Timestamp getDateOfStart() {
        return DateOfStart;
    }

    public void setDateOfStart(Timestamp dateOfStart) {
        DateOfStart = dateOfStart;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Employee(int id, String name, String surname,String email,String title){
        this.id=id;
        this.name=name;
        this.surname=surname;
        this.email=email;
        this.title=title;
    }

    public String employeeInfo(){
         String employeeInfo="Personelin adı / soyadı: " + name + surname + "\n" +
                            "e-mail: " + email + "\nçalıştığı pozisyon: " + title;
        return employeeInfo;
    }

}
