package algorithm;

import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.function.*;
import java.util.regex.*;
import java.util.stream.*;
import static java.util.stream.Collectors.joining;
import static java.util.stream.Collectors.toList;

public class Problem5 {

    /*
     * Complete the 'timeConversion' function below.
     *
     * The function is expected to return a STRING.
     * The function accepts STRING s as parameter.
     */

    public static String timeConversion(String s) {
        String[] split = s.split(":");
        if (s.contains("PM")) {
            int hh = Integer.parseInt(split[0]);
            split[0] = String.valueOf(hh==12 ? 12 : hh+12);
            split[2] = split[2].replace("PM","");
        }
        if(s.contains("AM")) {
            split[0] = split[0].equals("12") ? "00" : split[0];
            split[2] = split[2].replace("AM","");
        }
        String answer = String.join(":",split);
        return answer;
    }

}

class Solution5 {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        String s = bufferedReader.readLine();

        String result = Problem5.timeConversion(s);

        bufferedWriter.write(result);
        bufferedWriter.newLine();

        bufferedReader.close();
        bufferedWriter.close();
    }
}
