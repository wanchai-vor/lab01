package rmuti.datastructure;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        ArrayOperation obj = new ArrayOperation();
        
        int sumObj = obj.sumArrays();
        System.out.println("Sum = "+sumObj);
        
        int maxObj = obj.maxArrays();
        System.out.println("Max Number = "+maxObj);

        
    }
}