import java.util.Scanner;

public class Tetraedro_10
{
    public static void main(String[] args) throws Exception 
    {
        Scanner scanner = new Scanner(System.in);
        System.out.println("........BIENVENIDO A SU CALCULADOR TETRAEDRO........");
        System.out.println("Ingrese la arista de su Tetraedro : ");
        double Ar10 = scanner.nextDouble();  
        double Are = Math.pow(Ar10,3)*Math.sqrt(3) ;
        double V10 = ((Math.sqrt(2)/12)*Ar10);
        double alt10 = (Ar10*(Math.sqrt(6)/3));
        System.out.println("El Area de su Tetraedro es : " + Are);
        System.out.println("El Volumen de su Tetraedro es : " + V10);
        System.out.println("El Altura de su Tetraedro es : " + alt10);
    }
}