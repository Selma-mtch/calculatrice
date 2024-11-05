/**
 * Classe Nombre
 */
public class Nombre extends Expression
{
    private double valeurNombre;

/**
 * Ce constructeur créer un nombre ayant pour valeur celle placée en paramètre. 
 * @param valeur : un nombre décimal
 */

    //constructeur champs à champs
    public Nombre(double valeur)
    {
        this.valeurNombre=valeur ;
    }

/**
 * Cette fonction renvoie la valeur du nombre.
 *  @return double : la valeur de l'objet courant.
 */

    //renvoie la valeur du nombre
    public double valeur()
    {
        return this.valeurNombre;
    }

/**
 * Cette fonciton toString renvoie la valeur de l'objet courant dans une chaîne de caractère.
 * @return String 
 */
    //description du nombre
    public String toString()
    { 
        String s ="";
        return new String( s+ this.valeur());
    }
}
