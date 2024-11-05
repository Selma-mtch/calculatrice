public abstract class Operation extends Expression
{
    private Expression operande1;
    private Expression operande2;

    //constructeur champs à champs
    public Operation(Expression op1, Expression op2)
    {
        this.operande1= op1;
        this.operande2= op2;
    }

    //méthode abstraite qui devra renvoyer la valeur de l'opération
    public abstract double valeur();

    //renvoie la valeur de la première opérande
    public Expression getOperande1()
    {
        return this.operande1;
    }

    //renvoie la valeur de la deuxième opérande
    public Expression getOperande2()
    {
        return this.operande2;
    }
}