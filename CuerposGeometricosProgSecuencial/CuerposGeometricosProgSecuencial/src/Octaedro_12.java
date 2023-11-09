import java.util.Scanner;

public class Octaedro_12
{
    public static void main(String[] args) throws Exception 
    {
        Scanner scanner = new Scanner(System.in);
        System.out.println("........BIENVENIDO A SU CALCULADOR OCTAEDRO........");
        System.out.println("Ingrese la arista de su Octaedro : ");
        double Aris12 = scanner.nextDouble(); 
        double Ar12 = (2*Math.pow(Aris12,2)*Math.sqrt(3));
        double V12 = (Math.sqrt(2)/3)*Math.pow(Aris12,3); 
        System.out.println("El Area de su Octaedro es : " + Ar12);
        System.out.println("El Volumen de su Octaedro es : " + V12);
    }
}