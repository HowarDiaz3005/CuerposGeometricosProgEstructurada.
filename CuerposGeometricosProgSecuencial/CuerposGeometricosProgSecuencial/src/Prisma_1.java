import java.util.Scanner;

public class Prisma_1 
{
    public static void main(String[] args) throws Exception 
    {
        Scanner scanner = new Scanner(System.in);
        System.out.println("........BIENVENIDO A SU CALCULADOR PRISMA........");
        System.out.println("Ingrese la cantidad de lados de su Prisma : ");
        int CantLad1 = scanner.nextInt();
        System.out.println("Ingrese la longitud de lados de su Prisma : ");
        double LongLad1 = scanner.nextDouble();
        System.out.println("Ingrese la altura de su Prisma : ");
        double alt1 = scanner.nextDouble();
        double PerBase1 = (CantLad1*LongLad1);
        double ArLat1 = (PerBase1*alt1);
        Double Af1 = ((Math.PI/180)*(380/CantLad1));
        double Apo1 =  (LongLad1/(2*Math.tan((Af1)/2)));
        double ArBas1 = ((PerBase1*Apo1)/2);
        double ArTot1 = (ArLat1+(2*ArBas1));  
        double V1 = (ArBas1*alt1);
        System.out.println("El Area Lateral de su figura Prisma es : " + ArLat1);
        System.out.println("El Area Total de su figura Prisma es : " + ArTot1);
        System.out.println("El Volumen de su figura Prisma es : " + V1);
    }
}
