package fish.payara.codingdojo.eightqueens;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;
import org.junit.jupiter.api.Test;

import java.util.List;

public class EightQueensTest {

    @Test
    public void testThisWorks() {
        assertTrue(true);
    }

    @Test
    public void testBoard() {
        Board board = new Board(8);
        assertTrue(board.getSize() == 64);
        assertTrue(board.getNumberOfPieces() == 8);
        
    }

    @Test
    public void testBoard1x1() {
        Board board = new Board(1);
        assertEquals(1, board.getSize());
        assertTrue(board.getNumberOfPieces() == 1);

        assertEquals("[Q]", board.toString());
    }

    @Test
    public void testBoard4x4() {
        Board board = new Board(4);
        assertEquals(16, board.getSize());
        assertTrue(board.getNumberOfPieces() == 4);

        List<String> solutions = board.getAllSolutions();

        assertEquals("[.Q..]\n"
                + "[...Q]\n"
                + "[Q...]\n"
                + "[..Q.]", solutions.get(0));
    }

}
