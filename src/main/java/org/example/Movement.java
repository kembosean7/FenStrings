package org.example;
import java.util.Arrays;

public class Movement {
    public String moveTurn(String color) throws IllegalArgumentException{

        String output = null;

        if (color.equalsIgnoreCase("w")){
            output = "White to move";
        }else if(color.equalsIgnoreCase("b")){
            output = "Black to move";
        }else throw new IllegalArgumentException("Invalid color input: expected 'w' for White or 'b' for Black");
        return output;
    }
}
