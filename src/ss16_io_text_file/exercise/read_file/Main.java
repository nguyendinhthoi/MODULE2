package ss16_io_text_file.exercise.read_file;


import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<String> list = WriteAndReadFile.readFile("src/ss16_io_text_file/exercise/read_file/list.csv");
        String[] info = null;
        for (String s : list) {
            info = s.split(",");
        }
        System.out.println(Arrays.toString(info));
    }
}
