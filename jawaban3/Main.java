package jawaban3;


import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        LotreBoard game = new LotreBoard();
        game.generateBoard();

        boolean hidup = true;

        while (hidup) {
            game.displayBoard();

            System.out.print("\nMasukkan baris tebakan anda (baris dan kolom): ");
            int row = input.nextInt();
            int col = input.nextInt();

            boolean aman = game.guess(row, col);

            if (!aman) {
                System.out.println("\nBOOM! Anda menemukan bom! Permainan berakhir.");
                hidup = false;
            } else if (game.isGameOver()) {
                System.out.println("Kotak Aman");
                hidup = false;
            }
        }

        System.out.println("\n=== HASIL AKHIR ===");
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 5; j++) {
                if (game.data[i][j] == 1) {
                    System.out.print("X ");
                } else {
                    System.out.print("O ");
                }
            }
            System.out.println();
        }
    }
}
