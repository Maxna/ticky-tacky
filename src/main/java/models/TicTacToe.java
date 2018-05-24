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

    public void setGameBoardForTest(int i, String letter) {
        gameBoard[i] = letter;
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
    public boolean winCheck(){
        if (gameBoard[0].equals(gameBoard[1]) && gameBoard[1].equals(gameBoard[2])) {
            return true;
        } else if (gameBoard[3].equals(gameBoard[4]) && gameBoard[4].equals(gameBoard[5])) {
            return true;
        } else if (gameBoard[6].equals(gameBoard[7]) && gameBoard[7].equals(gameBoard[8])) {
            return true;
        } else if (gameBoard[0].equals(gameBoard[3]) && gameBoard[3].equals(gameBoard[6])) {
            return true;
        } else if (gameBoard[1].equals(gameBoard[4]) && gameBoard[4].equals(gameBoard[7])) {
            return true;
        } else if (gameBoard[2].equals(gameBoard[5]) && gameBoard[5].equals(gameBoard[8])) {
            return true;
        } else {
            return false;
        }
    }


}
