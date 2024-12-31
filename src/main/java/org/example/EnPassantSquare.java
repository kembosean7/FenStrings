package org.example;

public class EnPassantSquare {
    public String enpassantsquare(String enpassant){

        if(enpassant.equals("-")){
            return "No en passant square";
        }

        else{
            return "En passant square: " + enpassant;
        }
    }

};
