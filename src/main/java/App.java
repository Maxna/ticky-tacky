
import models.TicTacToe;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;


public class App {
    public static void main(String[] args) {
        boolean programRunning = true;
        while (programRunning) {
            BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
            System.out.println("Welcome to Tic Tac Toe!");
            System.out.println("Enter a number corresponding to a square to select.");

            String [] firstBoardLine= {"1","|", "2","|","3"};
            String [] secondBoardLine= {"4","|", "5","|","6"};
            String [] thirdBoardLine= {"7","|", "8","|","9"};

            TicTacToe ticTacToe = new TicTacToe();
            try {
                while(!ticTacToe.winCheck()) {

                    for (String element: firstBoardLine)
                    {
                        System.out.print(element);
                    }
                    System.out.println("\n-----");
                    for (String element: secondBoardLine)
                    {
                        System.out.print(element);
                    }
                    System.out.println("\n-----");
                    for (String element: thirdBoardLine)
                    {
                        System.out.print(element);
                    }
                    System.out.println("\n");


                    if (ticTacToe.getCurrentUserLetter().equals("x")) {
                        System.out.println("Your move player 1(X):");
                    } else {
                        System.out.println("Your move player 2(O):");
                    }
                    String userEntry = bufferedReader.readLine();

                    if(!ticTacToe.addLetterToBoard(Integer.parseInt(userEntry))){
                        System.out.println("That has already been chosen");
                    } else {
                        ticTacToe.addLetterToBoard(Integer.parseInt(userEntry));
                        if(userEntry.equals("1")){
                            firstBoardLine[0]= ticTacToe.getCurrentUserLetter();
                        } else  if (userEntry.equals("2")){
                            firstBoardLine[2]= ticTacToe.getCurrentUserLetter();
                        } else  if (userEntry.equals("3")){
                            firstBoardLine[4]= ticTacToe.getCurrentUserLetter();
                        } else  if (userEntry.equals("4")){
                            secondBoardLine[0]= ticTacToe.getCurrentUserLetter();
                        } else  if (userEntry.equals("5")){
                            secondBoardLine[2]= ticTacToe.getCurrentUserLetter();
                        } else  if (userEntry.equals("6")){
                            secondBoardLine[4]= ticTacToe.getCurrentUserLetter();
                        } else  if (userEntry.equals("7")){
                            thirdBoardLine[0]= ticTacToe.getCurrentUserLetter();
                        } else  if (userEntry.equals("8")){
                            thirdBoardLine[2]= ticTacToe.getCurrentUserLetter();
                        } else  if (userEntry.equals("9")) {
                            thirdBoardLine[4] = ticTacToe.getCurrentUserLetter();
                        } else System.out.println("error");
                        ticTacToe.turnIncrement();
                        ticTacToe.letterUpdate();
                        ticTacToe.winCheck();
                        if(ticTacToe.drawCheck()){
                            System.out.println("It's a tie!");
                        }
                    }
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
