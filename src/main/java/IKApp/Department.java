package IKApp;

import java.sql.Timestamp;
import java.util.ArrayList;
import java.util.List;

public class Department {
    String depName;
    List<Employee> employee;

    public Department(String depName){
        this.depName=depName;
        this.employee=new ArrayList<>();
    }
    public String getDepName() {
        return depName;
    }

    public void setDepName(String depName) {
        this.depName = depName;
    }

    public List<Employee> getEmployee() {
        return employee;
    }

    public void setEmployee(List<Employee> employee) {
        this.employee = employee;
    }


    public void addEmployee(Employee employee) {
        employee.employeeInfo();
    }
}
