
/**
 * Write a description of class Primes here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Primes
{   
       public static void main (String[] args)
   {
       int n = Integer.parseInt (args[0]);
       for(int i = 2 ; i<=n;i++)
       {
            boolean esPrimo=true;
            for(int j=2 ; j<i ; j++)
           {
               if (i% j == 0)
               {
                   esPrimo = false;
                   break;
                }
            }
            if(esPrimo==true)
            {
            System.out.println(i + "es primo"); 
            }
        }
    }
}

