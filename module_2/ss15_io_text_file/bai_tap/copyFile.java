package ss15_io_text_file.bai_tap;

import java.io.*;

public class copyFile {
    public static void main(String[] args) throws IOException {
        InputStream inStream = null;
        OutputStream outStream = null;

        try {
            inStream = new FileInputStream(new File("E:\\GitProject\\module2\\text.txt"));
            outStream = new FileOutputStream(new File("E:\\GitProject\\module2\\numbers.txt"));

            int length;
            byte[] buffer = new byte[1024];

            while ((length = inStream.read(buffer)) > 0) {
                outStream.write(buffer, 0, length);
            }
            System.out.println("File is copied!");
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            inStream.close();
            outStream.close();
        }
    }
    }

}
