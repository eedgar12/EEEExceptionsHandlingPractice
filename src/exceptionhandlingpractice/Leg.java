package exceptionhandlingpractice;

/**
 *
 * @author Emma Edgar
 */
public class Leg {

    Foot f = new Foot();
    
    public void walk() throws Exception{
        f.step();
    }
}
