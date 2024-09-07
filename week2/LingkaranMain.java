package week2;

import java.util.Scanner;

public class LingkaranMain {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Lingkaran ling = new Lingkaran();

        System.out.print("Enter the radius of the circle: ");
        ling.r = sc.nextDouble();

        ling.displayResult();

        sc.close();
    }
}
