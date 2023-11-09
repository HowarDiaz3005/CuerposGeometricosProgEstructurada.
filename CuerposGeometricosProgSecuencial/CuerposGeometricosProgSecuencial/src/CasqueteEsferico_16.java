import java.util.Scanner;

public class CasqueteEsferico_16
{
    public static void main(String[] args) throws Exception 
    {
        Scanner scanner = new Scanner(System.in);
        System.out.println("........BIENVENIDO A SU CALCULADOR CASQUETE ESFERICO........");
        System.out.println("Ingrese la altura de su Casquete Esferico : ");
        double alt16 = scanner.nextDouble();
        System.out.println("Ingrese el radio mayor de su Casquete Esferico : ");
        double RadMay16 = scanner.nextDouble();
        double Ar16 = (2*Math.PI*RadMay16*alt16);
        double V16 = ((Math.PI*Math.pow(alt16,2)*(3*RadMay16-alt16))/6);
        System.out.println("El Area de su Casquete Esferico es : " + Ar16);
        System.out.println("El Volumen de su Casquete Esferico es : " + V16);
    }
}