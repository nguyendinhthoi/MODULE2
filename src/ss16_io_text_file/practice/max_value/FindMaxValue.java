package ss16_io_text_file.practice.max_value;

import java.util.List;

public class FindMaxValue {
    public static int findMax(List<Integer> numbers) {
        int max = numbers.get(0);
        for (int i = 0; i < numbers.size(); i++) {
            if (max < numbers.get(i)) {
                max = numbers.get(i);
            }
        }
        return max;
    }

    public static void main(String[] args) {
        ReadAndWriteFile readAndWriteFile = new ReadAndWriteFile();
        List<Integer> numbers = readAndWriteFile.readFile("src/ss16_io_text_file/practice/max_value/numbers.csv");
        int maxValue = findMax(numbers);
        readAndWriteFile.writeFile("src/ss16_io_text_file/practice/max_value/result.csv", maxValue);
    }
}
