package Z_Using_IO;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

class Teacher {
    int id, salary;
    String name, address, department;

    Teacher(int id, String name, String address, String department, int salary) {
        this.id = id;
        this.name = name;
        this.address = address;
        this.department = department;
        this.salary = salary;
    }

    void displayDetails() {
        System.out.println("Id =" + id);
        System.out.println("Name =" + name);
        System.out.println("Address =" + address);
        System.out.println("Department =" + department);
        System.out.println("Salary =" + salary);
    }
}

public class m_BufferedReader_teacher_details {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Please enter the Teacher's details");
        System.out.print("Enter id:");
        int t_id = Integer.parseInt(reader.readLine());

        System.out.print("Enter name:");
        String t_name = reader.readLine();

        System.out.print("Enter address:");
        String t_address = reader.readLine();

        System.out.print("Enter department:");
        String t_dept = reader.readLine();

        System.out.print("Enter salary:");
        int t_salary = Integer.parseInt(reader.readLine());

        Teacher t1 = new Teacher(t_id, t_name, t_address, t_dept, t_salary);
        System.out.println("\nShowing the details of teacher");
        t1.displayDetails();
    }
}
