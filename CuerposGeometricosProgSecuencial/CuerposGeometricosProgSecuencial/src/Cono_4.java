import java.util.Scanner;

public class Cono_4 
{
    public static void main(String[] args) throws Exception 
    {
        Scanner scanner = new Scanner(System.in);
        System.out.println("........BIENVENIDO A SU CALCULADOR CONO........");
        System.out.println("Ingrese la altura de su Cono : ");
        double alt4 = scanner.nextDouble();    
        System.out.println("Ingrese el radio de su Cono : ");
        double Rad2 = scanner.nextDouble();
        double Gen1 = Math.sqrt(Math.pow(alt4,2) + Math.pow(Rad2,2));
        double ArLat4 = (Math.PI*(Rad2*Gen1));
        double ArBas4 = (Math.PI*(Rad2*Rad2));
        double ArTot4 = (ArLat4+ArBas4);
        double V4 = ((ArBas4+ArLat4)/3); 
        System.out.println("El Area Lateral de su Cono es : " + ArLat4);
        System.out.println("El Area Total de su Cono es : " + ArTot4);
        System.out.println("El Volumen de su Cono es : " + V4);
    }
}
