import java.util.Scanner;

public class TroncoDeCono_7 
{
    public static void main(String[] args) throws Exception 
    {
        Scanner scanner = new Scanner(System.in);
        System.out.println("........BIENVENIDO A SU CALCULADOR TRONCO DE CONO........");
        System.out.println("Ingrese la altura de su Tronco de Cono : ");
        double alt7 = scanner.nextDouble(); 
        System.out.println("Ingrese el radio menor de su Tronco de Cono : ");
        double RadMen7 = scanner.nextDouble();
        System.out.println(" Ingrese el Radio mayor de su Tronco de Cono : ");
        double RadMay7 = scanner.nextDouble();
        double Gen7 = (Math.sqrt(Math.pow(alt7,2)+(Math.pow(RadMay7-RadMen7,2))));
        double ArBasM7 = (Math.PI*Math.pow(RadMay7, 2));
        double ArBaseMenr7 = (Math.PI*Math.pow(RadMen7, 2));
        double ArLat7 = (Math.PI*Gen7*(RadMay7+RadMen7));
        double ArTot7 = (ArLat7+(ArBasM7+ArBaseMenr7));
        double V7 = ((1/3)*Math.PI*alt7*(Math.pow(RadMay7,2)+Math.pow(RadMen7,2)+(RadMay7*RadMen7)));
        System.out.println("El Area Lateral de su Tronco de Cono es : " + ArLat7);
        System.out.println("El Area Total de su Tronco de Cono es : " + ArTot7);
        System.out.println("El Volumen de su Tronco de Cono es : " + V7);
    }
}