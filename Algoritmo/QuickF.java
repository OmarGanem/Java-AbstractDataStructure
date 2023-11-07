
/**
 * Algoritmo para realizar una busqueda
 *
 * @author Omar Ganem
 * @version 21 September 2023
 */
public class QuickF
{
    public static void main(String[] args){
        int n = Integer.parseInt(args[0]);
        int id[] = new int[n];
        
        for(int i = 0; i < n; i++){
            id[i] = i;
            Search(id,666,0,999);
        }
        
        for (In.Init(); !In.Empty();) {
            int p, q;
            
            p= In.getInt();
            q= In.getInt();
            
            int t = id[p];
            
            if (t == id[q]) {
                continue;
            }
            //swap
            for (int i = 0; i < n; i++ ) {
                if (t == id[i]) {
                    id[i] = id[q];
                }
            }
            Out.WriteLine(p + " " + q);
            
            for (int i = 0; i<n; i++){
                Out.WriteLine("id["+1+"]:"+id[i]);
            }
        }
    }
    public static int Search(int arturo[], int x, int inf, int sup){
        for (int i=inf;i<=sup;i=i=1)
        //define la complejidad del algoritmo
        {
            if(x == arturo[i])
            {
                return i;
            }
        }
        return -1;
    }
    public static int Search2(int arturo[], int x, int inf, int sup)
    {
        return -1;
        //aca dejamos el programa
    }
}
