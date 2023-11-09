import java.util.Scanner;

public class Cilindro_2 
{
    public static void main(String[] args) throws Exception 
    {
        Scanner scanner = new Scanner(System.in);
        System.out.println("........BIENVENIDO A SU CALCULADOR CILINDRO........");
        System.out.println("Ingrese el radio de su Cilindro : ");
        double Rad1 = scanner.nextDouble();  
        System.out.println("Ingrese la altura de su Cilindro : ");
        double alt2 = scanner.nextDouble();     
        double PerBase2 = ((2*Math.PI)*Rad1);
        double ArLat2 = (PerBase2*alt2);
        double ArBas2 = (Math.PI*Math.pow(Rad1,2));
        double ArTot2 = (ArLat2+(2*ArBas2));
        double V2 = (ArBas2*alt2);
        System.out.println("El Area Lateral de su figura Cilindro es : " + ArLat2);
        System.out.println("El Area Total de su figura Cilindro es : " + ArTot2);
        System.out.println("El Volumen de su figura Cilindro es : " + V2);
    }
}