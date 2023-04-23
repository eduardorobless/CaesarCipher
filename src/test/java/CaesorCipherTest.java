import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CaesorCipherTest {
    private CaesorCipher caesorCipher = new CaesorCipher();


    @Test
    void testCipheredMessageWithOffsetOf12(){
        assertEquals("tai mdq kag pauzs fapmk", caesorCipher.cipher("how are you doing today", 12));
    }

    @Test
    void testEmptyString(){
        assertEquals("", caesorCipher.cipher("", 12));
    }

    @Test
    void testCipheredMessageWithOffsetOf11(){
        assertEquals("tai mdq kag pauzs fapmk", caesorCipher.cipher("how are you doing today", 11));
    }
}