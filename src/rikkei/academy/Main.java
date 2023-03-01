package rikkei.academy;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập giới hạn số nguyên tố muốn in ra:");
        int number = scanner.nextInt();

        boolean check;
        for (int i = 2; i <= number; i++) {
            check = true;
            for (int j = 2; j <= Math.sqrt(i); j++) {
                if (i % j == 0){
                    check = false;
                    break;
                }
            }if (check){
                System.out.print(i + " ");
            }
        }
    }
}
