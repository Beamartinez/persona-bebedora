
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
    private int cantidadAlcohol;
    private int limiteAlcohol;
    

    /**
     * Constructor for objects of class Bebedor
     */
    public Bebedor(String nombre, int limiteAlcohol)
    {
        this.nombre = nombre;
        cantidadAlcohol = 0;
        this.limiteAlcohol = limiteAlcohol;
    }
    
    /*
     * Tomar una copa
     */
    public void borrachera(Cubata copa)
    {
        if(cantidadAlcohol > limiteAlcohol)
        {
            cantidadAlcohol = cantidadAlcohol + copa.getBeber();
        }
        else
        {
            System.out.println("No quiero mas copas");
        }
    }
    
    /*
     * Comprueba la cantidad de alcohol
     */
    public void cantidadAl()
    {
        if(cantidadAlcohol > 0)
        {
            System.out.println("He bebido" + cantidadAlcohol);
        }
        else
        {
            System.out.println("No he bebido nada");
        }
    }
    
    /*
     * Pregunta
     */
    public void pregunta(String preg)
    {
        if(cantidadAlcohol > limiteAlcohol)
        {
            System.out.println("Gritando: " + preg);
        }
        else
        {
            if(preg.length()%2 == 0)
            {
                System.out.println("Si");
            }
            else
            {
                System.out.println("No");
            }
        }
    }

}
