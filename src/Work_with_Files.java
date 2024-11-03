import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class Work_with_Files {
    public String ReadFile(String file_name) throws IOException {
       StringBuilder content = new StringBuilder();
       File f = new File(file_name);
       if (!f.exists() || !f.isFile()) {
           throw new IOException("The file does not exist.");
       }
       try (BufferedReader reader = new BufferedReader(new FileReader(f))) {
           String line;
           while ((line = reader.readLine()) != null) {
               content.append(line);
           }
       }
       return content.toString();
    }
    public void WriteFile(String file_name, int[] frequency_array) throws IOException {
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(file_name))) {
            for (int i = 0; i < frequency_array.length; i++) {
                if (frequency_array[i] > 0) {
                    char ch = (i < 26) ? (char) ('A' + i) : (char) ('a' + (i - 26));
                    writer.write(ch + ": " + frequency_array[i]);
                    writer.newLine();
                }
            }
        }
    }
}
