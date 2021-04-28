package view;

import java.awt.Color;
import java.awt.Cursor;
import java.awt.FlowLayout;
import java.awt.Font;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.SwingConstants;

/**
 * Classe que cria a tela principal do jogo como um painel. Essa é a tela na qual o usuário deverá interagir 
 * para descobrir a palavra.
 * @author Israel
 * @version 3.0 (Abr 2021)
 */
public class TelaPrincipal {	
	private JPanel telaPrincipal = new JPanel();
	private JButton voltar = new JButton("Voltar");
	private JLabel forca = new JLabel();
	private ImageIcon forca0 = new ImageIcon(TelaPrincipal.class.getResource("/imagens/Forca_0.png"));
	private ImageIcon forca1 = new ImageIcon(TelaPrincipal.class.getResource("/imagens/Forca_1.png"));
	private ImageIcon forca2 = new ImageIcon(TelaPrincipal.class.getResource("/imagens/Forca_2.png"));
	private ImageIcon forca3 = new ImageIcon(TelaPrincipal.class.getResource("/imagens/Forca_3.png"));
	private ImageIcon forca4 = new ImageIcon(TelaPrincipal.class.getResource("/imagens/Forca_4.png"));
	private ImageIcon enforcando = new ImageIcon(TelaPrincipal.class.getResource("/imagens/Enforcando.gif"));
	private ImageIcon comemorando = new ImageIcon(TelaPrincipal.class.getResource("/imagens/Comemorando.gif"));
	private Teclado teclado = new Teclado();
	private JLabel imagemDeFundo = new JLabel();
	private JPanel painelPalavra = new JPanel();
	private JLabel palavraEscolhida = new JLabel();
	
	//Misterosamente tive que criar novos botĩes para receber os botões da classe Teclado, caso contrário eles não funcionavam.
	private JButton a=teclado.getA();
	private JButton b=teclado.getB();
	private JButton c=teclado.getC();
	private JButton d=teclado.getD();
	private JButton e=teclado.getE();
	private JButton f=teclado.getF();
	private JButton g=teclado.getG();
	private JButton h=teclado.getH();
	private JButton i=teclado.getI();
	private JButton j=teclado.getJ();
	private JButton k=teclado.getK();
	private JButton l=teclado.getL();
	private JButton m=teclado.getM();
	private JButton n=teclado.getN();
	private JButton o=teclado.getO();
	private JButton p=teclado.getP();
	private JButton q=teclado.getQ();
	private JButton r=teclado.getR();
	private JButton s=teclado.getS();
	private JButton t=teclado.getT();
	private JButton u=teclado.getU();
	private JButton v=teclado.getV();
	private JButton w=teclado.getW();
	private JButton x=teclado.getX();
	private JButton y=teclado.getY();
	private JButton z=teclado.getZ();

	public TelaPrincipal() {
		voltar.setBounds(20, 20, 80, 57);
		forca.setHorizontalAlignment(SwingConstants.CENTER);
		forca.setBounds(471, 142, 300, 300);
		
		painelPalavra.setBounds(260, 30, 710, 69);
		painelPalavra.setLayout(new FlowLayout(FlowLayout.CENTER, 0, 0));
		palavraEscolhida.setHorizontalTextPosition(SwingConstants.CENTER);
		palavraEscolhida.setHorizontalAlignment(SwingConstants.CENTER);
		palavraEscolhida.setIcon(new ImageIcon(TelaPrincipal.class.getResource("/imagens/PainelPalavra.png")));
		palavraEscolhida.setFont(new Font("Choco cooky", Font.BOLD, 24));
		painelPalavra.add(palavraEscolhida);

		voltar.setFont(new Font("Choco cooky", Font.BOLD, 14));
		voltar.setContentAreaFilled(false);
		voltar.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		voltar.setBorderPainted(false);
		voltar.setHorizontalTextPosition(SwingConstants.CENTER);
		voltar.setBackground(new Color(0,0,0,0));
		voltar.setIcon(new ImageIcon(TelaSubtemas.class.getResource("/imagens/BotaoVoltar.png")));

		forca.setIcon(forca0);

		telaPrincipal.setSize(1200, 660);
		telaPrincipal.setLayout(null);
		telaPrincipal.setBackground(new Color(0, 88, 200));
		
		imagemDeFundo.setBounds(0, 0, 1200, 660);
		imagemDeFundo.setIcon(new ImageIcon(Janela.class.getResource("/imagens/PlanoDeFundo.jpg")));

		telaPrincipal.add(voltar);
		telaPrincipal.add(forca);
		telaPrincipal.add(teclado.getTeclado());
		telaPrincipal.add(painelPalavra);
		
		telaPrincipal.add(imagemDeFundo);

	}

