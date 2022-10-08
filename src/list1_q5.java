import java.util.Scanner;

public class list1_q5 
{
    public static void main(String[] args) throws Exception
    {
        double centimetros, metros;
        Scanner teclado = new Scanner(System.in);
        metros = teclado.nextDouble();

        centimetros = metros*100;
        System.out.print(centimetros +" cm");
        teclado.close();
    } 



}
