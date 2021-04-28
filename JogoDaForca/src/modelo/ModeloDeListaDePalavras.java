package modelo;

/**
 * Classe que cria todos esses métodos para cada um dos vetores de String da classe ListaDePalavras.
 * @author Israel
 * @version 1.0 (Abr 2021)
 */
public abstract class ModeloDeListaDePalavras {
	private String palavraOculta[];

	/**
	 * Construtor que recebe um vetor de String da classe ListaDePalavras e passa esse vetor para o método setPalavraOculta().
	 * @param strings
	 */
	public ModeloDeListaDePalavras(String[] strings) {
		setPalavraOculta(strings);
	}

	/**
	 * Método que retorna uma palavra aleatória do vetor de String.
	 * @param numAleatorio (número entre 0 e o tamanho do vetor de Strings -1.)
	 * @return palavraOculta[numAleatorio] (retorna uma string da posição numAleatorio.)
	 */
	public String getPalavraOculta(int numAleatorio) {
		return palavraOculta[numAleatorio];
	}

	/**
	 * Método que atribui um vetor de Strings ao vetor palavraOculta.
	 * @param palavraOculta (vetor de Strings.)
	 */
	public void setPalavraOculta(String[] palavraOculta) {
		this.palavraOculta = palavraOculta;
	}
	
	/**
	 * Método que retorna o tamanho do vetor de Strings.
	 * @return palavraOculta.length (tamanho do vetor de Strings.)
	 */
	public int getpalavraOcultaTamanho() {
		return palavraOculta.length;
	}

}
