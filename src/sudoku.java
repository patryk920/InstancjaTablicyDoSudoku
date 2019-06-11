/*Jak przechowałbyś stan sudoku? Napisz program, który stworzy instancje tablicy służących do przechowywania sudoku i
 uzupełnij ją przykładową planszą.
 */
public class sudoku {
    public static void main(String[] args) {
        int[][] tab = new int[9][9];
        tab[0][0] = 2;
        tab[0][2] = 6;
        tab[0][7] = 8;
        tab[1][3] = 5;
        tab[1][4] = 7;
        tab[1][7] = 4;
        tab[2][2] = 7;
        tab[2][6] = 3;
        tab[2][8] = 5;
        tab[3][0] = 6;
        tab[3][3] = 7;
        tab[3][5] = 1;
        tab[3][6] = 5;
        tab[3][8] = 2;
        tab[4][3] = 3;
        tab[4][5] = 8;
        tab[5][0] = 7;
        tab[5][2] = 1;
        tab[5][3] = 2;
        tab[5][5] = 9;
        tab[5][8] = 6;
        tab[6][0] = 5;
        tab[6][2] = 3;
        tab[6][6] = 6;
        tab[7][1] = 9;
        tab[7][4] = 2;
        tab[7][2] = 7;
        tab[8][1] = 6;
        tab[8][6] = 4;
        tab[8][8] = 8;

    }
}
