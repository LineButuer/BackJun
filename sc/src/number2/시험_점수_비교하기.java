package number2;

import java.util.Scanner;

public class 시험_점수_비교하기 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        if(a>=90&&a<101){
            System.out.println("A");
        } else if (a>=80) {
            System.out.println("B");
        }else if(a>=70){
            System.out.println("C");
        } else if (a>=60) {
            System.out.println("D");
        }else {
            System.out.println("F");
        }
    }
}
