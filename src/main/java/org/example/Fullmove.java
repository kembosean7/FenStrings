package org.example;

public class Fullmove {
    public String fullMove(String fen){
        String[] parts = fen.split(" ");
        String halfMoveCheck = parts[5];
        int halfMoveInt=  Integer.parseInt(halfMoveCheck);

        return "Halfmove clock: " + halfMoveInt;
    }

}
