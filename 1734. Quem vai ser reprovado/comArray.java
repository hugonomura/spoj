// import java.io.Console;
import java.util.Scanner;
import java.util.NoSuchElementException;

import java.util.Arrays;
import java.util.Comparator;

class PLACAR{

	private static class Aluno{
		String nome;
		int problemasResolvidos;
	}

	public static void main(String[] args){
		int nInstancias;
		Aluno[] alunosConcorrendo;
		// Console entrada = System.console();
		Scanner entrada = new Scanner(System.in);
		String tmp = new String();
		String[] aux;
		int instancia = 1;

		do{
			// tmp = entrada.readLine();
			try{
			tmp = entrada.nextLine();
			}catch(NoSuchElementException nd){
				break;
			}
			if(tmp != null && !tmp.isEmpty() && !tmp.equals("") && !tmp.equals(" ")){
				nInstancias = Integer.parseInt(tmp);
				alunosConcorrendo = new Aluno[nInstancias];

				// Fazendo a leitura do nome dos alunos e os problemas resolvidos
				for(int i = 0; i < nInstancias; i++){
					// tmp = entrada.readLine();
					tmp = entrada.nextLine();
					aux = tmp.split(" ");
					alunosConcorrendo[i] = new Aluno();
					alunosConcorrendo[i].nome = aux[0];
					alunosConcorrendo[i].problemasResolvidos = Integer.parseInt(aux[1]);
					aux = null;
				}

				// Ordenando alfabeticamente
				Arrays.sort(alunosConcorrendo, 
					new Comparator<Aluno>() {
						public int compare( Aluno a1, Aluno a2 ) {
							return (a2.nome).compareTo(a1.nome);
						}
					});

				// Ordenando pela quantidade de exercicios
				Arrays.sort(alunosConcorrendo, 
					new Comparator<Aluno>() {
						public int compare( Aluno a1, Aluno a2 ) {
							return a1.problemasResolvidos - a2.problemasResolvidos;
						}
					});

				// Mostrando a saida
				System.out.println("Instancia " + instancia);
				System.out.println(alunosConcorrendo[0].nome);

				// Arrumando as coisas para a proxima iteracao
				instancia++;
				alunosConcorrendo = null;
			}
		}while(tmp != null && !tmp.isEmpty() && !tmp.equals("") && !tmp.equals(" "));
		entrada.close();

	}
}
