package models;

import org.junit.Test;

import static org.junit.Assert.*;

public class TicTacToeTest {
    @Test
    public void newTicTacToe_instantiatesCorrectly() throws Exception {
        TicTacToe testTicTacToe = new TicTacToe();
        assertEquals(true, testTicTacToe instanceof TicTacToe);
    }

    @Test
    public void addLetterToBoard_addsXToBoardArray_x() throws Exception {
        TicTacToe testTicTacToe = new TicTacToe();
        testTicTacToe.addLetterToBoard(1);
        assertEquals("x", testTicTacToe.getGameBoard()[0]);
    }

    @Test
    public void turnUpdate_changesCurrentTurnCounter_3() throws Exception {
        TicTacToe testTicTacToe = new TicTacToe();
        testTicTacToe.addLetterToBoard(1);
        testTicTacToe.turnIncrement();
        assertEquals(3, testTicTacToe.getTurnCounter());
    }

    @Test
    public void letterUpdate_changesCurrentUserLetterBasedOnTurn_o() throws Exception {
        TicTacToe testTicTacToe = new TicTacToe();
        testTicTacToe.addLetterToBoard(1);
        testTicTacToe.turnIncrement();
        testTicTacToe.letterUpdate();
        assertEquals("o", testTicTacToe.getCurrentUserLetter());
    }

    @Test
    public void addLetterToBoards_addsOToBoardOnSecondTurn_o() throws Exception {
        TicTacToe testTicTacToe = new TicTacToe();
        testTicTacToe.addLetterToBoard(1);
        testTicTacToe.turnIncrement();
        testTicTacToe.letterUpdate();
        testTicTacToe.addLetterToBoard(2);
        assertEquals("o", testTicTacToe.getGameBoard()[1]);
    }

    @Test
    public void winCheck_checksForAHorizontalWinAt0_true() throws Exception {
        TicTacToe testTicTacToe = new TicTacToe();
        testTicTacToe.setGameBoardForTest(0, "x");
        testTicTacToe.setGameBoardForTest(1, "x");
        testTicTacToe.setGameBoardForTest(2, "x");
        assertEquals(true, testTicTacToe.winCheck());
    }
    @Test
    public void winCheck_checksForAHorizontalWinAt3_true() throws Exception {
        TicTacToe testTicTacToe = new TicTacToe();
        testTicTacToe.setGameBoardForTest(3, "x");
        testTicTacToe.setGameBoardForTest(4, "x");
        testTicTacToe.setGameBoardForTest(5, "x");
        assertEquals(true, testTicTacToe.winCheck());
    }
    @Test
    public void winCheck_checksForAHorizontalWinAt6_true() throws Exception {
        TicTacToe testTicTacToe = new TicTacToe();
        testTicTacToe.setGameBoardForTest(6, "x");
        testTicTacToe.setGameBoardForTest(7, "x");
        testTicTacToe.setGameBoardForTest(8, "x");
        assertEquals(true, testTicTacToe.winCheck());
    }
}