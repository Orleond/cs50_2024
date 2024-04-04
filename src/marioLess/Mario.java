package marioLess;
/*
 * Задача из гарвардского курса. Ссылка:
 * https://cs50.harvard.edu/x/2024/psets/1/mario/less/
 */
public class Mario {
    public static void main(String[] args) {
        for (int i = 1; i <= 8; i++) {
            for (int j = i; j < 8; j++) {
                System.out.print(" ");
            }
            for (int j = 0; j < i; j++) {
                System.out.print("#");
            }
            System.out.println();
        }
    }
}
