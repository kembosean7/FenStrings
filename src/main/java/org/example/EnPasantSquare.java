package org.example;

public class EnPasantSquare {
    public String enpasantsquare(String enpassant){

        if(enpassant.equals("-")){
            return "No en passant square";
        }
        else{
            return "En passant square: " + enpassant;
        }
    }

};
