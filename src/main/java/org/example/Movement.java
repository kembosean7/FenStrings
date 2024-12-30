package org.example;
import java.util.Arrays;

public class Movement {
    public String moveTurn(String fen){
        String[] parts = fen.split(" ");
        String color = parts[1];
        String output = null;

        if (color.equalsIgnoreCase("w")){
            output = "White to move";
        }else if(color.equalsIgnoreCase("b")){
            output = "Black to move";
        }
        return output;
    }

    public static void main(String[] args){
        Movement move = new Movement();
        System.out.println(move.moveTurn( "rnbqkbnr/pppppppp/8/8/8/8/PPPPPPPP/RNBQKBNR b KQkq - 0 1"));
    }
}
