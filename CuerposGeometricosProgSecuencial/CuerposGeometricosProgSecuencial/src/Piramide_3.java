import java.util.Scanner;

public class Piramide_3 
{
    public static void main(String[] args) throws Exception 
    {
        Scanner scanner = new Scanner(System.in);
        System.out.println("........BIENVENIDO A SU CALCULADOR PIRAMIDE........");
        System.out.println("Ingrese la altura de su Piramide : ");
        double alt3 = scanner.nextDouble(); 
        System.out.println("Ingrese la longitud de lados de su Piramide : ");
        double LongLads3 = scanner.nextDouble(); 
        System.out.println("Ingrese la anchura de los lados de su Piramide : ");
        double AnchLads3 = scanner.nextDouble();   
        double PerBase3 = ((2*LongLads3)+(2*AnchLads3));
        double Apo3 = (LongLads3/2);
        double ArPir3 = Math.sqrt(Math.pow(alt3,2)+Math.pow(Apo3,2));
        double ArLat3 = ((PerBase3*ArPir3)/2);
        double ArTot3 = (ArLat3+PerBase3);
        double ArBas3 = (LongLads3/2);
        double V3 = ((ArBas3* alt3)/3);
        System.out.println("El Area Lateral de su figura Piramide es : " + ArLat3);
        System.out.println("El Area Total de su figura Piramide es : " + ArTot3);
        System.out.println("El Volumen de su figura Piramide es : " + V3);
    }
}