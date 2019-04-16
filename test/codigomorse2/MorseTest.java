
package codigomorse2;

import org.junit.Before;

import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Notebook
 */
public class MorseTest {
   

    private Morse morse;

    @Before
    public void inicializa() {
        morse = new Morse();

    }

    @Test
    public void testapalavras() {
        morse.setMensagem("SOS");
        assertEquals("*** --- ***", morse.codifica());
        morse.setMensagem("EDILENE");
        assertEquals("* -** ** *-** * -* *", morse.codifica());
        morse.setMensagem("ESTUDANTIL");
        assertEquals("* *** - **- -** *- -* - ** *-**", morse.codifica());
        morse.setMensagem("JAVA");
        assertEquals("*--- *- ***- *-", morse.codifica());
         morse.setMensagem("ZIP");
        assertEquals("--** ** *--*", morse.codifica());
         morse.setMensagem("KGWB");
        assertEquals("-*- --* *-- -***", morse.codifica());
        morse.setMensagem("FH");
        assertEquals("**-* ****", morse.codifica());
        morse.setMensagem("XQ");
        assertEquals("-**- --*-", morse.codifica());
    }
    
    @Test
    public void testaNUMEROS() {
        morse.setMensagem("0123456789");
        assertEquals("----- *---- **--- ***-- ****- ***** -**** --*** ---** ----*", morse.codifica());
    }
       
    @Test
    public void testapontovirgulaespaco(){
    morse.setMensagem("., ");
    assertEquals("*-*-*- --**--  ", morse.codifica());
}
}