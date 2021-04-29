package view;

import java.awt.Color;
import java.awt.Font;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.ImageIcon;
import javax.swing.SwingConstants;
import java.awt.Cursor;

/**
 * Classe que cria a tela de seleção de subtemas como um painel.
 * @author Israel
 * @version 3.0 (Abr 2021)
 */
public class TelaSubtemas {
	private JPanel telaSubtemas = new JPanel();
	private JButton botao1 = new JButton();
	private JButton botao2 = new JButton();
	private JButton voltar = new JButton("Voltar");
	private JLabel mensagem = new JLabel("Escolha um subtema");
	private JLabel placa = new JLabel();
	private JLabel imagemDeFundo = new JLabel();

	public TelaSubtemas() {
		botao1.setBounds(525, 366, 150, 38);
		botao2.setBounds(525, 416, 150, 38);
		voltar.setBounds(20, 20, 80, 57);
		mensagem.setBounds(486, 127, 228, 29);
		placa.setBounds(465, 0, 270, 215);
		imagemDeFundo.setBounds(0, 0, 1200, 660);

		botao1.setFont(new Font("Choco cooky", Font.BOLD, 14));
		botao1.setContentAreaFilled(false);
		botao1.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		botao1.setBorderPainted(false);
		botao1.setHorizontalTextPosition(SwingConstants.CENTER);
		botao1.setBackground(new Color(0,0,0,0));
		botao1.setIcon(new ImageIcon(TelaSubtemas.class.getResource("/imagens/Botao_r.png")));

		botao2.setFont(new Font("Choco cooky", Font.BOLD, 14));
		botao2.setContentAreaFilled(false);
		botao2.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		botao2.setBorderPainted(false);
		botao2.setHorizontalTextPosition(SwingConstants.CENTER);
		botao2.setBackground(new Color(0,0,0,0));
		botao2.setIcon(new ImageIcon(TelaSubtemas.class.getResource("/imagens/Botao_r.png")));
		
		voltar.setFont(new Font("Choco cooky", Font.BOLD, 14));
		voltar.setContentAreaFilled(false);
		voltar.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		voltar.setBorderPainted(false);
		voltar.setHorizontalTextPosition(SwingConstants.CENTER);
		voltar.setBackground(new Color(0,0,0,0));
		voltar.setIcon(new ImageIcon(TelaSubtemas.class.getResource("/imagens/BotaoVoltar.png")));

		mensagem.setFont(new Font("Choco cooky", Font.BOLD, 24));

		placa.setIcon(new ImageIcon(TelaSubtemas.class.getResource("/imagens/Placa.png")));
		imagemDeFundo.setIcon(new ImageIcon(Janela.class.getResource("/imagens/PlanoDeFundo.jpg")));

		telaSubtemas.setSize(1200, 660);
		telaSubtemas.setLayout(null);
		telaSubtemas.setBackground(new Color(255, 88, 0));
		telaSubtemas.add(botao1);
		telaSubtemas.add(botao2);
		telaSubtemas.add(voltar);
		telaSubtemas.add(mensagem);
		telaSubtemas.add(placa);
		telaSubtemas.add(imagemDeFundo);

	}

	public JButton getBotao1() {
		return botao1;
	}

	/**
	 * Muda o texto do botão a cada vez que escolhe um tema.
	 * @param botao1 (String com o novo texto do botão)
	 */
	public void setBotao1(String botao1) {
		this.botao1.setText(botao1);
	}

	public JButton getBotao2() {
		return botao2;
	}

	/**
	 * Muda o texto do botão a cada vez que escolhe um tema.
	 * @param botao2 (String com o novo texto do botão)
	 */
	public void setBotao2(String botao2) {
		this.botao2.setText(botao2);
	}
	
	public JButton getVoltar() {
		return voltar;
	}

	public JPanel getTelaSubtemas() {
		return telaSubtemas;
	}
}