import java.util.Scanner;

class PEDAGIO1{
	public static void main(String[] args){
		int qtdPedagios, custoTotal, precoKm, precoPedagio, tamanhoEstrada, distanciaPedagios;
		Scanner entrada = new Scanner(System.in);

		tamanhoEstrada = entrada.nextInt();
		distanciaPedagios = entrada.nextInt();

		qtdPedagios = tamanhoEstrada / distanciaPedagios;

		precoKm = entrada.nextInt();
		precoPedagio = entrada.nextInt();

		custoTotal = qtdPedagios * precoPedagio + tamanhoEstrada * precoKm;
		System.out.println(custoTotal);
	}
}
