package models;

public class TicTacToe {


    private String[] gameBoard = {"1","2", "3", "4", "5", "6", "7", "8", "9"};
    private int turnCounter = 2;



    private String currentUserLetter = "x";

    public TicTacToe(){
        this.gameBoard = gameBoard;
        this.turnCounter= turnCounter;
        this.currentUserLetter = currentUserLetter;
    }


    public String[] getGameBoard() {
        return gameBoard;
    }

    public int getTurnCounter() {
        return turnCounter;
    }

    public String getCurrentUserLetter() {
        return currentUserLetter;
    }

    public boolean addLetterToBoard(int squareChoice) {
        if (!gameBoard[squareChoice - 1].equals("x") || !gameBoard[squareChoice - 1].equals("o")) {
            gameBoard[squareChoice - 1] = currentUserLetter;
            return true;
        } else {
            return false;
        }
    }
    public void turnIncrement(){
        this.turnCounter += 1;
    }
    public void letterUpdate(){
        if(turnCounter%2 != 0){
            this.currentUserLetter = "o";
        } else {
            this.currentUserLetter = "x";
        }
    }


}
