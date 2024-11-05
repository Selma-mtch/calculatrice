public class Division extends Operation
{
    public Division(Expression op1, Expression op2)
    {
        super(op1,op2);
    }

    public double valeur() throws ArithmeticException
    {
        try{
            double operande1= this.getOperande1().valeur();
            double operande2= this.getOperande2().valeur();
            
            if (operande2==0){
                throw new ArithmeticException("Division par zéro impossible!");
            }
           return operande1/operande2;
        }

        catch(ArithmeticException e) {
            System.err.println(e.getMessage());
            throw e;
        }
    }

    public String toString()
    {
        return "("+ this.getOperande1() + "/" + this.getOperande2()+ ")";
    }
}