package Z_Using_IO;

import java.util.Scanner;

public class a_scanner_int {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter roll number:");
        int roll = sc.nextInt();
        System.out.println("Roll number = " + roll);
        sc.close();
    }
}
