package org.example;
import java.util.ArrayList;
import  java.util.List;
import java.util.Arrays;

public class Castling {
    public List<String> getCastling(String fen) {

        String[] parts = fen.split(" ");
        String castling = parts[2];

        List<String> castlingState = new ArrayList<>();
        String whiteCastling = "";
        String blackCastling = "";

        for (char x: castling.toCharArray()){
            if(Character.isUpperCase(x)){
                whiteCastling = whiteCastling + x;

            }else {
                blackCastling = blackCastling + x;
            }
        }

        if(whiteCastling.length() == 2){
            castlingState.add("White can castle both sides");
        }
        else if (whiteCastling.equals("K")) {
            castlingState.add("White can castle king");
        } else if (whiteCastling.equals("Q")) {
            castlingState.add("White can castle queen");

        }

        if(blackCastling.length() == 2){
            castlingState.add("Black can castle both sides");
        }
        else if (blackCastling.equals("k")) {
            castlingState.add("Black can castle king");
        } else if (blackCastling.equals("q")) {
            castlingState.add("Black can castle queen");

        }
        return castlingState;
    }

}