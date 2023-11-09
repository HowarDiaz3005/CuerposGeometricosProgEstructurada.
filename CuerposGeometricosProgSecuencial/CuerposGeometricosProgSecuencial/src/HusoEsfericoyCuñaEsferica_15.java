import java.util.Scanner;

public class HusoEsfericoyCuñaEsferica_15
{
    public static void main(String[] args) throws Exception 
    {
        Scanner scanner = new Scanner(System.in);
        System.out.println("........BIENVENIDO A SU CALCULADOR HUSO ESFERICO Y CUÑA ESFERICA........");
        System.out.println("Ingrese el radio de su Huso Esferico y Cuña Esferica : ");
        double Rad15 = scanner.nextDouble();
        System.out.println("Ingrese el numero de grados de su Huso Esferico y Cuña Esferica : ");
        double NrGrd15 = scanner.nextDouble();
        double Ar15 = ((4*Math.PI*Math.pow(Rad15,2)*NrGrd15)/360);
        double V15 = (((4/3)*4*Math.pow(Math.PI, 3)*NrGrd15)/360); 
        System.out.println("El Area de su Huso Esferico y Cuña Esferica es : " + Ar15);
        System.out.println("El Volumen de su Huso Esferico y Cuña Esferica es : " + V15);
    }
}