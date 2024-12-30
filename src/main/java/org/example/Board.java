package org.example;
import java.util.ArrayList;
import java.util.List;


public class Board {
    public List<List<String>>  generateBoard(String fen){

        String[] parts = fen.split(" ");
        String board = parts[0];
        List<List<String>> boardList = new ArrayList<>();
        String[] rows = board.split("/");

        for(String row: rows){
            List<String> boardRow = new ArrayList<>();
            for(int i = 0; i < row.length(); i++){
                char element = row.charAt(i);
                if(Character.isDigit(element)){
                    int emptySpaces = Character.getNumericValue(element);
                    for (int j = 0; j < emptySpaces; j++){
                        boardRow.add(".");
                    }
                }else{
                    boardRow.add(String.valueOf(element));

                }
            }
            boardList.add(boardRow);;
        }
        return boardList;


    };
    public static void main(String[] args){
        Board obj = new Board();
        List<List<String>>  output = obj.generateBoard("rnbqkbnr/pppppppp/8/8/8/8/PPPPPPPP/RNBQKBNR w KQkq - 0 1");
        StringBuilder sb = new StringBuilder();

        System.out.println(output);
    }

};
