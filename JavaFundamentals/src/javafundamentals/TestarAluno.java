package javafundamentals;

public class TestarAluno {

	public static void main(String[] args) {
		
		Classe objeto = new Classe();
		
		objeto.definirObjeto("Caneta \n");
		
		System.out.println("Objeto: " + objeto.obterObjeto());
		
		Aluno aluno = new Aluno();
		
		aluno.definirNome("Thiago");
		
		Aluno aluno2 = new Aluno();
		
		aluno2.definirNome("Astolfo");
		
		System.out.println(aluno.obterNome());
		System.out.println(aluno2.obterNome());
	}

}
