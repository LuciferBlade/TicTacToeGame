/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tictactoegame;

import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author blade
 */
public class TicTacToeTest {

    public TicTacToeTest() {
    }

    /**
     * Test of checkFullBoard method, of class TicTacToe.
     */
    @Test
    public void testCheckFullBoard() {
        System.out.println("checkFullBoard");
        TicTacToe instance = new TicTacToe(3);
        instance.setTile(1, 0, 0);
        instance.setTile(1, 0, 1);
        instance.setTile(1, 0, 2);
        instance.setTile(1, 1, 0);
        instance.setTile(1, 1, 1);
        instance.setTile(1, 1, 2);
        instance.setTile(1, 2, 0);
        instance.setTile(1, 2, 1);
        instance.setTile(1, 2, 2);
        boolean expResult = false;
        boolean result = instance.checkFullBoard(instance.board);
        assertEquals(expResult, result);
    }

    /**
     * Test of checkFullBoard method, of class TicTacToe.
     */
    @Test
    public void testCheckFullBoardFail() {
        System.out.println("checkFullBoardFail");
        TicTacToe instance = new TicTacToe(3);
        boolean expResult = true;
        boolean result = instance.checkFullBoard(instance.board);
        assertEquals(expResult, result);
    }

    /**
     * Test of checkDiagonal method, of class TicTacToe.
     */
    @Test
    public void testCheckDiagonal() {
        System.out.println("checkDiagonal");
        TicTacToe instance = new TicTacToe(3);
        instance.setTile(1, 0, 0);
        instance.setTile(1, 1, 1);
        instance.setTile(1, 2, 2);
        boolean expResult = true;
        boolean result = instance.checkDiagonal(instance.board, 1);
        assertEquals(expResult, result);
    }

    /**
     * Test of checkDiagonal method, of class TicTacToe.
     */
    @Test
    public void testCheckDiagonalFail() {
        System.out.println("checkDiagonalFail");
        TicTacToe instance = new TicTacToe(3);
        boolean expResult = false;
        boolean result = instance.checkDiagonal(instance.board, 1);
        assertEquals(expResult, result);
    }

    /**
     * Test of checkRevDiagonal method, of class TicTacToe.
     */
    @Test
    public void testCheckRevDiagonal() {
        System.out.println("checkRevDiagonal");
        TicTacToe instance = new TicTacToe(3);
        instance.setTile(1, 0, 2);
        instance.setTile(1, 1, 1);
        instance.setTile(1, 2, 0);
        boolean expResult = true;
        boolean result = instance.checkRevDiagonal(instance.board, 1);
        assertEquals(expResult, result);
    }

    /**
     * Test of checkRevDiagonal method, of class TicTacToe.
     */
    @Test
    public void testCheckRevDiagonalFail() {
        System.out.println("checkRevDiagonalFail");
        TicTacToe instance = new TicTacToe(3);
        boolean expResult = false;
        boolean result = instance.checkRevDiagonal(instance.board, 1);
        assertEquals(expResult, result);
    }

    /**
     * Test of checkHorizontal method, of class TicTacToe.
     */
    @Test
    public void testCheckHorizontal() {
        System.out.println("checkHorizontal");
        TicTacToe instance = new TicTacToe(3);
        instance.setTile(1, 0, 0);
        instance.setTile(1, 0, 1);
        instance.setTile(1, 0, 2);
        boolean expResult = true;
        boolean result = instance.checkHorizontal(0, instance.board, 1);
        assertEquals(expResult, result);
    }

    /**
     * Test of checkHorizontal method, of class TicTacToe.
     */
    @Test
    public void testCheckHorizontalFail() {
        System.out.println("checkHorizontalFail");
        TicTacToe instance = new TicTacToe(3);
        boolean expResult = false;
        boolean result = instance.checkHorizontal(0, instance.board, 1);
        assertEquals(expResult, result);
    }

    /**
     * Test of checkVertical method, of class TicTacToe.
     */
    @Test
    public void testCheckVertical() {
        System.out.println("checkCheckVertical");
        TicTacToe instance = new TicTacToe(3);
        boolean expResult = false;
        boolean result = instance.checkHorizontal(0, instance.board, 1);
        assertEquals(expResult, result);
    }

    /**
     * Test of checkVertical method, of class TicTacToe.
     */
    @Test
    public void testCheckVerticalFail() {
        System.out.println("checkCheckVerticalFail");
        TicTacToe instance = new TicTacToe(3);
        boolean expResult = false;
        boolean result = instance.checkHorizontal(0, instance.board, 1);
        assertEquals(expResult, result);
    }

