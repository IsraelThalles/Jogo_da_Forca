package view;

import java.awt.Color;
import java.awt.Cursor;
import java.awt.Font;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.SwingConstants;

/**
 * Classe que cria a tela de seleção de temas como um painel.
 * @author Israel
 * @version 3.0 (Abr 2021)
 */
public class TelaTemas {
	private JPanel telaTemas = new JPanel();
	private JButton nomes = new JButton("Nomes");
	private JButton geografia = new JButton("Geografia");
	private JButton natureza = new JButton("Natureza");
	private JButton esportes = new JButton("Esportes");
	private JButton voltar = new JButton("Voltar");
	private JLabel mensagem = new JLabel("Escolha um tema");
	private JLabel placa = new JLabel();
	private JLabel imagemDeFundo = new JLabel();

	public TelaTemas() {
		nomes.setBounds(525, 325, 150, 38);
		geografia.setBounds(525, 379, 150, 38);
		natureza.setBounds(525, 433, 150, 38);
		esportes.setBounds(525, 487, 150, 38);
		voltar.setBounds(20, 20, 80, 57);
		mensagem.setBounds(505, 127, 190, 29);
		placa.setBounds(465, 0, 270, 215);
		imagemDeFundo.setBounds(0, 0, 1200, 660);

		nomes.setFont(new Font("Choco cooky", Font.BOLD, 14));
		nomes.setContentAreaFilled(false);
		nomes.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		nomes.setBorderPainted(false);
		nomes.setHorizontalTextPosition(SwingConstants.CENTER);
		nomes.setBackground(new Color(0,0,0,0));
		nomes.setIcon(new ImageIcon(TelaSubtemas.class.getResource("/imagens/Botao_r.png")));

		geografia.setFont(new Font("Choco cooky", Font.BOLD, 14));
		geografia.setContentAreaFilled(false);
		geografia.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		geografia.setBorderPainted(false);
		geografia.setHorizontalTextPosition(SwingConstants.CENTER);
		geografia.setBackground(new Color(0,0,0,0));
		geografia.setIcon(new ImageIcon(TelaSubtemas.class.getResource("/imagens/Botao_r.png")));

		natureza.setFont(new Font("Choco cooky", Font.BOLD, 14));
		natureza.setContentAreaFilled(false);
		natureza.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		natureza.setBorderPainted(false);
		natureza.setHorizontalTextPosition(SwingConstants.CENTER);
		natureza.setBackground(new Color(0,0,0,0));
		natureza.setIcon(new ImageIcon(TelaSubtemas.class.getResource("/imagens/Botao_r.png")));

		esportes.setFont(new Font("Choco cooky", Font.BOLD, 14));
		esportes.setContentAreaFilled(false);
		esportes.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		esportes.setBorderPainted(false);
		esportes.setHorizontalTextPosition(SwingConstants.CENTER);
		esportes.setBackground(new Color(0,0,0,0));
		esportes.setIcon(new ImageIcon(TelaSubtemas.class.getResource("/imagens/Botao_r.png")));

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

		telaTemas.setSize(1200, 660);
		telaTemas.setLayout(null);
		telaTemas.setBackground(Color.BLUE);
		telaTemas.add(nomes);
		telaTemas.add(geografia);
		telaTemas.add(natureza);
		telaTemas.add(esportes);
		telaTemas.add(voltar);
		telaTemas.add(mensagem);
		telaTemas.add(placa);
		telaTemas.add(imagemDeFundo);

	}
	
	public JPanel getTelaTemas() {
		return telaTemas;
	}

	public JButton getNomes() {
		return nomes;
	}

	public JButton getGeografia() {
		return geografia;
	}

	public JButton getNatureza() {
		return natureza;
	}

	public JButton getEsportes() {
		return esportes;
	}

	public JButton getVoltar() {
		return voltar;
	}
	
}
