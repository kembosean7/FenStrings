import static org.junit.Assert.assertEquals;

import org.junit.Test;
import  org.example.*;

public class testFenString {
    @Test
    public void testBoard(){

        String fenBorad = "rnbqkbnr/pppppppp/8/8/8/8/PPPPPPPP/RNBQKBNR";
        Board board = new Board();
        String output = board.generateBoard(fenBorad);

        assertEquals("r n b q k b n r\np p p p p p p p\n. . . . . . . .\n. . . . . . . .\n. . . . . . . .\n. . . . . . . .\nP P P P P P P P\nR N B Q K B N R\n",output);
    };





}
