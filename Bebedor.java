
/**
 * Write a description of class Bebedor here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Bebedor
{
    // instance variables - replace the example below with your own
    private String nombre;
    private float cantidadAlcohol;
    private float limiteAlcohol;
    private int numeroCopas;
    
    /**
     * Constructor for objects of class Bebedor
     */
    public Bebedor(String nombre, float limiteAlcohol)
    {
        this.nombre = nombre;
        cantidadAlcohol = 0;
        this.limiteAlcohol = limiteAlcohol;
        numeroCopas = 0;
    }
    
    /*
     * Devuelve el alcohol en sangre del bebedor
     */
    public float getCantidadAlcohol()
    {
        return cantidadAlcohol;
    }
    
    /*
     * Tomar una copa
     */
    public void beberCopa(Cubata copa)
    {
        float alcoholCopa;
        
        
        if(cantidadAlcohol > limiteAlcohol)
        {
            System.out.println("No quiero mas copas");
        }
        else
        {
            if(numeroCopas >= 5)
            {
                cantidadAlcohol = cantidadAlcohol + (copa.getCantidadAlcohol() * 2);
            }
            else
            {
                cantidadAlcohol = cantidadAlcohol + copa.getCantidadAlcohol();
            }
            numeroCopas=numeroCopas+1;
        }
        
    }
    
    /*
     * Pregunta
     */
    public void pregunta(String preg)
    {
        if((cantidadAlcohol > limiteAlcohol) || (preg.contains(nombre)))
        {
            System.out.println(preg.toUpperCase());
        }
        else
        {
            int numeroDeLetraDeLaPregunta = preg.length();
            if(numeroDeLetraDeLaPregunta % 2 != 0)
            {
                System.out.println("No");
            }
            else
            {
                System.out.println("Si");
            }
        }
    }
}
