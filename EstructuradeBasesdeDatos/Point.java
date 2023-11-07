
/**
 * Write a description of class Point here.
 *Esta clase representa los puntos en un sistema coordenado 2D
 * @author EOGJ
 * @version 17/08/23
 */
public class Point
{
    private double x;
    private double y;
    

    /**
     * Constructor for objects of class Point
     */
    public Point()
    {
        x = Math.random();
        y = Math.random();
    }

    /**
     * constructor sobrecargado dor objects of class point
     */
    public Point(double x, double y)
    {
        this.x = x;
        this.y = y;
    }

    /**
     * Metodo getX regresa el atributo X
     *
     * @param  no tiene parametro x  el nuevo valor del atributo x
     * @return    el valor del atributo x
     */
    public double getX()
    {
        return this.x;
    }
    
    /**
     * Metodo getY regresa el atributo y
     *
     * @param  no tiene parametro x  el nuevo valor del atributo y
     * @return    el valor del atributo y
     */
    public double getY()
    {
        return this.y;
    }
    
    /**
     * Metodo setX establece el atributo X
     *
     * @param x  el nuevo valor del atributo x
     * @return    no regresa nada
     */
    public void setX(double x)
    {
        this.x = x;
    }
    
        /**
     * Metodo setY establece el atributo y
     *
     * @param y  el nuevo valor del atributo y
     * @return    no regresa nada
     */
    public void setY(double y)
    {
        this.y = y;
    }
    
    public double distance(Point point)
    {
    double deltaX = this.x - point.x;
    double deltaY = this.y - point.y;
    return Math.sqrt(deltaX*deltaY);
    }


}
