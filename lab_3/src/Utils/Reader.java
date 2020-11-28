package Utils;

import java.io.*;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

public class Reader {
    public LinkedList<Integer> readList(String filePath){
        File file = new File(filePath);
        LinkedList<Integer> integers = new LinkedList<>();
        try {
            Scanner scanner = new Scanner(file);
            while (scanner.hasNext()) {
                if (scanner.hasNextInt()) {
                    integers.add(scanner.nextInt());
                } else {
                    scanner.next();
                }
            }
            scanner.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        return integers;
    }

    public int[] readArray(String filePath){
        File file = new File(filePath);
        byte[] bytes = new byte[(int) file.length()];
        FileInputStream fis;
        try {
            fis = new FileInputStream(file);
            fis.read(bytes);
            fis.close();
            String[] valueStr = new String(bytes).trim().split("\\s+");
            int[] tall = new int[valueStr.length];
            for (int i = 0; i < valueStr.length; i++){
                tall[i] = Integer.parseInt(valueStr[i]);
            }
            return tall;
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return new int[0];
    }

    public List<String> readListOfStrings(String filePath){
        BufferedReader abc = null;
        String line;
        List<String> lines = new ArrayList<String>();

        try {
            abc = new BufferedReader(new FileReader(filePath));
            while((line = abc.readLine()) != null) {
                lines.add(line);
            }
            abc.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return lines;
    }
}
