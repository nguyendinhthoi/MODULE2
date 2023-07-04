package case_study.utils;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class ReadAndWrite {
    public static List<String> readFile(String pathFile) {
        File file = new File(pathFile);
        List<String> stringList = new ArrayList<>();
        try {
            FileReader fileReader = new FileReader(file);
            BufferedReader bufferedReader = new BufferedReader(fileReader);
            String line = "";
            while ((line = bufferedReader.readLine()) != null) {
                stringList.add(line);
            }
        } catch (FileNotFoundException e) {
            System.out.println("File Not Found!!!");
        } catch (IOException e) {
            e.printStackTrace();
        }
        return stringList;
    }

    public static void writeFile(String pathFile, List<String> stringList, boolean appand) {
        File file = new File(pathFile);
        try {
            FileWriter fileWriter = new FileWriter(file, appand);
            BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);
            for (String s : stringList) {
                bufferedWriter.write(s);
                bufferedWriter.newLine();
            }
            bufferedWriter.close();
            fileWriter.close();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
