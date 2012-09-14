#include <stdio.h>

int main(){
	int qtdPedagios, custoTotal, precoKm, precoPedagio, tamanhoEstrada, distanciaPedagios;

	scanf("%d %d %d %d", &tamanhoEstrada, &distanciaPedagios, &precoKm, &precoPedagio);

	qtdPedagios = tamanhoEstrada / distanciaPedagios;

	custoTotal = qtdPedagios * precoPedagio + precoKm * tamanhoEstrada;
	printf("%d\n", custoTotal);

	return 0;
}
