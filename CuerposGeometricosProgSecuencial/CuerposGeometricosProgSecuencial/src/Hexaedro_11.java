import java.util.Scanner;

public class Hexaedro_11
{
    public static void main(String[] args) throws Exception 
    {
        Scanner scanner = new Scanner(System.in);
        System.out.println("........BIENVENIDO A SU CALCULADOR HEXAEDRO........");
        System.out.println("Ingrese la arista de su Hexaedro : ");
        double Aris11 = scanner.nextDouble();    
        double Ar11 = (6*Math.pow(Aris11,2));
        double Dig11 = (Aris11*Math.sqrt(3));
        double V11 = Math.pow(Aris11, 3); 
        System.out.println("El Area de su Hexaedro es : " + Ar11);
        System.out.println("La Diagonal de su Hexaedro es : " + Dig11);
        System.out.println("El Volumen de su Hexaedro es : " + V11);
    }
}