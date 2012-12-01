package exceptionhandlingpractice;

/**
 *
 * @author Emma Edgar
 */
public class Output {

    public static void main(String[] args) {
        Body b = new Body();
        
        
        
        try{
            b.walk();
        } catch (Exception e){
            System.out.println("Broken toe");
        }
        
    }
}
