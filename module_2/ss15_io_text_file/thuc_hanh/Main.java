package ss15_io_text_file.thuc_hanh;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public void writeToFile(List<Student> list) {
        try {

            FileWriter fileWriter = new FileWriter("numbers.txt");

            BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);


            for (Student s : list) {
                bufferedWriter.write(s.toString());
                bufferedWriter.newLine();
            }
            bufferedWriter.close();
            fileWriter.close();

        } catch (Exception e) {

        }


    }

    public List<Student> readFromFile() {
        List<Student> list = new ArrayList<>();
        try {
            FileReader fileReader = new FileReader("numbers.txt");
            BufferedReader bufferedReader = new BufferedReader(fileReader);
            String line = "";
            while (true) {
                line = bufferedReader.readLine();
                if (line == null) {
                    break;
                }
                String[] txt = line.split(";");
                String name = txt[0];
                int age = Integer.parseInt(txt[1]);
                double mark = Double.parseDouble(txt[2]);
                list.add(new Student(name, age, mark));
                System.out.println(line);
            }
        } catch (Exception e) {

        }
        return list;

    }

    public static void main(String[] args) {
        Main m = new Main();
        List<Student> list = m.readFromFile();
        for (Student s : list) {
            System.out.println(s);
        }


    }
}
