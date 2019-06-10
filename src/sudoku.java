/*Jak przechowałbyś stan sudoku? Napisz program, który stworzy instancje tablicy służących do przechowywania sudoku i
 uzupełnij ją przykładową planszą.
 */
public class sudoku {
    public static void main(String[] args) {
        int [] [] sudoku = new int[9][9];
        sudoku[0][0] = 2;
        sudoku[0][2] = 6;
        sudoku[0][7] = 8;
        sudoku[1][3] = 5;
        sudoku[1][4] = 7;
        sudoku[1][7] = 4;
        sudoku[2][2] = 7;
        sudoku[2][6] = 3;
        sudoku[2][8] = 5;
        sudoku[3][0] = 6;
        sudoku[3][3] = 7;
        sudoku[3][5] = 1;
        sudoku[3][6] = 5;
        sudoku[3][8] = 2;
        sudoku[4][3] = 3;
        sudoku[4][5] = 8;
        sudoku[5][0] = 7;
        sudoku[5][2] = 1;
        sudoku[5][3] = 2;
        sudoku[5][5] = 9;
        sudoku[5][8] = 6;
        sudoku[6][0] = 5;
        sudoku[6][2] = 3;
        sudoku[6][6] = 6;
        sudoku[7][1] = 9;
        sudoku[7][4] = 2;
        sudoku[7][2] = 7;
        sudoku[8][1] = 6;
        sudoku[8][6] = 4;
        sudoku[8][8] = 8;

    }
}
