package org.bankAccountApp.utilities;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class CSVReader {
    static String line;
    public static List<String[]> readCSVFile(String file) {
        List<String[]> list = new LinkedList<>();
        try {
            BufferedReader br = new BufferedReader(new FileReader(file));
            while((line = br.readLine()) != null) {
                String[] dataRow = line.split(",");
                list.add(dataRow);
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
          e.printStackTrace();
        }
        return  list;
    }
}
