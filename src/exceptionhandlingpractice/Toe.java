package exceptionhandlingpractice;

/**
 *
 * @author Emma Edgar
 */
public class Toe {
    boolean toeIsBroken = false;

    public void move() throws Exception{
        moveToe();
        System.out.println("move toe");
    }
    
    private void moveToe() throws Exception {
        if (toeIsBroken){
            throw new Exception();
        }
    }
}
