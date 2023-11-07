
/**
 * Write a description of class PilaDinamica here.
 *
 * @author EOGJ
 * @Date 29/August/2023
 */
public class PilaDinamica<T> {
 
    //Atributos
    private Nodo<T> top; 
    private int tam;
 
    //Constructores
    public PilaDinamica() {
        top = null; 
        this.tam = 0;
    }
 
   
    public boolean isEmpty() {
        return top == null;
    }
 
    public int size() {
        return this.tam;
    }
 
    //Devuelve el que esta más arriba en la pila
    public T top() {
        if (isEmpty()) {
            return null;
        } else {
            return top.getElemento();
        }
    }
 
    //Saca y devuelve el elemento que mas arriba esta en la pila
    public T pop() {
        if (isEmpty()) {
            return null;
        } else {
            T elemento = top.getElemento();
            Nodo<T> aux = top.getSiguiente();
            top = null; 
            top = aux; 
            this.tam--;
            return elemento;
        }
    }
 
    //mete un elemento a la pila
    public T push(T elemento) {
 
        Nodo<T> aux = new Nodo<>(elemento, top);
        top = aux; 
        this.tam++;
        return aux.getElemento();
    }
 
    //devuelve el estado de la pila
    public String toString() {
 
        if (isEmpty()) {
            return "La pila esta vacia";
        } else {
 
            String resultado = "";
            Nodo<T> aux = top;
        
            while (aux != null) {
                resultado += aux.toString();
                aux = aux.getSiguiente();
            }
 
            return resultado;
 
        }
 
    }
 
}
