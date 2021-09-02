import java.util.Random;

public class Jogo {
	private Personagem jogador1;
	private Personagem jogador2;
	
	public Jogo(Personagem jogador1, Personagem jogador2) {
		this.jogador1 = jogador1;
		this.jogador2 = jogador2;
	}
	
	public void jogar() {
		Random aleatorio = new Random();
		
		int qtdColetaj1 = aleatorio.nextInt(30);
		for (int i = 0; i < qtdColetaj1; i++) {
			this.jogador1.coletarMoedas();
		}
		
		int qtdColetaj2 = aleatorio.nextInt(30);
		for (int i = 0; i < qtdColetaj2; i++) {
			this.jogador2.coletarMoedas();
		}
		
        System.out.println("Quantidade de vezes em que o jogador 1 coletou moedas: " + qtdColetaj1);
        System.out.println("Resultado final do jogador 1: ");
        jogador1.status();

        System.out.println("Quantidade de vezes em que o jogador 2 coletou moedas: " + qtdColetaj2);
        System.out.println("Resultado final do jogador 2: ");
        jogador2.status();
	}
	
}
