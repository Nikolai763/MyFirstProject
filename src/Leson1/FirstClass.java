package Leson1;

import java.io.IOException;
import java.util.Arrays;

public class FirstClass {
    public static void main(String[] args ) throws IOException{
        int [] massive = new int[10];
        for(int a = 0; a < massive.length; a++){
            int r = (int)(Math.random()* 20);
            massive[a] = r;

        }
        System.out.println(Arrays.toString(massive));
    }
}
