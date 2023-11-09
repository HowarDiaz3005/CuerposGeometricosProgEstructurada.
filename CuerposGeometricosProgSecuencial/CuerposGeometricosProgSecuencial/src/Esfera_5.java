import java.util.Scanner;

public class Esfera_5 
{
    public static void main(String[] args) throws Exception 
    {
        Scanner scanner = new Scanner(System.in);
        System.out.println("........BIENVENIDO A SU CALCULADOR ESFERA........");
        System.out.println("Ingrese el radio de su Esfera : ");
        double Rad3 = scanner.nextDouble();   
        double Ar = (4*Math.PI*Math.pow(Rad3,2));
        double V5 = ((4/3)*Math.PI*Math.pow(Ar, 3));
        System.out.println("El Area de su Esfera es : " + Ar);
        System.out.println("El Volumen de su Esfera es : " + V5);
    }
}