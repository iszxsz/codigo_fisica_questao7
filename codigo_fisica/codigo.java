import java.util.Scanner;

class Equacao{
    double l;
    double k;
    double e;
    double te;
    double area;
    double potencia;
    
    double calculaEquacao(){
        area = Math.pow(l, 2) * 6;
        potencia = (k * area * (25 - te)) / e;
        
        return potencia;
    }
}

public class Main
{
	public static void main(String[] args) {
	    Scanner scan = new Scanner(System.in);
	    Equacao problema1 = new Equacao();
		System.out.println("Digite a aresta L da sala: \n");
		problema1.l = scan.nextDouble();
		System.out.println("Digite a condutividade térmica K do material: \n");
		problema1.k = scan.nextDouble();
		System.out.println("Digite a espessura E do material: \n");
		problema1.e = scan.nextDouble();
		System.out.println("Digite a temperatura externa TE: \n");
		problema1.te = scan.nextDouble();
		
		System.out.printf("A potência gasta pelo aquecedor para manter a temperatura da sala é: %.2f W \n", problema1.calculaEquacao());
	}
}