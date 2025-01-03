package org.example;



import java.util.Arrays;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        String fen = "rnbqkbnr/pppppppp/8/8/8/8/PPPPPPPP/RNBQKBNR w Kq - 0 1";
        String[] parts = fen.split(" ");

        Board board = new Board();
        Movement movement = new Movement();
        Castling castling = new Castling();
        EnPassantSquare enPassant = new EnPassantSquare();
        Halfmove halfmove = new Halfmove();
        Fullmove fullmove = new Fullmove();


        System.out.println(board.generateBoard(parts[0]));
        System.out.println(movement.moveTurn(parts[1]));
        System.out.println(castling.getCastling(parts[2]));
        System.out.println(enPassant.enpassantsquare(parts[3]));
        System.out.println(halfmove.halfMoveClock(parts[4]));
        System.out.println(fullmove.fullMoveCheck(parts[5]));


    }
}