
/**
 * Write a description of class Cubata here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Cubata
{
    // instance variables - replace the example below with your own
    private String nombre;
    private int cantidadAlcohol;
    
    /**
     * Constructor for objects of class Cubata
     */
    public Cubata(String nombre, int cantidadAlcohol)
    {
        this.nombre = nombre;
        this.cantidadAlcohol = cantidadAlcohol;
    }
    
    public int getBeber()
    {
        return cantidadAlcohol;
    }

}
