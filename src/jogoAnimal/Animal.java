package jogoAnimal;


public class Animal {
	private String nomeAnimal;
	private String atributoAnimal;
	
	public Animal(String nomeAnimal, String atributoAnimal) {
		this.nomeAnimal = nomeAnimal;
		this.atributoAnimal = atributoAnimal;
	}

	public String getNomeAnimal() {
		return nomeAnimal;
	}

/*	public void setNomeAnimal(String nomeAnimal) {
		this.nomeAnimal = nomeAnimal;
	}
*/
	public String getAtributoAnimal() {
		return atributoAnimal;
	}

/*	public void setAtributoAnimal(String atributoAnimal) {
		this.atributoAnimal = atributoAnimal;
	}
*/
}
