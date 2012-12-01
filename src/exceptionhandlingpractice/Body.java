package exceptionhandlingpractice;

/**
 *
 * @author Emma Edgar
 */
public class Body {

    Leg l = new Leg();
   
    public void walk() throws Exception{
        l.walk();
    }
}
