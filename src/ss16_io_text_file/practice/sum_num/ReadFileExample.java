package ss16_io_text_file.practice.sum_num;

import java.io.*;


public class ReadFileExample {

    public void readFileText(String filePath) {
        try {
            File file = new File(filePath);

            if (!file.exists()) {
                throw new FileNotFoundException();
            }

            BufferedReader bufferedReader = new BufferedReader(new FileReader(file));
            String line = "";
            int sum = 0;
            while ((line = bufferedReader.readLine()) != null) {
                System.out.println(line);
                sum += Integer.parseInt(line);
            }
            bufferedReader.close();
            System.out.println("Tổng là " + sum);
        } catch (Exception e) {
            System.out.println("File không tồn tại or nội dung có lỗi!");
        }
    }
}
