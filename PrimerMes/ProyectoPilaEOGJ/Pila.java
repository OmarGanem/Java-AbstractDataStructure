
/**
 * Write a description of class Pila here.
 *
 * @author Omar Ganem
 * @version 29/Agosto/2023
 */
public class Pila
{
    class Node 
    { 
        Object elem;
        Node Next;
        
        public Node(Object o)
        {
            elem = o;
            Next = null;
        }
    }
    Node end;
    int size;
    /**
     * Constructor for objects of class Pila
     */
    public Pila()
    {
        // definir la pila
        end = null;
        size = 0;
    }
    public void push (Object o)  
    {
        Node new_node = new Node(o);
        if (end == null)
            end = new_node;
        else 
        {
            new_node.Next = end;
            end = new_node;
        }
        size++;
    }; //inserta el objeto a el stack
    
    public Object pop()
    {
        if (end == null)
        return null;
        ;
        Object o = end.elem;
        end = end.Next;
        size--;
        return o;
    }//saca el objeto del stack
    public boolean isEmpty()
    {
        return (size == 0);
    }
    public int size ()
    {
        return size;
    }
    public Object end()
    {
        if (end == null)
        return null;
    else
        return end.elem;
    }
}
