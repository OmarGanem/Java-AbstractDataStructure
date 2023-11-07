
/**
 * Write a description of class Prueba here.
 *
 * @author EOGJ
 * @Date 32/August/2023
 */
public class Prueba
{
    public static void main(String[] args)
    {
        PilaDinamica<String>pilaNumeros = new PilaDinamica<>();
        
        System.out.println("la pila esta vacia? (Inicio) "+pilaNumeros.isEmpty());
        
        pilaNumeros.push("Daniel");
        pilaNumeros.push("Arturo");
        pilaNumeros.push("Marcelo");
        pilaNumeros.push("Bernardo");
        
        System.out.println("La pila esta vacia? (despues de agregar)"+pilaNumeros.isEmpty());
        
        System.out.println("El tamano ahora es de "+pilaNumeros.size());
        
        System.out.println("El top es "+pilaNumeros.top());
        
        String elemento = pilaNumeros.pop();
        
        System.out.println("sacaste el numero "+elemento);
        System.out.println("El tamano es ahora de "+pilaNumeros.size());
        
        System.out.println("El top es "+pilaNumeros.top());
        
        System.out.println(pilaNumeros);
        

        
    }
}
