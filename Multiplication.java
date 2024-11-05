public class Multiplication extends Operation
{

/**
 * Constructeur crée une multiplication composée de deux Expressions placées en paramètres.
 *  @param op1 : une Expression
 * @param op2: une Expression
 */

    //constructeur champs à champs
    public Multiplication(Expression op1, Expression op2)
    {
        super(op1,op2);
    }

/**
 * Cette fonction renvoie le résultat de de la multiplication.
 *  @return double : le résultat de la multiplication courante.
 */

    //retroune le résultat de la multiplication
    public double valeur()
    {
        return this.getOperande1().valeur() * this.getOperande2().valeur();
    }

/**
 * Cette fonction toString renvoie descritpion de la multiplication sans le résultat.
 *  @return String: la multiplication
 */

    //retourne le calcul entre parenthèse (mais sans le résultat)
    public String toString()
    {
        return "("+ this.getOperande1() + "*" + this.getOperande2()+ ")";
    }
}
