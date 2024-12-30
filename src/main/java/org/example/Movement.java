package org.example;
import java.util.Arrays;

public class Movement {
    public String moveTurn(String fen){
        String[] parts = fen.split(" ");
        String color = parts[1];

        if (color.equalsIgnoreCase("w")){
            return  "White to move";
        }else {
            return "Black to move";
        }
    }

    public static void main(String[] args){
        Movement move = new Movement();
        System.out.println(move.moveTurn( "rnbqkbnr/pppppppp/8/8/8/8/PPPPPPPP/RNBQKBNR W KQkq - 0 1"));
    }
}
