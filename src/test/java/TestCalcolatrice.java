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
        this.setUp();
        Assertions.assertTrue(c.somma(11, 1)==12, "somma corretta");
    }

    @Test
    public void testMoltiplicazione(){
        this.setUp();
        Assertions.assertTrue(c.moltiplicazione(11, 1)==11, "moltiplicazione corretta");
    }

    @Test
    public void testSottrazione() {
        this.setUp();
        Assertions.assertTrue(c.sottrazione(4, 2) == 2, "Sottrazione corretta");
    }

    @Test
    public void testDivisone() {
        this.setUp();
        Assertions.assertTrue(c.divisione(10,2) == 5, "Divisione corretta");
    }

    @Test
    public void testDivisionePerZero() {
        this.setUp();
        Assertions.assertTrue(c.divisione(10,0) == 0, "Divisione corretta");
    }
}
