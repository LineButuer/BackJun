package 입출력과_사칙연산;

import java.util.Scanner;

public class 곱셈 {
    public static void main(String[] args) {
        Scanner scanner =new Scanner(System.in);
        int a = scanner.nextInt(), b = scanner.nextInt();
        System.out.println(a*(b%10));
        System.out.println(a*(b%100-5)/10);
        System.out.println(a*(b/100));
        System.out.println(a*b);
    }
}
