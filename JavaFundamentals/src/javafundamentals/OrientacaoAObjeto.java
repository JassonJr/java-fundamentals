package javafundamentals;

public class OrientacaoAObjeto {
	
	public static class Estudante {
		private String nome;
		private int matricula;
		private double media;
		
		public Estudante(String nome, int matricula, double media) {
			this.nome = nome;
			this.matricula = matricula;
			this.media = media;
		}
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String nome = "Felip";
		int matricula = 112233;
		double media = 9.5;
		
		Estudante aluno = new Estudante("Felipe", 112233, 9.5);
		

		System.out.println("Dados do aluno\n\tNome: " + aluno.nome + "\n\tMatricula: " + aluno.matricula + "\n\tMedia: " + aluno.media);
		//System.out.println("O nome do aluno é: " + nome + "\nA matricula do aluno é: " + matricula + "\nA média do aluno é: " + media);
		
		String[] frutas = {"Maçã","Banana","Abacaxi","Laranja"};
		double[] preco = {1.50,2.00,5.99,1.75};
		
		System.out.println("Tabela de preços de frutas:");
		for (int i = 0; i < frutas.length; i++) {
			System.out.println("\n\t" + frutas[i]);
			System.out.println("\tR$" + preco[i]);
		}
		
		System.out.println("\nTamanho array: " + frutas.length);
		
		//Casting de tipo
		int answer = (int) Math.sqrt(625);
		System.out.println("\n\nResultado: " + answer);
	}
}
