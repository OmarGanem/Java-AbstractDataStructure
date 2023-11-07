
/**
 *  test de recursividad
 *
 * @author EOGJ
 * @version Date 19/oct/2023
 */
public class TestRecursividad
{
    public static void main(String [] args) {
        Recursividad r= new Recursividad();
        int n = Integer.parseInt(args[0]);
        System.out.println(n+ "! =" + r.factorialFor(n));
        System.out.println(n+ "! =" + r.factorial(n));
    }
}
