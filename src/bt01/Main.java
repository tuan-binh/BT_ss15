package bt01;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        try {
            int a = sc.nextInt();
            int b = sc.nextInt();
            int result = a + b;
            System.out.println("Tổng: " + result);
        } catch (NumberFormatException e) {
            e.printStackTrace();
        }
    }
}
