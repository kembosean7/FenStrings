package org.example;

public class Halfmove {
    public String halfMoveCloack(String fen){

        String[] parts = fen.split(" ");
        String halfMoveCheck = parts[4];
        int halfMoveInt=  Integer.parseInt(halfMoveCheck);

        return "Halfmove clock:   " + halfMoveInt;


    }

}
