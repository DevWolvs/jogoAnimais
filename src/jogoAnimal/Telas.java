package jogoAnimal;

import java.util.ArrayList;

import javax.swing.JOptionPane;

public class Telas {

	private static int res = 1;
	
	public static void menuPrincipal(ArrayList<Animal> lis) {
		Object[] options = {"OK"};
	    JOptionPane.showOptionDialog(null, "Pense em um animal","Jogo dos Animais", JOptionPane.PLAIN_MESSAGE,
	                   JOptionPane.INFORMATION_MESSAGE,	null, options, options[0]);
				
		Controle.verificaAtributo(lis);
		
	}
	
	public static void telaVerificaAtributo(ArrayList<Animal> lis) {
		
		Object[] options = { "sim", "não" };
		
			
		for(int i=0; i<lis.size(); i++) {
			res = JOptionPane.showOptionDialog(null, "Este animal "+ lis.get(i).getAtributoAnimal() + "?", "Jogo do Animais", JOptionPane.DEFAULT_OPTION,
					JOptionPane.QUESTION_MESSAGE, null, options, options[0]);
			
			if(res == 0) {
				Controle.verificaNomeAnimal(lis.get(i).getNomeAnimal(), lis);
			}
			else if(res == 1 && lis.size() == i+1) {
				Controle.cadatrarAnimal(lis.get(i).getNomeAnimal(), lis);
			}
		}
		
	}
	
	public static void telaVerificaNome(String nomeAnimal, ArrayList<Animal> animais) {		
		Object[] options = { "sim", "não" };
		
		int resp = 10;
		
		resp = JOptionPane.showOptionDialog(null, "Este animal é um " + nomeAnimal + "?", "Jogo do Animais", JOptionPane.DEFAULT_OPTION,
					JOptionPane.QUESTION_MESSAGE, null, options, options[0]);
		
		if(resp == 0) {
			acertei(animais);
		}
		else if(resp == 1) {
			Controle.cadatrarAnimal(nomeAnimal, animais);
		}
	}
	
	
	public static void telaCadastrarAnimal(String animalAnterior, ArrayList<Animal> animais) {
		String nomeAnimal, atribAnimal;
		
		nomeAnimal = JOptionPane.showInputDialog("Qual animal você pensou?");
		
		atribAnimal = JOptionPane.showInputDialog("Um(a) "+nomeAnimal+" ____, um(a) "+ animalAnterior+" não.");
		
		Animal novoAnimal = new Animal(nomeAnimal, atribAnimal);
		
		animais.add(novoAnimal);
		
		reiniciar(animais);
		
	}
	
	
	public static void acertei(ArrayList<Animal> animais) {
		Object[] options = {"OK"};
	    JOptionPane.showOptionDialog(null, "Acertei!!!","Jogo dos Animais", JOptionPane.PLAIN_MESSAGE,
	                   JOptionPane.INFORMATION_MESSAGE,	null, options, options[0]);
	    
	    reiniciar(animais);
	}
	
	public static void reiniciar(ArrayList<Animal> animais) {
		Object[] options = { "sim", "não" };
		
		int resp = 10;
		
		resp = JOptionPane.showOptionDialog(null, "Continuar jogando?", "Jogo do Animais", JOptionPane.DEFAULT_OPTION,
					JOptionPane.QUESTION_MESSAGE, null, options, options[0]);
		
		if(resp == 0) {
			menuPrincipal(animais);
		}
		else {
			System.exit(0);
		}
	}
}
