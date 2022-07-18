package com.lgy.demo27;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class HomeWork01 {
    public static void main(String[] args) throws IOException {
        File file = new File("d:\\testDemo");
        if (!file.exists()) {
            if (file.mkdirs()) {
                System.out.println("创建文件夹");
            } else {
                System.out.println("目录创建失败");
            }
        }

        String fileName = "d:\\testDemo\\hello.txt";
        File file1 = new File(fileName);
        if (!file1.exists()) {
            if (file1.createNewFile()) {
                System.out.println("文件创建成功");
                BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(file1));
                bufferedWriter.write("hello world 哈哈哈");
                bufferedWriter.close();
            } else {
                System.out.println("文件创建失败");
            }
        } else {
            System.out.println("文件已经存在");
        }
    }
}
