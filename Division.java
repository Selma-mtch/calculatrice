/**
 * Classe Division
 */
public class Division extends Operation
{

/**
 * Constructeur crée une division composée de deux Expressions placées en paramètres.
 *  @param op1 : une Expression
 * @param op2: une Expression
 */

    public Division(Expression op1, Expression op2)
    {
        super(op1,op2);
    }

/**
 * Cette fonction renvoie le résultat de la division.
 * @return double : le résultat de la division courante.
 * @throws ArithmeticException If an input or output exception occurred
 */
    public double valeur()
    {
        try{
            double operande1= this.getOperande1().valeur();
            double operande2= this.getOperande2().valeur(); 
            return this.getOperande1().valeur() / this.getOperande2().valeur();
        }

        catch(ArithmeticException e) {
            System.out.println(e.getMessage());
        }
    }

/**
 * Cette fonction toString renvoie descritpion de la division sans le résultat.
 *  @return String: la division
 */

    public String toString()
    {
        return "("+ this.getOperande1() + "/" + this.getOperande2()+ ")";
    }
}
