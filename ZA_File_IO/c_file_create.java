package ZA_File_IO;

import java.io.File;
import java.io.IOException;

public class c_file_create {
    public static void main(String[] args) {
        File file = new File("D:/SCJAVA/ZA_File_IO/sita.txt");
        if (!file.exists()) {
            try {
                file.createNewFile();
            } catch (IOException e) {
                e.printStackTrace();
            }
        } else {
            System.out.println("File already exists.");
        }

    }
}
