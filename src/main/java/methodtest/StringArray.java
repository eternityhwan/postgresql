package methodtest;

import java.util.Arrays;

public class StringArray {
    public static void main(String[] args) {
        String[] array = new String[5];

        array[0] = "ㄴㅁㅋ";
        array[1] = "ㅁㅈㅎ";
        array[2] = "ㅁㅈㅎ";
        array[3] = "ㅁㅈㅎ";
        array[4] = "ㅁㅈㅎ";

        System.out.println(array[0]);
        System.out.println(array[1]);
        System.out.println(array[2]);
        System.out.println(array[3]);
        System.out.println(array[4]);

        for(int i = 0; i<array.length ; i+=1){
            System.out.println(array[i]);
        }

    }
}
