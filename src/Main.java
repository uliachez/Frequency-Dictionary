import java.io.IOException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        Frequency_Counter frequency_counter = new Frequency_Counter();
        Work_with_Files work_with_files = new Work_with_Files();
        System.out.println("Текущая рабочая директория: " + System.getProperty("user.dir"));
        System.out.print("Enter the name of the input file: ");
        String input_file_name = scan.nextLine();
        System.out.print("Enter the name of the output file: ");
        String output_file_name = scan.nextLine();
        try {
            String content = work_with_files.ReadFile(input_file_name);
            frequency_counter.Count(content);
            work_with_files.WriteFile(output_file_name, frequency_counter.getFrequencies());
            System.out.println("The results have been successfully written to a file.");
        }
        catch (IOException ex) {
            System.out.println("Error: " + ex.getMessage());
        }
    }
}