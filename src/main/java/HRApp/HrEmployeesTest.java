package HRApp;

import HRApp.HrEmployees;

import java.sql.Timestamp;

public class HrEmployeesTest {
    public static void main(String[] args) {
       HRApp.HrEmployees emp1= new HrEmployees();
       HRApp.HrEmployees emp2= new HrEmployees();
       HRApp.HrEmployees emp3= new HrEmployees();

       //Demografik Info Start
       emp1.name="X";
       emp1.surname="Y";
       emp1.DateOfBirth=Timestamp.valueOf("1997-01-20 02:00:00");
       emp1.phoneNumber="05457412910";
       emp1.email="xy@gmail.com";
       emp1.educationInfo="Gazi Üniversitesi";

        emp2.name="Z";
        emp2.surname="T";
        emp2.DateOfBirth=Timestamp.valueOf("1995-01-23 05:00:00");
        emp2.phoneNumber="05453252910";
        emp2.email="zt@gmail.com";
        emp2.educationInfo="Hacettepe Üniversitesi";

        emp3.name="A";
        emp3.surname="B";
        emp3.DateOfBirth=Timestamp.valueOf("1997-11-20 08:00:00");
        emp3.phoneNumber="05453286310";
        emp3.email="ab@gmail.com";
        emp3.educationInfo="Ankara Üniversitesi";
       //Demografik Info End

        //JobInfo Start
        emp1.DateOfStart=Timestamp.valueOf("2021-10-17 00:00:00");
        emp1.title="Yazılım Test Mühendisi";
        emp1.department="MEVA";
        emp1.empNo=12345;
        emp1.salary=40000;

        emp2.DateOfStart=Timestamp.valueOf("2023-10-20 00:00:00");
        emp2.title="Yazılım Test Mühendisi";
        emp2.department="ÖKC";
        emp2.empNo=56325;
        emp2.salary=50000;

        emp3.DateOfStart=Timestamp.valueOf("2022-12-17 00:00:00");
        emp3.title="Yazılım Test Mühendisi";
        emp3.department="Dijital Vergi Dairesi";
        emp3.empNo=96354;
        emp3.salary=55000;
        //JobInfo End

        System.out.println("Personel Listesi: ");
        emp1.employeesInfo();
        emp1.employeesJobInfo();
        System.out.println("\n");
        emp2.employeesInfo();
        emp2.employeesJobInfo();
        System.out.println("\n");
        emp3.employeesInfo();
        emp3.employeesJobInfo();
    }
    }
