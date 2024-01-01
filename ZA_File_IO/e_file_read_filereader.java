package ZA_File_IO;

import java.io.FileReader;
import java.io.IOException;

public class e_file_read_filereader {
    public static void main(String[] args) throws IOException {
        FileReader fr = new FileReader("D:/SCJAVA/ZA_File_IO/ram.txt");
        int a;
        while ((a = fr.read()) != -1) {
            System.out.print((char)a);
        }
        fr.close();
    }
}
