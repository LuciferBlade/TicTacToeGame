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
public class ComputerPlayerTest {
    
    public ComputerPlayerTest() {
    }

    /**
     * Test of autoPlay method, of class ComputerPlayer.
     */
    @Test
    public void testAutoPlay() {
        System.out.println("autoPlay");
        int sign = 1;
        TicTacToe TTT = new TicTacToe(3);
        ComputerPlayer instance = new ComputerPlayer(TTT);
        int expResult = 2;
        String[] splitStr = instance.autoPlay(sign).split("\\s+");
        int result = splitStr.length;
        assertEquals(expResult, result);
    }

    /**
     * Test of autoPlayAdvanced method, of class ComputerPlayer.
     */
    @Test
    public void testAutoPlayAdvancedWin() {
        System.out.println("autoPlayAdvanced");
        int sign = 2;
        TicTacToe TTT = new TicTacToe(3);
        TTT.setTile(2, 0, 0);
        TTT.setTile(2, 1, 1);
        ComputerPlayer instance = new ComputerPlayer(TTT);
        String expResult = "2 2";
        String result = instance.autoPlayAdvanced(sign);
        assertEquals(expResult, result);
    }
    
    /**
     * Test of autoPlayAdvanced method, of class ComputerPlayer.
     */
    @Test
    public void testAutoPlayAdvancedPlayer() {
        System.out.println("autoPlayAdvanced");
        int sign = 2;
        TicTacToe TTT = new TicTacToe(3);
        TTT.setTile(1, 0, 0);
        TTT.setTile(1, 1, 1);
        ComputerPlayer instance = new ComputerPlayer(TTT);
        String expResult = "2 2";
        String result = instance.autoPlayAdvanced(sign);
        assertEquals(expResult, result);
    }
    
    /**
     * Test of autoPlayAdvanced method, of class ComputerPlayer.
     */
    @Test
    public void testAutoPlayAdvancedRandom() {
        System.out.println("autoPlayAdvanced");
        int sign = 1;
        TicTacToe TTT = new TicTacToe(3);
        ComputerPlayer instance = new ComputerPlayer(TTT);
        int expResult = 2;
        String[] splitStr = instance.autoPlayAdvanced(sign).split("\\s+");
        int result = splitStr.length;
        assertEquals(expResult, result);
    }
    
}
