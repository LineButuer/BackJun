package 입출력과_사칙연산;

import java.util.Scanner;

public class 덧셈 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int A = scanner.nextInt(), B = scanner.nextInt(), C = scanner.nextInt();
        int sum = (A+B+C);
        System.out.println(sum);
    }
}
