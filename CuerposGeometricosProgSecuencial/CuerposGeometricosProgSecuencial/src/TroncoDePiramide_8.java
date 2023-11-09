import java.util.Scanner;

public class TroncoDePiramide_8 
{
    public static void main(String[] args) throws Exception 
    {
        Scanner scanner = new Scanner(System.in);
        System.out.println("........BIENVENIDO A SU CALCULADOR TRONCO DE PIRAMIDE........");
        System.out.println("Ingrese la longitd del lado mayor de su Tronco de Piramide : ");
        double LongMyr = scanner.nextDouble();  
        System.out.println("Ingrese la longitud del lado menor de su Tronco de Piramide : ");
        double LongMnr = scanner.nextDouble();  
        System.out.println("Ingrese la altura de su Tronco de Piramide : ");
        double alt8 = scanner.nextDouble();   
        double LongMyrMitd8 = (LongMyr/2);
        double ApPi8 = Math.sqrt(Math.pow(alt8,2)+Math.pow(LongMyrMitd8,2));
        double ArBas8 = Math.pow(LongMyr,2);
        double Arbas8 = Math.pow(LongMnr,2);
        double PerBase8 = (LongMyr*4);
        double Perbase8 = (LongMnr*4);
        double ArLat8 = (((PerBase8+Perbase8)/2)*ApPi8);
        double ArTot8 = ((ArLat8+ArBas8)+ArBas8);
        double V8 = ((1/3)*alt8*(ArBas8+ArBas8+Math.sqrt(ArBas8*ArBas8)));    
        System.out.println("El Area Lateral de su Tronco de Piramide es : " + ArLat8);
        System.out.println("El Area Total de su Tronco de Piramide es : " + ArTot8);
        System.out.println("El Volumen de su Tronco de Piramide es : " + V8);   
    }
}
