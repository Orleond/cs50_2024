package marioLess;

/*
 * Задача из гарвардского курса. Ссылка:
 * https://cs50.harvard.edu/x/2024/psets/1/mario/less/
 *
 * In a file called mario.c in a folder called mario-less, implement a program in C
 * that recreates that pyramid, using hashes (#) for bricks, as in the below:
 *        #
 *       ##
 *      ###
 *     ####
 *    #####
 *   ######
 *  #######
 * ########
 *
 * But prompt the user for an int for the pyramid’s actual height, so that the program
 * can also output shorter pyramids like the below:
 *        #
 *       ##
 *      ###
 *
 * Re-prompt the user, again and again as needed, if their input is not greater than 0 or not an int altogether.
 */
import java.util.Scanner;

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
