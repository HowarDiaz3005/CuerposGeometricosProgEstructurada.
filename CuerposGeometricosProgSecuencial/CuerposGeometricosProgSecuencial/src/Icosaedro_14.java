import java.util.Scanner;

public class Icosaedro_14
{
    public static void main(String[] args) throws Exception 
    {
        Scanner scanner = new Scanner(System.in);
        System.out.println("........BIENVENIDO A SU CALCULADOR ICOSAEDRO........");
        System.out.println("Ingrese la arista de su Icosaedro : ");
        double Aris14 = scanner.nextDouble();  
        double Ar14 = 5 * Math.pow(Aris14, 2) * Math.sqrt(3);
        double V14 = (5/12) * (3 + Math.sqrt(5)) * Math.pow(Aris14, 3);  
        System.out.println("El Area de su Icosaedro es : " + Ar14);
        System.out.println("El Volumen de su Icosaedro es : " + V14);
    }
}