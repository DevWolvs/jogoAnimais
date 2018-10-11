package jogoAnimal;

import java.util.ArrayList;

public class Controle {
	public static void verificaAtributo(ArrayList<Animal> listAnimal) {
		Telas.telaVerificaAtributo(listAnimal);
	}
	
	public static void verificaNomeAnimal(String nomeAnimal, ArrayList<Animal> animal) {
		Telas.telaVerificaNome(nomeAnimal, animal);
	}

	public static void cadatrarAnimal(String nomeAnimal, ArrayList<Animal> animal) {
		Telas.telaCadastrarAnimal(nomeAnimal, animal);
	}
	
}
