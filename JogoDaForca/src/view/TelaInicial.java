package view;

import java.awt.Color;
import java.awt.Cursor;
import java.awt.Font;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.SwingConstants;

public class TelaInicial {
	private JPanel telaInicial = new JPanel();
	private JButton iniciar = new JButton("Iniciar");
	private JButton fechar = new JButton("Fechar");
	private JLabel imagem = new JLabel();
	private JLabel imagemDeFundo = new JLabel();

	public TelaInicial() {
		iniciar.setBounds(550, 463, 100, 47);
		fechar.setBounds(550, 513, 100, 47);
		iniciar.setBackground(new Color(0,0,0,0));
		
		iniciar.setFont(new Font("Choco cooky", Font.BOLD, 14));
		iniciar.setContentAreaFilled(false);
		iniciar.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		iniciar.setBorderPainted(false);
		iniciar.setHorizontalTextPosition(SwingConstants.CENTER);
		iniciar.setBackground(new Color(0,0,0,0));
		iniciar.setIcon(new ImageIcon(TelaSubtemas.class.getResource("/imagens/Botao_i.png")));

		fechar.setFont(new Font("Choco cooky", Font.BOLD, 14));
		fechar.setContentAreaFilled(false);
		fechar.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		fechar.setBorderPainted(false);
		fechar.setHorizontalTextPosition(SwingConstants.CENTER);
		fechar.setBackground(new Color(0,0,0,0));
		fechar.setIcon(new ImageIcon(TelaSubtemas.class.getResource("/imagens/Botao_i.png")));

		imagem.setBounds(471, 142, 300, 300);
		imagem.setIcon(new ImageIcon(Janela.class.getResource("/imagens/Forca.png")));

		imagemDeFundo.setBounds(0, 0, 1200, 660);
		imagemDeFundo.setIcon(new ImageIcon(Janela.class.getResource("/imagens/PlanoDeFundo.jpg")));

		telaInicial.setSize(1200, 660);
		telaInicial.setLayout(null);
		telaInicial.setBackground(Color.GREEN);
		telaInicial.add(fechar);
		telaInicial.add(iniciar);
		telaInicial.add(imagem);
		telaInicial.add(imagemDeFundo);

	}

	public JPanel getTelaInicial() {
		return telaInicial;
	}

	public JButton getIniciar() {
		return iniciar;
	}

	public JButton getFechar() {
		return fechar;
	}
	
}
