public class Multiplication extends Operation
{
    //constructeur champs à champs
    public Multiplication(Expression op1, Expression op2)
    {
        super(op1,op2);
    }

    //retroune le résultat de la multiplication
    public double valeur()
    {
        return this.getOperande1().valeur() * this.getOperande2().valeur();
    }

    //retourne le calcul entre parenthèse (mais sans le résultat)
    public String toString()
    {
        return "("+ this.getOperande1() + "*" + this.getOperande2()+ ")";
    }
}