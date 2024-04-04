package marioMore;
/*
 * Задача из гарвардского курса. Ссылка:
 * https://cs50.harvard.edu/x/2024/psets/1/mario/more/
 *
 * In a file called mario.c in a folder called mario-more, implement a program in C
 * that recreates that pyramid, using hashes (#) for bricks, as in the below:
 *        #  #
 *       ##  ##
 *      ###  ###
 *     ####  ####
 *    #####  #####
 *   ######  ######
 *  #######  #######
 * ########  ########
 *
 * And let’s allow the user to decide just how tall the pyramids should be by first
 * prompting them for a positive int between, say, 1 and 8, inclusive.
 *
 * Notice that width of the “gap” between adjacent pyramids is equal to the width of two hashes,
 * irrespective of the pyramids’ heights.
 */
import java.util.Scanner;
public class Mario {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int height=0;
        String str;
        do {
            System.out.print("Введите высоту лестницы (от 1 до 8): ");
            str = scanner.nextLine();
            if (isNumber(str)) {
                height = Integer.parseInt(str);
            }
        } while (height <= 0 || height > 8);

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
            System.out.print("  ");
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
