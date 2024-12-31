package org.example;
import java.util.ArrayList;
import java.util.List;


public class Board {
    public String generateBoard(String[] fen) {


        String board = fen[0];
        List<List<String>> boardList = new ArrayList<>();
        String[] rows = board.split("/");
        StringBuilder output = new StringBuilder();



        for (String row : rows) {
            List<String> boardRow = new ArrayList<>();
            for (int i = 0; i < row.length(); i++) {
                char element = row.charAt(i);
                if (Character.isDigit(element)) {
                    int emptySpaces = Character.getNumericValue(element);
                    for (int j = 0; j < emptySpaces; j++) {
                        boardRow.add(".");
                    }
                } else {
                    boardRow.add(String.valueOf(element));

                }
            }
            output.append(String.join(" ", boardRow)).append("\n");


        }
        return output.toString();


    }

};
