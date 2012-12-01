package exceptionhandlingpractice;

/**
 *
 * @author Emma Edgar
 */
public class Foot {

    Toe t = new Toe();
    
    public void step() throws Exception{
        t.move();
    }
}
