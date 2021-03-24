package ThirdTask;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ReplacingZero {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        long number = Long.parseLong(reader.readLine());

        System.out.println(replace(number));
    }

    public static long replace(long number) {
        StringBuilder sb = new StringBuilder(String.valueOf(number));
        sb.setCharAt(sb.lastIndexOf("0"), '1');
        return Long.parseLong(sb.toString());
    }
}
/*
Здесь рассмотрен случай работы с числом в десятеричном представлении.
Если в задании имелись в виду числа в двоичном представлении, то его решением будет выражение
x | (x+1)
 */