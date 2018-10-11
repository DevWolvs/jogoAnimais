package jogoAnimal;

import java.util.ArrayList;

public class Main {


	public static void main(String[] args) {
		ArrayList<Animal> animalL = new ArrayList<>();
		
        Animal jogo = new Animal("Tubarão","vive na água");
        animalL.add(jogo);
                
        Telas.menuPrincipal(animalL);
	}
}
