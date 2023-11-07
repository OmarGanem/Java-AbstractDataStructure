
/**
 * Write a description of class Josephus here.
 *
 * @author Omar Ganem
 * @version August 24 2023
 */
public class Josephus
{
    static class Node
    {
        int val;
        Node next;
        public Node(int v)
        {
            val = v;
        }
    }
    public static void main(String[] args)
    {
        int n = Integer.parseInt(args[0]);
        int m = Integer.parseInt(args[1]);
        Node t = new Node(1);//primer nodo
        Node x = t;//ultimo nodo
        for (int i = 2; i<=n; i++)
        {
            x = (x.next = new Node(i)); //creando la lista con los siguentes nodos
        }
        x.next = t; //cerramos la lista circular
        while (x != x.next )
        {
            for (int i=1; i<m; i++)
            {
                x = x.next;
            }
            x.next = x.next.next;
            System.out.println("El sobreviviente es:" + x.val);
        }
    }
}
