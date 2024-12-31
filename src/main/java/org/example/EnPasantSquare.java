package org.example;

public class EnPasantSquare {
    public String enpasantsquare(String fen){

        String[] parts = fen.split(" ");
        String enPasant = parts[3];
        if(enPasant.equals("-")){
            return "No en passant square";
        }
        else{
            return "En passant square: " + enPasant;
        }
    }

};
