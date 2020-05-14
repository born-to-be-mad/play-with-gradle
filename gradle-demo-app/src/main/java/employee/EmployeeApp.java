package employee;

public class EmployeeApp {
 
    public static void main(String[] args){
        Employee employee = new Employee();
 
        employee.name = "James";
        employee.emailAddress = "james@bond.com";
        employee.yearOfBirth = 1975;
 
        System.out.println("Name: " + employee.name);
        System.out.println("Email Address: " + employee.emailAddress);
        System.out.println("Year Of Birth:" + employee.yearOfBirth);
    }
}