import static org.junit.Assert.assertEquals;

import org.junit.Test;
import  org.example.*;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

public class testFenString {
    @Test
    public void testBoard(){

        String fenBorad = "rnbqkbnr/pppppppp/8/8/8/8/PPPPPPPP/RNBQKBNR";
        Board board = new Board();
        String output = board.generateBoard(fenBorad);

        assertEquals("r n b q k b n r\np p p p p p p p\n. . . . . . . .\n. . . . . . . .\n. . . . . . . .\n. . . . . . . .\nP P P P P P P P\nR N B Q K B N R\n",output);
    }

    @Test
    public void testBoard2() {

        // New FEN string to test
        String fenBorad = "r1bqkbnr/ppp1pppp/8/8/8/8/PPP1PPPP/RNBQKBNR";
        Board board = new Board();
        String output = board.generateBoard(fenBorad);

        // The expected output corresponding to the new FEN string
        assertEquals("r . b q k b n r\np p p . p p p p\n. . . . . . . .\n. . . . . . . .\n. . . . . . . .\n. . . . . . . .\nP P P . P P P P\nR N B Q K B N R\n", output);
    }

    @Test
    public void testMoveWhite(){

        Movement movement = new Movement();
        String output = movement.moveTurn("w");
        assertEquals("White to move", output);
    }

    @Test
    public void testMoveBlack(){

        Movement movement = new Movement();
        String output = movement.moveTurn("B");
        assertEquals("Black to move", output);
    }

    @Test
    public void testCastling1() {

        Castling castling = new Castling();
        String output = String.valueOf(castling.getCastling("KQkq"));
        assertEquals("White can castle both sides\nBlack can castle both sides", output);

    }

    @Test
    public void testCastling2(){

        Castling castling = new Castling();
        String output = String.valueOf(castling.getCastling("Kk"));
        assertEquals("White can castle king\nBlack can castle king",output);
    }

    @Test
    public void testCastling3(){

        Castling castling = new Castling();
        String output = String.valueOf(castling.getCastling("Qkq"));
        assertEquals("White can castle queen\nBlack can castle both sides", output);
    }

    @Test
    public void testEnPassantSquare(){

        EnPassantSquare enPassantSquare = new EnPassantSquare();
        String output = enPassantSquare.enpassantsquare("-");
        assertEquals("No en passant square", output);
    }

    @Test
    public void testEnPassantSquare2(){

        EnPassantSquare enPassantSquare = new EnPassantSquare();
        String output = enPassantSquare.enpassantsquare("e3");
        assertEquals("En passant square: e3", output );

    }

    @Test
    public void testHalfMoveClock(){

        Halfmove halfmove = new Halfmove();
        String output1 = halfmove.halfMoveClock("0");
        String output2 = halfmove.halfMoveClock("4");
        assertEquals("Halfmove clock: 0", output1);
        assertEquals("Halfmove clock: 4", output2);


    }

    @Test
    public void testFullMoveCheck(){

        Fullmove fullmove = new Fullmove();
        String output1 = fullmove.fullMoveCheck("2");
        String output2 = fullmove.fullMoveCheck("0");
        assertEquals("Fullmove clock: 2", output1);
        assertEquals("Fullmove clock: 0", output2);
    }
    @Test
    public void testMain(){
        ByteArrayOutputStream output = new ByteArrayOutputStream();
        System.setOut(new PrintStream(output));

        Main.main(null);
        String expected = "r n b q k b n r\np p p p p p p p\n. . . . . . . .\n. . . . . . . .\n. . . . . . . .\n. . . . . . . .\nP P P P P P P P\nR N B Q K B N R\n" +
                "\nWhite to move\nWhite can castle king\nBlack can castle queen\nNo en passant square\nHalfmove clock: 0\n" +
                "Fullmove clock: 1\n";
        assertEquals(expected.replace("\r\n","\n"),output.toString().replace("\r\n", "\n"));

    }







}
