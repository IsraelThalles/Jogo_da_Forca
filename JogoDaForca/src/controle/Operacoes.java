package controle;

import java.util.Random;

import modelo.ListaDePalavras;
import modelo.ModeloDeListaDePalavras;

/**
 * Classe que realiza todas as operações sobre a palavra a ser descoberta pelo usuàrio.
 * @author Israel
 * @version 3.0 (Abr 2021)
 */
public class Operacoes {
	private Random random = new Random();
	private ListaDePalavras listaDePalavras = new ListaDePalavras(null);
	
	private String palavraEscolhida = "";
	private String palavraOculta = "";
	private char[] aux;
	private int numErros = 0;
	private int numAcertos = 0;
	private int qtdCharEspecias;
	private int qtdLetras = 0;

	private ModeloDeListaDePalavras nomeFeminino = new ListaDePalavras(listaDePalavras.getNomeFeminino());
	private ModeloDeListaDePalavras nomeMasculino = new ListaDePalavras(listaDePalavras.getNomeMasculino());
	private ModeloDeListaDePalavras paises = new ListaDePalavras(listaDePalavras.getPaises());
	private ModeloDeListaDePalavras cidades = new ListaDePalavras(listaDePalavras.getCidades());
	private ModeloDeListaDePalavras animais = new ListaDePalavras(listaDePalavras.getAnimais());
	private ModeloDeListaDePalavras plantas = new ListaDePalavras(listaDePalavras.getPlantas());
	private ModeloDeListaDePalavras esportes = new ListaDePalavras(listaDePalavras.getNomesEsportes());
	private ModeloDeListaDePalavras times = new ListaDePalavras(listaDePalavras.getTimesFutebol());

	/**
	 * Método que recebe uma string com o nome do subtema escolhido por um evento de botão e direciona 
	 * para outro método escolher uma palavra.
	 * @param subtema (String com o nome do subtema escolhido)
	 */
	public void subtemaEscolhido(String subtema) {
		if(subtema.equals("Nome feminino")) {
			escolhePalavra(nomeFeminino);
		}
		if(subtema.equals("Nome masculino")) {
			escolhePalavra(nomeMasculino);
		}
		if(subtema.equals("Países")) {
			escolhePalavra(paises);
		}
		if(subtema.equals("Cidades")) {
			escolhePalavra(cidades);
		}
		if(subtema.equals("Animais")) {
			escolhePalavra(animais);
		}
		if(subtema.equals("Plantas")) {
			escolhePalavra(plantas);
		}
		if(subtema.equals("Esportes")) {
			escolhePalavra(esportes);
		}
		if(subtema.equals("Times de Futebol")) {
			escolhePalavra(times);
		}
		ocultaPalavra();
		verificaQtdCharEspeciais(palavraEscolhida);
	}
	
	/**
	 * Método que recebe um objeto do tipo ModeloDeListaDePalavras e escolhe uma string aleatória do vetor de String, 
	 * atribuindo à variável palavraEscolhida.
	 * @param subtema (Objeto do tipo ModeloDeListaDePalavras)
	 */
	public void escolhePalavra(ModeloDeListaDePalavras subtema) {
		palavraEscolhida = subtema.getPalavraOculta(random.nextInt(subtema.getpalavraOcultaTamanho()));
	}
	
	/**
	 * Método que oculta a palavraEscolhida para ser mostrada ao usuário, subtituindo as letras por '_' e adicionando 
	 * um espaço entre os caracteres.
	 */
	public void ocultaPalavra() {
		aux = new char[palavraEscolhida.length()*2];
		
		for(int tamPalavra = 0; tamPalavra < palavraEscolhida.length(); tamPalavra++) {
			if(palavraEscolhida.charAt(tamPalavra) == '-') {
				palavraOculta += "- ";
			} else if(palavraEscolhida.charAt(tamPalavra) == ' '){
				palavraOculta += "  ";
			} else {
				palavraOculta += "_ ";
			}
		}
		palavraOculta.trim();
		aux = palavraOculta.toCharArray();
	}

