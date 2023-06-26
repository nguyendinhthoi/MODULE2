package ss17_io_binary.copy_file;


import java.util.ArrayList;
import java.util.List;

public class Main {
    private static final String SOURCE_PATH = "src/ss17_io_binary/copy_file/source.dat";
    private static final String TARGET_PATH = "src/ss17_io_binary/copy_file/target.dat";

    public static void main(String[] args) {
        List<String> stringList1 = new ArrayList<>();
        stringList1.add(new String("thoi dep trai"));
        stringList1.add(new String("lam dep trai"));

        WriterAndReader.writeFileBinary(SOURCE_PATH, stringList1);
        List<String> stringList = WriterAndReader.readFileBinary(SOURCE_PATH);
        WriterAndReader.writeFileBinary(TARGET_PATH, stringList);
        for (String s : stringList) {
            System.out.println(s);
        }
    }
}
