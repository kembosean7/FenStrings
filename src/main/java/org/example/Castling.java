package org.example;

import java.util.Arrays;

public class Castling {
    public String getCastling(String fen) {
        String[] parts = fen.split(" ");
        return parts[2];

    }

    public static void main(String[] args) {


        Castling findCastler = new Castling();
        String[] output = findCastler.getCastling("rnbqkbnr/pppppppp/8/8/8/8/PPPPPPPP/RNBQKBNR w Kkq - 0 1").split("");
//        System.out.println(Arrays.toString(output));

        String whiteCastling = "";
        String blackCastling = "";

        for (String x: output){
            if(x.equals(x.toUpperCase())){
                whiteCastling = whiteCastling + x;

            }else {
                blackCastling = blackCastling + x;
            }
        }

        if(whiteCastling.length() == 2){
            System.out.println("White can castle both sides");
        }
        else if (whiteCastling.equals("K")) {
            System.out.println("White can castle king");
        } else if (whiteCastling.equals("Q")) {
            System.out.println("White can castle queen");

        }

        if(blackCastling.length() == 2){
            System.out.println("Black can castle both sides");
        }
        else if (blackCastling.equals("k")) {
            System.out.println("Black can castle king");
        } else if (blackCastling.equals("q")) {
            System.out.println("Black can castle queen");

        }





    }
}