	/**
	 * Método que atualiza a imagem da forca mostrada no JLabel de acordo com o número de erros.
	 * @param numErros
	 */
	public void setForca(int numErros) {
		switch(numErros) {
		
		case 0:
			forca.setIcon(forca0);

			break;
		case 1:
			forca.setIcon(forca1);

			break;
		case 2:
			forca.setIcon(forca2);

			break;
		case 3:
			forca.setIcon(forca3);

			break;
		case 4:
			forca.setIcon(forca4);

			break;
		case 5:
			forca.setIcon(enforcando);

			break;
		default:
			forca.setIcon(comemorando);

			break;
		}		
	}
	
	/**
	 * Método que atualiza a palavra no JLabel a medida que as letras forem descobertas.
	 * @param palavraEscolhida
	 */
	public void setPalavraEscolhida(String palavraEscolhida) {
		this.palavraEscolhida.setText(palavraEscolhida);
	}

	public JPanel getTelaPrincipal() {
		return telaPrincipal;
	}

	public JButton getVoltar() {
		return voltar;
	}

	public JButton getA() {
		return a;
	}

	public JButton getB() {
		return b;
	}

	public JButton getC() {
		return c;
	}

	public JButton getD() {
		return d;
	}

	public JButton getE() {
		return e;
	}

	public JButton getF() {
		return f;
	}

	public JButton getG() {
		return g;
	}

	public JButton getH() {
		return h;
	}

	public JButton getI() {
		return i;
	}

	public JButton getJ() {
		return j;
	}

	public JButton getK() {
		return k;
	}

	public JButton getL() {
		return l;
	}

	public JButton getM() {
		return m;
	}

	public JButton getN() {
		return n;
	}

	public JButton getO() {
		return o;
	}

	public JButton getP() {
		return p;
	}

	public JButton getQ() {
		return q;
	}

	public JButton getR() {
		return r;
	}

	public JButton getS() {
		return s;
	}

	public JButton getT() {
		return t;
	}

	public JButton getU() {
		return u;
	}

	public JButton getV() {
		return v;
	}

	public JButton getW() {
		return w;
	}

	public JButton getX() {
		return x;
	}

	public JButton getY() {
		return y;
	}

	public JButton getZ() {
		return z;
	}
	
	/**
	 * Método que desabilita todos os botões do teclado se a partida terminou ou habilita todos os botões do teclado 
	 * ao sair da tela principal do jogo.
	 * @param variavel
	 */
	public void reabilitarBotoes(Boolean variavel) {
		a.setEnabled(variavel);
		b.setEnabled(variavel);
		c.setEnabled(variavel);
		d.setEnabled(variavel);
		e.setEnabled(variavel);
		f.setEnabled(variavel);
		g.setEnabled(variavel);
		h.setEnabled(variavel);
		i.setEnabled(variavel);
		j.setEnabled(variavel);
		k.setEnabled(variavel);
		l.setEnabled(variavel);
		m.setEnabled(variavel);
		n.setEnabled(variavel);
		o.setEnabled(variavel);
		p.setEnabled(variavel);
		q.setEnabled(variavel);
		r.setEnabled(variavel);
		s.setEnabled(variavel);
		t.setEnabled(variavel);
		u.setEnabled(variavel);
		v.setEnabled(variavel);
		w.setEnabled(variavel);
		x.setEnabled(variavel);
		y.setEnabled(variavel);
		z.setEnabled(variavel);
	}
}
