import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class BoatTrips {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int c = in.nextInt();
        int m = in.nextInt();
        int[] p = new int[n];
        int max = 0;
        for(int p_i=0; p_i < n; p_i++){
            int passangers = in.nextInt();
            p[p_i] = passangers;
            if (passangers > max) {
                max = passangers;
            }
        }

        if (c * m < max) {
            System.out.print("No");
        } else {
            System.out.print("Yes");
        }
    }
}
