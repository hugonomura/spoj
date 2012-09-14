import java.io.Console;
// import java.util.List;
import java.util.ArrayList;

class hash{
	public static void main(String args[]){
		Console leitor = System.console();
		String entrada;
		String comando[];
		ArrayList<Pessoa> cadastros = new ArrayList<Pessoa>();

		do{
			entrada = leitor.readLine();
			if(entrada != null){
				comando = entrada.split(" ");
				switch(comando[0]){
					case "add":
						boolean existe = false;
						for(int i = 0; i < cadastros.size(); i++){
							if(((Pessoa)cadastros.get(i)).id.equals(comando[1])){
								System.out.println("ID " + comando[1] + " ja cadastrado.");
								existe = true;
								break;
							}
						}
						if(existe == false){
							Pessoa tmp = new Pessoa();
							tmp.id = comando[1];
							tmp.name = comando[2];
							tmp.lastName = comando[3];
							tmp.birthday = comando[4];
							tmp.telephone = comando[5];
							
							cadastros.add(tmp);
						}
					break;

					case "del":
						int posicaoElemento = -1;
						for(int i = 0; i < cadastros.size(); i++){
							if(((Pessoa)cadastros.get(i)).id.equals(comando[1])){
								posicaoElemento = i;
								break;
							}
						}
						if(posicaoElemento == -1)
							System.out.println("ID " + comando[1] + " nao existe.");
						else
							cadastros.remove(posicaoElemento);
					break;
					
					case "info":
						posicaoElemento = -1;
						for(int i = 0; i < cadastros.size(); i++){
							if(((Pessoa)cadastros.get(i)).id.equals(comando[1])){
								posicaoElemento = i;
								break;
							}
						}
						if(posicaoElemento == -1)
							System.out.println("ID " + comando[1] + " nao existe.");
						else{
							Pessoa aux = new Pessoa();
							aux = ((Pessoa)cadastros.get(posicaoElemento));
							System.out.println(aux.name + " " + aux.lastName + " " + aux.birthday + " " + aux.telephone);
						}
					break;
					
					case "query":
						String name = "";
						String lastName = "";
						String birthday = "";
						String telephone = "";
						ArrayList<String> identificadores = new ArrayList<String>();
						for(int i = 0; i < comando.length; i++){
							if(comando[i].startsWith("fn:")){
								name = comando[i].replace("fn:", "");
								continue;
							}
							if(comando[i].startsWith("ln:")){
								lastName = comando[i].replace("ln:", "");
								continue;
							}
							if(comando[i].startsWith("bd:")){
								birthday = comando[i].replace("bd:", "");
								continue;
							}
							if(comando[i].startsWith("pn:")){
								telephone = comando[i].replace("pn:", "");
								continue;
							}
						}
						if(name.equals("") == true)
					break;
					
					default:
						break;
				}
			}
		}while(entrada != null);
	}
}

class Pessoa{
	public String id;
	public String name;
	public String lastName;
	public String birthday;
	public String telephone;

	public Pessoa(){
		this.id = -1;
		this.name = "";
		this.lastName = "";
		this.birthday = "";
		this.telephone = "";
	}
}