package IKApp;

public class EmployeeApp {
    public static void main(String[] args) {
        Department  mevaDep=new Department("Meva");
        Department  ökcDep=new Department("Ökc");

        mevaDep.addEmployee(new Employee(111,"Özen","Taştan","ozentastan1@gmail.com","yazılım test mühendisi"));
        ökcDep.addEmployee(new Employee(333,"X","Y","xy@gmail.com","yazılım test mühendisi"));
        mevaDep.addEmployee(new Employee(222,"A","B","ab@gmail.com","yazılım  geliştirici"));

        System.out.println(mevaDep.getDepName() + " birimindeki çalışanlar:\n" +
                        mevaDep.employee);
    }
}
