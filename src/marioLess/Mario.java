package marioLess;

import java.util.Scanner;

/*
 * Задача из гарвардского курса. Ссылка:
 * https://cs50.harvard.edu/x/2024/psets/1/mario/less/
 */
public class Mario {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int height=0;
        String str;
        do {
            System.out.print("Введите высоту лестницы: ");
            str = scanner.nextLine();
            if (isNumber(str)) {
                height = Integer.parseInt(str);
            }
        } while (height <= 0);

        printLadder(height);
    }
    public static void printLadder(int height) {
        for (int i = 1; i <= height; i++) {
            for (int j = i; j < height; j++) {
                System.out.print(" ");
            }
            for (int j = 0; j < i; j++) {
                System.out.print("#");
            }
            System.out.println();
        }
    }
    public static boolean isNumber(String str) {
        int checkNum;
        for (int i = 0; i < str.length(); i++) {
            checkNum = (int)str.charAt(i) - 48;
            if (checkNum < 0 || checkNum > 9 )
                return false;
        }
        return true;
    }
}
