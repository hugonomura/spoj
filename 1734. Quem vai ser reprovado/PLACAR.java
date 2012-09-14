import java.util.Scanner;
import java.util.NoSuchElementException;
/*
import java.util.Arrays;
import java.util.Comparator;
*/
class PLACAR{

	private static class Aluno{
		String nome;
		int problemasResolvidos;
	}

	public static void main(String[] args){
		int nInstancias;
		Aluno alunoAtual = new Aluno();
		Aluno alunoReprovado = new Aluno();

		Scanner entrada = new Scanner(System.in);
		String tmp = new String();
		String[] aux;
		int instancia = 1;

		do{
			try{
				tmp = entrada.nextLine();
				if(tmp != null && !tmp.isEmpty() && !tmp.equals("") && !tmp.equals(" ")){
					nInstancias = Integer.parseInt(tmp);
					
					tmp = entrada.nextLine();
					aux = tmp.split(" ");
					alunoReprovado.nome = aux[0];
					alunoReprovado.problemasResolvidos = Integer.parseInt(aux[1]);

					// Fazendo a leitura do nome dos alunos e os problemas resolvidos
					for(int i = 0; i < nInstancias - 1; i++){
						tmp = entrada.nextLine();
						aux = tmp.split(" ");
						alunoAtual.nome = aux[0];
						alunoAtual.problemasResolvidos = Integer.parseInt(aux[1]);
						if(alunoReprovado.problemasResolvidos >= alunoAtual.problemasResolvidos){
							if(alunoAtual.problemasResolvidos == alunoReprovado.problemasResolvidos && alunoAtual.nome.compareTo(alunoReprovado.nome) > 0 || alunoAtual.problemasResolvidos < alunoReprovado.problemasResolvidos){
								alunoReprovado.nome = alunoAtual.nome;
								alunoReprovado.problemasResolvidos = alunoAtual.problemasResolvidos;
							}
						}
						aux = null;
					}

					// Mostrando a saida
					System.out.println("Instancia " + instancia);
					System.out.println(alunoReprovado.nome);

					instancia++;
				}
			}catch(NoSuchElementException nd){
				break;
			}
			
		}while(tmp != null && !tmp.isEmpty() && !tmp.equals("") && !tmp.equals(" "));
		entrada.close();

	}
}