package Z_Using_IO;

import java.io.Console;

public class i_console_employee_details {
    public static void main(String[] args) {
        Console c = System.console();
        System.out.println("Enter employee id:");
        int emp_id = Integer.parseInt(c.readLine());
        System.out.println("Enter employee name:");
        String emp_name = c.readLine();
        System.out.println("Enter employee address:");
        String emp_address = c.readLine();
        System.out.println("Enter employee salary:");
        int emp_salary = Integer.parseInt(c.readLine());

        System.out.println("Employee id = " + emp_id);
        System.out.println("Employee name = " + emp_name);
        System.out.println("Employee address = " + emp_address);
        System.out.println("Employee salary = " + emp_salary);
    }
}
