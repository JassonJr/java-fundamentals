package javafundamentals;
import java.util.Scanner;

public class Exercicios {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//declaração de variáveis
		double gallon = 3.785;
		double gal = 20;
		double lit = 0;
		//adicione o calculo aqui
		lit = gallon * gal / 1;
		
		System.out.println(gal+ " gallons equals " +lit+" liters");
		
		int j=7,k=5,m=8,result; 
		result = j - k % 3 * m; 		
		System.out.println(result);
		
		System.out.println( 123 * 100 + 45);
		System.out.println("123" + 45);
		System.out.println( 12 + "345");
		
		Scanner sc1 = new Scanner(System.in);
		//lit = gallon * in / 1;
		
	}

}
