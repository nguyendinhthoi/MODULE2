package ss16_io_text_file.exercise.read_file;


import java.util.ArrayList;

import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<String> list = WriteAndReadFile.readFile("src/ss16_io_text_file/exercise/read_file/list.csv");
        String[] info = null;
        for (String s : list) {
            info = s.split(",");
            Country country = new Country(Integer.parseInt(info[0]), info[1], info[2]);
            System.out.println(country.getId() + "," + country.getCode() + "," + country.getName());
        }
    }
}
