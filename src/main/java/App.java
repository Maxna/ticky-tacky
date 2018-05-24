
import models.TicTacToe;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;


public class App {
    public static void main(String[] args) {
        boolean programRunning = true;
        while (programRunning) {
            BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
            System.out.println("Welcome to Tic Tac Toe!");
            System.out.println("diagram");
            System.out.println("Enter a number corresponding to a square to select.");
            TicTacToe ticTacToe = new TicTacToe();
            try {
                while(!ticTacToe.winCheck()) {

                    if (ticTacToe.getCurrentUserLetter().equals("x")) {
                        System.out.println("Your move player 1(X):");
                    } else {
                        System.out.println("Your move player 2(O):");
                    }
                    String userEntry = bufferedReader.readLine();
                    ticTacToe.addLetterToBoard(Integer.parseInt(userEntry));
                    ticTacToe.turnIncrement();
                    ticTacToe.letterUpdate();
                    ticTacToe.winCheck();
                    if (ticTacToe.winCheck()) {
                        System.out.println("You won brah.");
                    }
                }
            } catch (IOException e) {
                e.printStackTrace();
            }

        }
    }
}
