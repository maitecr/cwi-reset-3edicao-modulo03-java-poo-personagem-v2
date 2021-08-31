public class CriarPersonagens {

	public static void main(String[] args) {
		
		//Método Construtor
		Personagem p[] = new Personagem[2];
		p[0] = new Personagem("Sonic", 80, false);
		p[1] = new Personagem("Snuckles", 50, true);
		
		p[0].status();
		p[1].status();
		
		p[0].aumentarVelocidade();
		p[1].aumentarVelocidade();
		
		p[0].status();
		p[1].status();
		
		//Métodos Abstratos Existentes
		status();
		perderEstamina();
		ganharEstamina();
		revigorar();
		morrer();
		coletarMoedas();
		aumentarVelocidade();
	}

}
