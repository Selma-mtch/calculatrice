public class Calculatrice
{
    public static void main(String [] args)
    {
        Expression deux= new Nombre(2);
        Expression trois= new Nombre(3);
        Expression dixSept= new Nombre(17);
        Expression zero= new Nombre(0);
        
        Expression s= new Soustraction(dixSept,deux);
        System.out.println(s);  //retourne (17.0 - 2)

        Expression a= new Addition(deux,trois);
        System.out.println(a);    //retourne (2.0 + 3.0)

        Expression m= new Multiplication(deux,trois);
        System.out.println(m); //retourne (2.0 * 3.0)

        Expression d=new Division(s,a);
        System.out.println(d+"="+d.valeur()); //retourne ((17.0-2.0)/(2.0+3.0))=3.0

        Expression a2= new Addition(m,s);
        System.out.println(a2+"="+a2.valeur());

        Expression de=new Division(s,zero);
        System.out.println(de+"="+de.valeur()); //retourne "Division par zéro impossible!" et le message d'erreuer
    }
}