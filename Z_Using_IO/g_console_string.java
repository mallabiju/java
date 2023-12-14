package Z_Using_IO;

public class g_console_string {
    public static void main(String[] args) {
        System.out.print("Enter your name :");
        String name = System.console().readLine();
        System.out.println("Your name is :" + name);
    }
}
