import java.util.Scanner;


class CONTRATO{
	public static void main(String[] args){
		int digito;
		String numeros;

		Scanner entrada = new Scanner(System.in);

		digito = entrada.nextInt();
		
		while(digito != 0){
			numeros = entrada.nextLine().trim();

			numeros = numeros.replace(Integer.toString(digito), "");
			if(numeros.isEmpty()){
				numeros = "0";
			}else{
				int inicio = 0;
				for(int i = 0; i < numeros.length() - 1; i++){
					if(numeros.startsWith("0")){
						inicio++;
					}else{
						break;
					}
				}
				numeros = numeros.substring(inicio);
			}
			System.out.println(numeros);

			digito = entrada.nextInt();
		}
	}
}
