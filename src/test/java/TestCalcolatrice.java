import org.junit.Before;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class TestCalcolatrice {
    public Calcolatrice c;

    @Before
    public final void setUp(){
        c = new Calcolatrice();
    }

    @Test
    public void testSomma(){
        Assertions.assertTrue(c.somma(11, 1)==12, "somma corretta");
    }

    @Test
    public void testMoltiplicazione(){
        Assertions.assertTrue(c.moltiplicazione(11, 1)==11, "moltiplicazione corretta");
    }
}
