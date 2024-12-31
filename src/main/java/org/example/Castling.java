package org.example;
import java.util.ArrayList;
import  java.util.List;

public class Castling {
    public StringBuilder getCastling(String castling) throws IllegalArgumentException {

        if(!isValidCastlingInput(castling)){
            throw new IllegalArgumentException("Invalid input: Only 'K', 'Q', 'k', 'q' characters are allowed.");
        }
        List<String> castlingState = new ArrayList<>();
        StringBuilder whiteCastling = new StringBuilder();
        StringBuilder blackCastling = new StringBuilder();
        StringBuilder output = new StringBuilder();

        for (char x: castling.toCharArray()){
            if(Character.isUpperCase(x)){
                whiteCastling.append(x);

            }else {
                blackCastling.append(x);
            }
        }

        if(whiteCastling.length() == 2){
            castlingState.add("White can castle both sides");
        }
        else if (whiteCastling.toString().contains("K")) {
            castlingState.add("White can castle king");
        } else if (whiteCastling.toString().contains("Q")) {
            castlingState.add("White can castle queen");

        }

        if(blackCastling.length() == 2){
            castlingState.add("Black can castle both sides");
        }
        else if (blackCastling.toString().contains("k")) {
            castlingState.add("Black can castle king");
        } else if (blackCastling.toString().contains("q")) {
            castlingState.add("Black can castle queen");

        }
        return output.append(String.join("\n", castlingState));

    }
    private  boolean isValidCastlingInput(String castling) {

        for(char c: castling.toCharArray()){
            if (c != 'K' && c != 'Q' && c != 'k' && c != 'q'){
                return false;
            }
        }
        return true;

    }

}