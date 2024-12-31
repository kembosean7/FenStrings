package org.example;

import java.util.Arrays;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        String fen = "rnbqkbnr/pppppppp/8/8/8/8/PPPPPPPP/RNBQKBNR w KQk - 0 1";
        String[] parts = fen.split(" ");

        Board board = new Board();
        Movement movement = new Movement();
        System.out.println(Arrays.toString(parts));
        System.out.println(board.generateBoard(parts[0]));
        System.out.println(movement.moveTurn(parts[1]));
    }
}