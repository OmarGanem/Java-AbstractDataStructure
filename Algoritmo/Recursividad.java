
/**
 *Funciones recursivas chidas
 *
 * @author Edgar Omar Ganem Juarez
 * date 19/oct/2023
 */
public class Recursividad
{
    public int factorialFor(int x) {
        if(x==1)
        {
            return x;
        }
        int total = 1;
        for (int i=2 ; i<=x ; i++)
        {
            total = total * i;
        }
        return total;
    }
    public int factorial(int x){
        if(x == 1){
         return x;
        }
        return x * factorial(x - 1);
    }
}
