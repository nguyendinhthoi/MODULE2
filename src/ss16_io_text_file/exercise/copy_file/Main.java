package ss16_io_text_file.exercise.copy_file;

import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<String> stringList = WriterAndReader.readFile("src/ss16_io_text_file/exercise/copy_file/source_file.csv");
        WriterAndReader.writeFile("src/ss16_io_text_file/exercise/copy_file/target_file.csv",stringList,false);
    }
}
