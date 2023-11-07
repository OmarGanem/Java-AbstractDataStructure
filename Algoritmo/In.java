/**
 * Para leer datos
 *
 * @author Omar Ganem
 * @version 21 September 2023
 */
import java.io.*; //paquete de input y ouput
public class In
{
    private static int c;
    
    private static boolean Blanco(){
    return Character.isWhitespace((char) c);
    }
    
    private static void ReadC(){
        try{
            
            c = System.in.read();
        }catch(IOException ex){
            c = -1;
        }
    }
    
    public static void Init(){
        ReadC();
    }
    
    public static boolean Empty(){
        return c == -1;
    }
    
    public static String getString(){
        if (Empty()){
            return null;
        }
        String s = "";
        do{
            s = s + (char)c;
            ReadC();
        }while(!(Empty() | Blanco()));
        while(!Empty() && Blanco()){
            ReadC();
        }
        return s;
    }
    
    public static int getInt(){
        return Integer.parseInt(getString());
    }
    
    public static double getDouble(){
        return Double.parseDouble(getString());
    }
}
