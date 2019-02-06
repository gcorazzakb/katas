import org.junit.Test;
import static org.junit.Assert.*;

public class GreatGameTest {
    @Test
    public void testGameStringValid(){
        assertTrue(GreatGame.isValidGame("[]"));
        assertTrue(GreatGame.isValidGame("()()"));
        assertTrue(GreatGame.isValidGame("8<"));
        assertFalse(GreatGame.isValidGame("[]8>"));
        assertTrue(GreatGame.isValidGame("[]()"));
        assertFalse(GreatGame.isValidGame("][[]"));
        assertFalse(GreatGame.isValidGame("[]())"));
        assertFalse(GreatGame.isValidGame("[]()88>"));
    }

    @Test
    public void testwhoIsWInner(){
        assertTrue(GreatGame.isValidGame("[]"));
        assertTrue(GreatGame.isValidGame("()()"));
        assertTrue(GreatGame.isValidGame("8<"));
        assertFalse(GreatGame.isValidGame("[]8>"));
        assertTrue(GreatGame.isValidGame("[]()"));
        assertFalse(GreatGame.isValidGame("][[]"));
        assertFalse(GreatGame.isValidGame("[]())"));
        assertFalse(GreatGame.isValidGame("[]()88>"));
    }

    @Test
    public void testGame(){
        assertEquals("TIE",GreatGame.whoIsWinner("[]","[]"));
        assertEquals("TIE",GreatGame.whoIsWinner("8<8<","[]()"));
        assertEquals("TIE",GreatGame.whoIsWinner("[]()8<","[]8<()"));
        assertEquals("TIE",GreatGame.whoIsWinner("[]","[]"));
    }
}
