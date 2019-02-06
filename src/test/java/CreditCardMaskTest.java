
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CreditCardMaskTest {
    @Test
    public void testSolution() {
        assertEquals("############5616", CreditCardMask.maskify("4556364607935616"));
        assertEquals("#######5616",      CreditCardMask.maskify(     "64607935616"));
        assertEquals("1",                CreditCardMask.maskify(               "1"));
        assertEquals("",                 CreditCardMask.maskify(                ""));
        assertEquals("#2344",                 CreditCardMask.maskify(                "12344"));

        // "What was the name of your first pet?"
        assertEquals("##ippy",                                    CreditCardMask.maskify("Skippy")                                  );
        assertEquals("####################################man!",  CreditCardMask.maskify("Nananananananananananananananana Batman!"));
    }
    @Test
    public void testGetHashtags(){
        assertEquals("###", CreditCardMask.getHashtags(3));
        assertEquals("", CreditCardMask.getHashtags(0));
        assertEquals("#####", CreditCardMask.getHashtags(5));
    }


}