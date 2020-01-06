/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tictactoegame;

import java.util.Random;

/**
 *
 * @author blade
 */
public class ComputerPlayer {

    private TicTacToe TTT;

    public ComputerPlayer(TicTacToe TTT) {
        this.TTT = TTT;
    }

    public String autoPlay(int sign) { //dumbed down computer player
        boolean validTurn = false;
        int temp1 = 0;
        int temp2 = 0;
        while (!validTurn) { //select a random empty tile
            temp1 = new Random().nextInt(TTT.getSize());
            temp2 = new Random().nextInt(TTT.getSize());
            validTurn = TTT.safeChangeTile(sign, temp1, temp2);
        }
        return temp1 + " " + temp2;
    }

    // advanced computer player which actually tries to win if he lacks only 1 sign in a row
    // and tries to prevent player from wining the game if player lacks 1 sign
    public String autoPlayAdvanced(int sign) {
        boolean validTurn = false;
        int temp1 = 0;
        int temp2 = 0;
        int sign2 = 0;
        //copy the board
        TicTacToe TTTemp = new TicTacToe(TTT.getSize());
        for (int i = 0; i < TTTemp.getSize(); i++) {
            for (int j = 0; j < TTTemp.getSize(); j++) {
                TTTemp.setTile(TTT.getTile(i, j), i, j);
            }
        }

        //player turn finding
        if (sign == 1) {
            sign2 = 2;
        } else {
            sign2 = 1;
        }

        int done = 0;
        //cycle to determine "best" or random move
        while (!validTurn) {
            switch (done) {
                case 0: //Win condition check
                    loop:
                    for (int i = 0; i < TTTemp.getSize(); i++) {
                        for (int j = 0; j < TTTemp.getSize(); j++) {
                            if (TTTemp.getTile(i, j) == 0) {
                                TTTemp.setTile(sign, i, j);

                                //if after changing empty tile to your sign...
                                switch (TTTemp.check(sign)) {
                                    case "Not won":
                                        TTTemp.setTile(-1, i, j);
                                        done = 1;
                                        break;
                                    case "Tie":
                                        done = 1;
                                        break loop;
                                    default: //won in any way
                                        temp1 = i;
                                        temp2 = j;
                                        validTurn = TTT.safeChangeTile(sign, i, j);
                                        done = 2;
                                        break loop;
                                }
                            }
                        }
                    }
                    break;
                case 1: //Player win condition check
                    //copy board again
                    for (int i = 0; i < TTTemp.getSize(); i++) {
                        for (int j = 0; j < TTTemp.getSize(); j++) {
                            TTTemp.setTile(TTT.getTile(i, j), i, j);
                        }
                    }

                    loop:
                    for (int i = 0; i < TTTemp.getSize(); i++) {
                        for (int j = 0; j < TTTemp.getSize(); j++) {
                            if (TTTemp.getTile(i, j) == 0) {
                                TTTemp.setTile(sign2, i, j);

                                //if after changing empty tile to player sign...
                                switch (TTTemp.check(sign2)) {
                                    case "Not won":
                                        TTTemp.setTile(-1, i, j);
                                        done = 2;
                                        break;
                                    case "Tie":
                                        done = 2;
                                        break loop;
                                    default: //player might win
                                        temp1 = i;
                                        temp2 = j;
                                        validTurn = TTT.safeChangeTile(sign, i, j);
                                        done = 2;
                                        break loop;
                                }
                            }

                        }
                    }
                    break;
                default: //if "best" move wasn't found mark a random tile
                    temp1 = new Random().nextInt(TTT.getSize());
                    temp2 = new Random().nextInt(TTT.getSize());
                    validTurn = TTT.safeChangeTile(sign, temp1, temp2);
                    break;
            }
        }

        // return selected tile
        return temp1 + " " + temp2;
    }
}
