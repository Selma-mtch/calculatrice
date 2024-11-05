/**
 * Classe Addition
 */
public class Addition extends Operation
{

/**
 * Constructeur crée une addition composée de deux Expressions placées en paramètres.
 *  @param op1 : une Expression
 * @param op2: une Expression
 */

    //constructeur champs à champs
    public Addition(Expression op1, Expression op2)
    {
        super(op1,op2);
    }

/**
 * Cette fonction renvoie le résultat de l'addition.
 *  @return double : le résultat de l'addition courante.
 */

    public double valeur()
    {
        return this.getOperande1().valeur() + this.getOperande2().valeur() ;
    }

/**
 * Cette fonction toString renvoie descritpion de l'addition sans le résultat.
 *  @return String: l'addition
 */

    //retourne le calcul entre parenthèse (mais sans le résultat)
    public String toString()
    {
        return "("+ this.getOperande1() + "+" + this.getOperande2() + ")";
    }
}
