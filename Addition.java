public class Addition extends Operation
{
    //constructeur champs à champs
    public Addition(Expression op1, Expression op2)
    {
        super(op1,op2);
    }

    //retourne le résultat de l'additon
    public double valeur()
    {
        return this.getOperande1().valeur() + this.getOperande2().valeur() ;
    }

    //retourne le calcul entre parenthèse (mais sans le résultat)
    public String toString()
    {
        return "("+ this.getOperande1() + "+" + this.getOperande2() + ")";
    }
}