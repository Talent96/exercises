package chapterSeven;

import java.util.Arrays;

public class MultiArray {
    char[][] letters = new char[3][3];
    public void arr() {

        letters[0][0] = 'O';
        letters[1][0] = 'X';
        letters[2][0] = 'X';
        letters[0][1] = 'X';
        letters[0][2] = 'O';
        letters[1][1] = 'O';
        letters[1][2] = 'O';
        letters[2][1] = 'O';
        letters[2][2] = 'X';

        for (int i = 0; i < letters.length; i++) {
            for (int j = 0; j < letters[i].length; j++) {
                System.out.print(" " + letters[i][j]);
            }
            System.out.println(" ");
        }
    }
    public void displayNumbers(){
        char[][] letters = new char[3][3];
        letters[0][0] = 'O';
        letters[1][0] = 'X';
        letters[2][0] = 'X';
        letters[0][1] = 'X';
        letters[0][2] = 'O';
        letters[1][1] = 'O';
        letters[1][2] = 'O';
        letters[2][1] = 'O';
        letters[2][2] = 'X';
            for (int i = 0; i < letters.length; i++) {
                for (int j = 0; j < letters[i].length; j++) {
                    if (letters[i][j] == 'X') {
                        letters[i][j] = '1';
                    } else if (letters[i][j] == 'O') {
                        letters[i][j] = '0';
                    }
                    System.out.print(" " + letters[i][j]);
                }
                System.out.println();
            }
        }
}

