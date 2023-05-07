package in.ineuron;

/**
 * Hello world!
 *
 */
public class App 
{
    public int add(int x, int y){
        return x+y;
    }

    public static void main( String[] args )
    {
        App a = new App();
        int result = a.add(10,20);
        System.out.println( "The sum is :: " + result );
    }
}

