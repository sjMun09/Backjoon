import java.io.*;
import java.math.BigInteger;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String line = br.readLine();
        String[] lines = line.split(",");
        int sum = 0;

        for (String item : lines) {
            int n = Integer.parseInt(item);
            sum += n;
        }
        System.out.println(sum);

    }
}