	/**
	 * Método que verifica se a letra escolhida pelo usuário, por meio de um evento de botão, está presente na palavra.
	 * Se a busca for verdadeira, a letra estará presente na palavra, o número de Acertos (numAcertos) aumentará em 1 
	 * para cada letra encontrada e a palavraOculta será atualizada com o acerto. Se a busca for falsa, a letra não 
	 * estará presente na palavra e o número de erros aumentarŕa em 1.
	 * @param letra
	 */
	public void verificaChute(char letra) {
		Boolean busca = false;
		for(int i = 0, j = 0; i < palavraEscolhida.length(); i++, j+=2) {
			if(letra == 'A') {
				if(palavraEscolhida.charAt(i) == 'A' || palavraEscolhida.charAt(i) == 'Á' || 
						palavraEscolhida.charAt(i) == 'Â' || palavraEscolhida.charAt(i) == 'Ã') {
					aux[j] = palavraEscolhida.charAt(i);
					numAcertos++;
					busca = true;
				}
			} else if(letra == 'E') {
				if(palavraEscolhida.charAt(i) == 'E' || palavraEscolhida.charAt(i) == 'É' || palavraEscolhida.charAt(i) == 'Ê') {
					aux[j] = palavraEscolhida.charAt(i);
					numAcertos++;
					busca = true;
				}
			} else if(letra == 'I') {
				if(palavraEscolhida.charAt(i) == 'I' || palavraEscolhida.charAt(i) == 'Í') {
					aux[j] = palavraEscolhida.charAt(i);
					numAcertos++;
					busca = true;
				}
			} else if(letra == 'O') {
				if(palavraEscolhida.charAt(i) == 'O' || palavraEscolhida.charAt(i) == 'Ó' || 
						palavraEscolhida.charAt(i) == 'Ô' || palavraEscolhida.charAt(i) == 'Õ' || palavraEscolhida.charAt(i) == 'Ö') {
					aux[j] = palavraEscolhida.charAt(i);
					numAcertos++;
					busca = true;
				}
			} else if(letra == 'U') {
				if(palavraEscolhida.charAt(i) == 'U' || palavraEscolhida.charAt(i) == 'Ú') {
					aux[j] = palavraEscolhida.charAt(i);
					numAcertos++;
					busca = true;
				}
			} else if(letra == 'C') {
				if(palavraEscolhida.charAt(i) == 'C' || palavraEscolhida.charAt(i) == 'Ç') {
					aux[j] = palavraEscolhida.charAt(i);
					numAcertos++;
					busca = true;
				} 
			} else {
				if(letra == palavraEscolhida.charAt(i)) {
					aux[j] = palavraEscolhida.charAt(i);
					numAcertos++;
					busca = true;
				}
			}
		}
		if(busca==false) {
			numErros++;
		}
		palavraOculta = new String(aux);
	}
	
	/**
	 * Método que verifica quantos caracteres '-' e ' ' estão presentes na palavraEscolhida para saber a quantidade de caracteres 
	 * alfabéticos a palavra escolhida possui.
	 * @param palavraEscolhida
	 */
	public void verificaQtdCharEspeciais(String palavraEscolhida) {
		qtdCharEspecias = 0;
		
		for (int i = 0; i < palavraEscolhida.length(); i++) {
		    if (palavraEscolhida.charAt(i) == '-')  {
		    	qtdCharEspecias++;
		    }
		    if (palavraEscolhida.charAt(i) == ' ')  {
		    	qtdCharEspecias++;
		    }
		}
		qtdLetras = palavraEscolhida.length()-qtdCharEspecias;
	}

	/**
	 * Método que apaga a palavraOculta e reinicia o contador de erros e de acertos quando cada partida terminar.
	 */
	public void apagaPalavra() {
		palavraOculta = "";
		numErros = 0;
		numAcertos = 0;
	}

	public String getPalavraOculta() {
		return palavraOculta;
	}

	public String getPalavraEscolhida() {
		return palavraEscolhida;
	}

	public int getNumErros() {
		return numErros;
	}

	public int getNumAcertos() {
		return numAcertos;
	}

	public int getQtdLetras() {
		return qtdLetras;
	}

	//Método usado exclusivamente pela classe de teste.
	public void setPalavraEscolhida(String palavraEscolhida) {
		this.palavraEscolhida = palavraEscolhida;
	}
}