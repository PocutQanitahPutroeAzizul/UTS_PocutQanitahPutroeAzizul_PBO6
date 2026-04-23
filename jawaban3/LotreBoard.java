package jawaban3;

import java.util.Random;

public class LotreBoard {
    char[][] board = new char[4][5];
    boolean[][] revealed = new boolean[4][5];
    int[][] data = new int[4][5];

    public void generateBoard() {
        Random rand = new Random();

        int bom = 0;
        while (bom < 2) {
            int r = rand.nextInt(4);
            int c = rand.nextInt(5);

            if (data[r][c] == 0) {
                data[r][c] = 1;
                bom++;
            }
        }
    }

    public void displayBoard() {
        System.out.println("\nWelcome to E-Lottery Gosok");

        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 5; j++) {
                if (!revealed[i][j]) {
                    System.out.print("* ");
                } else {
                    if (data[i][j] == 1) {
                        System.out.print("X ");
                    } else {
                        System.out.print("O ");
                    }
                }
            }
            System.out.println();
        }
    }

    public boolean guess(int row, int col) {

        if (revealed[row][col]) {
            System.out.println("Kotak sudah dibuka!");
            return true;
        }

        revealed[row][col] = true;

        if (data[row][col] == 1) {
            return false;
        }

        return true;
    }

    public boolean isGameOver() {
        int amanTerbuka = 0;

        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 5; j++) {
                if (revealed[i][j] && data[i][j] == 0) {
                    amanTerbuka++;
                }
            }
        }

        return amanTerbuka == 18;
    }
}

