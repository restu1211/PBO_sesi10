import java.io.*;

public class FileMerge {
    public static void main(String[] args) {
        String[] files = {"C:\\Users\\computer 21\\Documents\\restuti22a\\file1.txt",
                          "C:\\Users\\computer 21\\Documents\\restuti22a\\file2.txt"};
        String mergeFile = "C:\\Users\\computer 21\\Documents\\restuti22a\\merge.txt";

        try (BufferedWriter bw = new BufferedWriter(new FileWriter(mergeFile))) {
            for (String file : files) {
                try (BufferedReader br = new BufferedReader(new FileReader(file))) {
                    String line;
                    while ((line = br.readLine()) != null) {
                        bw.write(line);
                        bw.newLine();
                    }
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}


