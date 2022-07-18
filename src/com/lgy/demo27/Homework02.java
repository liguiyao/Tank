package com.lgy.demo27;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class Homework02 {
    public static void main(String[] args) throws IOException {

        String filePath = "d:\\testDemo\\aa.txt";
        BufferedReader bufferedReader = null;
        String line = "";
        int lineNum = 0;

        bufferedReader = new BufferedReader(new FileReader(filePath));
        while ((line = bufferedReader.readLine()) != null) {
            System.out.println(++lineNum + line);
        }

        if (bufferedReader != null) {
            bufferedReader.close();
        }

    }
}
