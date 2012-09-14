#include <stdio.h>
#include <string.h>

int main(){
	char numeros[100];
	char digito;
	int i;
	int mostrei;

	scanf("%c", &digito);
	while(digito != '0'){
		scanf("%s", numeros);
		mostrei = 0;
		for(i = 0; i < strlen(numeros); i++){
			if(numeros[i] != digito && (numeros[i] != '0' || mostrei)
				){
				printf("%c", numeros[i]);
				mostrei++;
			}
		}
		if(mostrei == 0){
			printf("0");
		}
		printf("\n");

		scanf("%*c");
		scanf("%c", &digito);
	}


	return 0;
}

