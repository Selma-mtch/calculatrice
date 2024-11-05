/**
 * Classe Operation
 */
public abstract class Operation extends Expression
{
    private Expression operande1;
    private Expression operande2;
/**
 * Constructeur crée une opération composée de deux Expressions placées en paramètres.
 *  @param op1 : une Expression
 * @param op2: une Expression
 */
    //constructeur champs à champs
    public Operation(Expression op1, Expression op2)
    {
        this.operande1= op1;
        this.operande2= op2;
    }

/**
 * Cette fonction abstraite doit renvoyer le résultat de de l'opération. <br/>
 * 
 * Elle doit être implementée obligatoirement dans les classes fille de Opération.
 *  @return double : le résultat de l'opération courante.
 */

    //méthode abstraite qui devra renvoyer la valeur de l'opération
    public abstract double valeur();


/**
 * Cette fonction renvoie la valeur de la première opérande de l'opération.
 * @return Expression : valeur de op1.
 */
    //renvoie la valeur de la première opérande
    public Expression getOperande1()
    {
        return this.operande1;
    }

/**
 * Cette fonction renvoie la valeur de la deuxième opérande de l'opération.
 * @return Expression : valeur de op2.
 */

    //renvoie la valeur de la deuxième opérande
    public Expression getOperande2()
    {
        return this.operande2;
    }
}
