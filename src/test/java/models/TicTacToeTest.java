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
    public void letterUpdate_changesCurrentUserLetterBasedOnTurn_3() throws Exception {
        TicTacToe testTicTacToe = new TicTacToe();
        testTicTacToe.addLetterToBoard(1);
        testTicTacToe.turnIncrement();
        testTicTacToe.tur
        assertEquals("o", testTicTacToe.getTurnCounter());
    }

}