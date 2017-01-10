import java.util.Scanner;

public class TheGreatXor {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int q = in.nextInt();
        for(int a0 = 0; a0 < q; a0++){
            long x = in.nextLong();

            String binary = new StringBuilder(Long.toBinaryString(x)).reverse().toString();
            long result = 0;
            for (int i = 0; i < binary.length(); i++) {
                if (binary.charAt(i) == '0') {
                    result += Math.pow(2, i);
                }
            }

            System.out.println(result);
        }
    }
}