    /**
     * Test of check method, of class TicTacToe.
     */
    @Test
    public void testCheckDi() {
        System.out.println("checkDi");
        TicTacToe instance = new TicTacToe(3);
        instance.setTile(1, 0, 0);
        instance.setTile(1, 1, 1);
        instance.setTile(1, 2, 2);
        String expResult = "\\ 0 0";
        String result = instance.check(1);
        assertEquals(expResult, result);
    }

    /**
     * Test of check method, of class TicTacToe.
     */
    @Test
    public void testCheckRevDi() {
        System.out.println("checkRevDi");
        TicTacToe instance = new TicTacToe(3);
        instance.setTile(1, 0, 2);
        instance.setTile(1, 1, 1);
        instance.setTile(1, 2, 0);
        String expResult = "/ 0 2";
        String result = instance.check(1);
        assertEquals(expResult, result);
    }

    /**
     * Test of check method, of class TicTacToe.
     */
    @Test
    public void testCheckHo() {
        System.out.println("checkHo");
        TicTacToe instance = new TicTacToe(3);
        instance.setTile(1, 1, 0);
        instance.setTile(1, 1, 1);
        instance.setTile(1, 1, 2);
        String expResult = "- 1 0";
        String result = instance.check(1);
        assertEquals(expResult, result);
    }

    /**
     * Test of check method, of class TicTacToe.
     */
    @Test
    public void testCheckVe() {
        System.out.println("checkDi");
        TicTacToe instance = new TicTacToe(3);
        instance.setTile(1, 0, 1);
        instance.setTile(1, 1, 1);
        instance.setTile(1, 2, 1);
        String expResult = "| 0 1";
        String result = instance.check(1);
        assertEquals(expResult, result);
    }

    /**
     * Test of check method, of class TicTacToe.
     */
    @Test
    public void testCheckFu() {
        System.out.println("checkFu");
        TicTacToe instance = new TicTacToe(3);
        instance.setTile(2, 0, 0);
        instance.setTile(1, 0, 1);
        instance.setTile(1, 0, 2);
        instance.setTile(1, 1, 0);
        instance.setTile(2, 1, 1);
        instance.setTile(1, 1, 2);
        instance.setTile(1, 2, 0);
        instance.setTile(1, 2, 1);
        instance.setTile(2, 2, 2);
        String expResult = "Tie";
        String result = instance.check(1);
        assertEquals(expResult, result);
    }

    /**
     * Test of check method, of class TicTacToe.
     */
    @Test
    public void testCheckEmp() {
        System.out.println("checkEmp");
        TicTacToe instance = new TicTacToe(3);
        String expResult = "Not won";
        String result = instance.check(1);
        assertEquals(expResult, result);
    }

    /**
     * Test of safeChangeTile method, of class TicTacToe.
     */
    @Test
    public void testSafeChangeTile() {
        System.out.println("safeChangeTile");
        int sign = 1;
        int x = 1;
        int y = 1;
        TicTacToe instance = new TicTacToe(3);
        boolean expResult = true;
        boolean result = instance.safeChangeTile(sign, x, y);
        assertEquals(expResult, result);
    }

    /**
     * Test of safeChangeTile method, of class TicTacToe.
     */
    @Test
    public void testSafeChangeTileFail() {
        System.out.println("safeChangeTileFail");
        int sign = 1;
        int x = 1;
        int y = 1;
        TicTacToe instance = new TicTacToe(3);
        instance.setTile(sign, x, y);
        boolean expResult = false;
        boolean result = instance.safeChangeTile(sign, x, y);
        assertEquals(expResult, result);
    }

    /**
     * Test of getTile method, of class TicTacToe.
     */
    @Test
    public void testGetTile() {
        System.out.println("getTile");
        int x = 1;
        int y = 1;
        TicTacToe instance = new TicTacToe(3);
        int expResult = 0;
        int result = instance.getTile(x, y);
        assertEquals(expResult, result);
    }

    /**
     * Test of setTile method, of class TicTacToe.
     */
    @Test
    public void testSetTile() {
        System.out.println("setTile");
        int value = 1;
        int x = 1;
        int y = 1;
        TicTacToe instance = new TicTacToe(3);
        instance.setTile(value, x, y);
        assertEquals(instance.getTile(x, y), 1);
    }

    /**
     * Test of resetBoard method, of class TicTacToe.
     */
    @Test
    public void testResetBoard() {
        System.out.println("resetBoard");
        TicTacToe instance = new TicTacToe(3);
        instance.setTile(1, 1, 1);
        instance.resetBoard();
        assertEquals(instance.getTile(1, 1), 0);
    }

    /**
     * Test of getSize method, of class TicTacToe.
     */
    @Test
    public void testGetSize() {
        System.out.println("getSize");
        TicTacToe instance = new TicTacToe(3);
        int expResult = 3;
        int result = instance.getSize();
        assertEquals(expResult, result);
    }

}
