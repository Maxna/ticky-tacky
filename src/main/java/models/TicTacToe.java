package models;

public class TicTacToe {
    private String[] gameBoard = {"1","2", "3", "4", "5", "6", "7", "8", "9"};
    private int turnCounter = 2;

    public TicTacToe(){
        this.gameBoard = gameBoard;
        this.turnCounter= turnCounter;
    }
}
