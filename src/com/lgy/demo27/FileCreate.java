package com.lgy.demo27;

import org.junit.jupiter.api.Test;

import java.io.*;

public class FileCreate {
    public static void main(String[] args) {

    }

    @Test
    public void create01() throws IOException {
        String filePath = "d:\\news1.txt";
        File file = new File(filePath);
        file.createNewFile();
        System.out.println("文件创建成功");
    }

    public void create02() {
        String fileName = "news.txt";
        File parentFile = new File("d:\\");
        File file = new File(parentFile, fileName);
    }
    @Test
    public void readFile() throws IOException {
        String filePath = "d:\\doge.txt";
        int readData = 0;
        byte[] buf = new byte[8];
        FileInputStream fileInputStream = new FileInputStream(filePath);
        while ((readData = fileInputStream.read(buf)) != -1) {
            System.out.print(new String(buf,0,readData));
        }
        fileInputStream.close();
    }
    @Test
    public void writeFile() throws IOException {
        String filePath = "d:\\doge.txt";
        FileOutputStream fileOutputStream = null;
        fileOutputStream = new FileOutputStream(filePath);
        String str = "hello world";
        fileOutputStream.write(str.getBytes());

        fileOutputStream.close();
    }
    @Test
    public void fileIO() throws IOException {
        String srcFilePath = "d:\\微信图片_20220504200946.jpg";
        String destFilePath = "d:\\2022\\微信图片_20220504200946.jpg";

        FileInputStream fileInputStream = null;
        FileOutputStream fileOutputStream = null;

        fileInputStream = new FileInputStream(srcFilePath);
        fileOutputStream = new FileOutputStream(destFilePath);

        byte[] buf = new byte[1024];
        int readLen = 0;
        while ((readLen = fileInputStream.read(buf)) != -1) {
            fileOutputStream.write(buf, 0, readLen);
        }
        fileInputStream.close();
        fileOutputStream.close();
    }
}


