// this program explain about the use of next() and nextLine() whilst
// taking multiple string consecutively, and "sc.nextLine()" as its solution.
package Z_Console_IO;

import java.util.Scanner;

public class c_scanner_student_info {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter roll number:");
        int roll = sc.nextInt();

        System.out.print("Enter name:");
        sc.nextLine();
        String name = sc.nextLine();

        System.out.print(" Enter address:");
        String address = sc.nextLine();

        System.out.println("Roll number = " + roll);
        System.out.println("Name = " + name);
        System.out.println("Address = " + address);
        sc.close();
    }
}
