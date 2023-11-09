import java.util.Scanner;

public class Ortoedro_9 
{
    public static void main(String[] args) throws Exception 
    {
        Scanner scanner = new Scanner(System.in);
        System.out.println("........BIENVENIDO A SU CALCULADOR ORTOEDRO........");
        System.out.println("Ingrese la altura de su Ortoedro : ");
        double alt9 =  scanner.nextDouble();
        System.out.println("Ingrese la base de su Ortoedro : ");
        double bas9 = scanner.nextDouble(); 
        System.out.println("Ingrese la arista de su Ortoedro : ");
        double Aris9 = scanner.nextDouble();
        double Ar9 = 2 * (Aris9*bas9+Aris9*alt9+bas9*alt9);
        double Diag9 = Math.sqrt(Math.pow(Aris9,2)+Math.pow(bas9,2)+Math.pow(alt9,2));
        double V9 = Aris9 * bas9 * alt9;
        System.out.println("El Area de su Ortoedro es : " + Ar9);
        System.out.println("La Diagonal de su Ortoedro es : " + Diag9);
        System.out.println("El Volumen de su Ortoedro es : " + V9);
    }
}
