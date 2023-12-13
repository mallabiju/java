package Z_Console_IO;

public class a_console {
    public static void main(String[] args) {
        System.out.print("Enter your name :");
        String name = System.console().readLine();
        System.out.println("Your name is :" + name);
    }
}
