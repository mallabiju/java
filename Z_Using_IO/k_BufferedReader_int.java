package Z_Using_IO;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class k_BufferedReader_int {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter a number:");
        int num = Integer.parseInt(reader.readLine());
        System.out.println("The number = " + num);
    }
}
