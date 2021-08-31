
public class Personagem {
	private String nome;
	private int estamina;
	private int qtdMoedas;
	private int qtdVidas;
	private int velocidade;
	private boolean anel;

	//Método Construtor
	public Personagem(String nome, int velocidade, boolean anel) {
		this.setNome(nome);
		this.estamina = 100;
		this.qtdMoedas = 0;
		this.qtdVidas = 1;
		this.setVelocidade(velocidade);
		this.setAnel(anel);
	}
	
	//Métodos getters
	private String getNome() {
		return this.nome;
	}
	
	private int getEstamina() {
		return this.estamina;
	}
	
	public int getVelocidade() {
		return this.velocidade;
	}
	
	public boolean getAnel() {
		return this.anel;
	}
	
	//Métodos setters	
	
	private void setNome(String nome) {
		this.nome = nome;
	}
	
	private void setEstamina(int estamina) {
		this.estamina = estamina;
	}
	
	public void setVelocidade(int vel)  {
		this.velocidade = vel;
	}
	
	public void setAnel(boolean anel) {
		this.anel = anel;
	}
	
	//Métodos Abstratos
	public void status() {
		System.out.println("-----------------------");
		System.out.println("Nome: " + this.getNome());
		System.out.println("Estamina: " + this.getEstamina());
		System.out.println("Vida: " + this.qtdVidas);
		System.out.println("Moedas: " + this.qtdMoedas);
		System.out.println("Velocidade: " + this.getVelocidade());
		System.out.println("Possui anel? " + this.getAnel());
		System.out.println("-----------------------");
	}

	public void perderEstamina() {
		this.estamina = this.estamina - 10;
		if (this.estamina < 0) {
			this.estamina = 0;
		}
	}
	
	public void ganharEstamina() {
		this.estamina = this.estamina + 5;
		if (this.estamina > 100) {
			this.estamina = 100;
		}
	}
	
	public void coletarMoedas() {
		this.qtdMoedas++;
		if (this.qtdMoedas % 10 == 0) {
			this.qtdVidas++;
		}
	}
	
	public void revigorar() {
		this.estamina = 100;
	}
	
	public void morrer() {
		this.estamina = 0;
		this.qtdVidas -= 1;
		if (this.qtdVidas < 0) {
			this.qtdVidas = 0;
		} else {
			this.revigorar();
		}
	}
	
	public void aumentarVelocidade() {
		if (this.anel == true) {
			this.velocidade = this.velocidade * 5;
		}
	}

}
