package Z_Console_IO;

public class d_console_io_int {
    public static void main(String[] args) {
        System.out.println("Enter a number:");
        String strValue = System.console().readLine();
        int num = Integer.parseInt(strValue);
        System.out.println("You entered " + num);
    }
}
