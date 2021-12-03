package Codeup100;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;

public class Pro74nono {
    public static void main(String[] args) throws IOException {

        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));

        char s = bf.readLine().charAt(0); /// BufferReader는 readLine()으로 밖에 못 읽음, chatAt(0) 인덱스는 오직 0 char니까.

        for (int i = 95; i<=(int)s; i++) {
            System.out.println((char)i + " ");
        }
    }
}
