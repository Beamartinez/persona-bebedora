
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
    private float cantidadAlcohol;
    
    /**
     * Constructor for objects of class Cubata
     */
    public Cubata(String nombre, float cantidadAlcohol)
    {
        this.nombre = nombre;
        this.cantidadAlcohol = cantidadAlcohol;
    }
    
    /*
     * Metodo que depende de la cantidad de alcohol
     */
    public float getCantidadAlcohol()
    {
        return cantidadAlcohol;
    }

}
