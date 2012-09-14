#include <stdio.h>

int main(){
	int acmA, acmB, nRodadas, teste;
	int i, aux;

	scanf("%d", &nRodadas);
	teste = 1;
	while(nRodadas > 0){
		acmA = 0;
		acmB = 0;
		
		for(i = 0; i < nRodadas; i++){
			scanf("%d", &aux);
			acmA += aux;
			scanf("%d", &aux);
			acmB += aux;
		}

		printf("Teste %d\n", teste);

		if(acmA > acmB)
			printf("Aldo");
		else
			printf("Beto");

		printf("\n\n");

		scanf("%d", &nRodadas);
		teste++;
	}

	return 0;
}
