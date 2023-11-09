import java.util.Scanner;

public class ZonaEsferica_6 
{
    public static void main(String[] args) throws Exception 
    {
        Scanner scanner = new Scanner(System.in);
        System.out.println("........BIENVENIDO A SU CALCULADOR ZONA ESFERICA........");
        System.out.println("Ingrese el radio de su Zona Esferica : ");
        double Rad6 = scanner.nextDouble();   
        System.out.println("Ingrese la altura de su Zona Esferica : ");
        double alt6 = scanner.nextDouble();   
        System.out.println("Ingrese el radio mayor de su Zona Esferica : ");
        double RadMyr6 = scanner.nextDouble();   
        double area = (2*Math.PI*RadMyr6*alt6);
        double volumen = ((Math.PI*alt6*(Math.pow(alt6,2)+3*Math.pow(Rad6,2)+3*Math.pow(RadMyr6, 2)))/6);
        System.out.println("El Area de su Zona Esferica es : " + area);
        System.out.println("El Volumen de su Zona Esferica es : " + volumen);
    }
}