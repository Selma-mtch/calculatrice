public class Nombre extends Expression
{
    private double valeurNombre;

    //constructeur champs à champs
    public Nombre(double valeur)
    {
        this.valeurNombre=valeur ;
    }

    //renvoie la valeur du nombre
    public double valeur()
    {
        return this.valeurNombre;
    }

    //description du nombre
    public String toString()
    { 
        String s ="";
        return new String( s+ this.valeur());
    }
}