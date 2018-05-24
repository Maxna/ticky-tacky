package models;

import org.junit.Test;

import static org.junit.Assert.*;

public class TicTacToeTest {
    @Test
    public void newRectangle_instantiatesCorrectly() throws Exception {
        TicTacToe testTicTacToe = new TicTacToe();
        assertEquals(true, testTicTacToe instanceof TicTacToe);
    }

}