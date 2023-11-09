import java.util.Scanner;

public class Dodecaedro_13
{
    public static void main(String[] args) throws Exception 
    {
        Scanner scanner = new Scanner(System.in);
        System.out.println("........BIENVENIDO A SU CALCULADOR DODECAEDRO........");
        System.out.println("Ingrese la arista de su Dodecaedro : ");
        double Aris13 = scanner.nextDouble();
        double Ar13 = (3*Math.pow(Aris13,2)*Math.sqrt(25+10+Math.sqrt(5)));
        double V13 = (1/4) * (15 + 7 * Math.sqrt(5))*Math.pow(Aris13,3);
        System.out.println("El Area de su Dodecaedro es : " + Ar13);
        System.out.println("El Volumen de su Dodecaedro es : " + V13);        
    }
}