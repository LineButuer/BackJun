package number2;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int H = scanner.nextInt(), M = scanner.nextInt();
        if (H >= 0 && H <= 23 && M >= 0 && M <= 59) {
            if (H != 0 && M == M) {
                int c = H - 1;
                int d = M + 15;
                System.out.println(c + " " + d);
            } else if (H == 0 && M == M) {
                H = 23;
                int d = M + 15;
                System.out.println(H + " " + d);
            }
        }
    }
}