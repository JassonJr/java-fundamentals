package javafundamentals;

public class TesteDeTipos {
	
	
	public static void main(String[] args) {
		types();
		operators();
	}
	//Tipos de dados
		public static int x = 10;
		public static void types() {
			{
				int y = 6;
				System.out.println(y);
			}
			//double x = 5.7;
			
			int num = 4;
			char capitalJ = 'J';
			float numF = 3.14F;
			long longNum = 3000;
			double numD = 3.14159;
			
			//print
			System.out.println(x);
			func();
			int x = (int) 5.745;
			System.out.println(x);
		}
	public static void func() {
		int x = 15;
		System.out.println(x);
	}
	
	//Operadores
	public static void operators() {
		boolean a = true;
		boolean b = false;
		boolean c;
		
		int x = 5;
		int y = 3;
		int	result;
		
		//And
		c = a && b;
		System.out.println("And: " + c);
		//Or
		c = a || b;
		System.out.println("Or: " + c);
		//not 
		System.out.println("Not: " + !a);
		//Diferente
		c = a != b;
		System.out.println("Diferente: " + c);
		//Igual
		c = a == b;
		System.out.println("Igual: " + c);
		//Maior que
		c = x > y;
		System.out.println("Maior que: " + c);
		//Maior ou igual
		c = x >= y;
		System.out.println("Maior ou igual: " + c);
		//Menor que
		c = x < y;
		System.out.println("Menor que: " + c);
		//Menor ou igual
		c = x <= y;
		System.out.println("Menor ou igual: " + c);
		
		//Soma
		result = x + y;
		System.out.println("Soma: " + result);
		//Subtração
		result = x - y;
		System.out.println("Subtração: " + result);
		//Multiplicação
		result = x * y;
		System.out.println("Multiplicação: " + result);
		//Divisão
		result = x / y;
		System.out.println("Divisão: " + result);
		//Modular (encontra o resto)
		result = x % y;
		System.out.println("Resto: " + result);
		//pré-incremento
		result = ++x;
		System.out.println("Pré-incremento: " + result);
		//pós-incremento
		result = y++;
		System.out.println("Pós-incremento: " + result);
		//pré-subtrai
		result = --x;
		System.out.println("Pré-subtrai: " + result);
		//pós-subtrai
		result = y--;
		System.out.println("Pós-subtrai: " + result);
	}
}
