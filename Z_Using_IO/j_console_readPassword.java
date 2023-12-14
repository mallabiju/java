package Z_Using_IO;

import java.io.Console;

public class j_console_readPassword {
    public static void main(String[] args) {
        Console c = System.console();
        System.out.println("Enter a password:");
        char[] ch = c.readPassword();
        String pass = String.valueOf(ch);
        System.out.println("The password = " + pass);
    }
}
