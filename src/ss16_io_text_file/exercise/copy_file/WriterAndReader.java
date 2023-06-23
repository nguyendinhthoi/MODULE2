package ss16_io_text_file.exercise.copy_file;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class WriterAndReader {
    public static void writeFile(String pathFile, List<String> text, boolean append) {
        File file = new File(pathFile);
        FileWriter fileWriter = null;
        BufferedWriter bufferedWriter = null;

        try {
            fileWriter = new FileWriter(file, append);
            bufferedWriter = new BufferedWriter(fileWriter);
            int num = 0;
            for (String s : text) {
                bufferedWriter.write(s);
                num++;
                bufferedWriter.newLine();
            }
            bufferedWriter.write("Tổng số kí tự là "+num);
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                bufferedWriter.close();
                fileWriter.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }

    public static List<String> readFile(String pathFile) {
        List<String> stringList = new ArrayList<>();
        File file = new File(pathFile);
        try {
            FileReader fileReader = new FileReader(file);
            BufferedReader bufferedReader = new BufferedReader(fileReader);
            String line = "";
            while ((line = bufferedReader.readLine()) != null) {
                stringList.add(line);
            }
            bufferedReader.close();
            fileReader.close();
        } catch (IOException e) {
            System.out.println("Tệp nguồn không tồn tại");
        }
        return stringList;
    }
}
