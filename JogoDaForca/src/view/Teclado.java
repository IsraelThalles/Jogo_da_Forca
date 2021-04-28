package view;

import java.awt.Color;
import java.awt.Cursor;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.Font;

import javax.swing.JButton;
import javax.swing.JPanel;
import javax.swing.ImageIcon;
import javax.swing.SwingConstants;

/**
 * Classe que cria o teclado.
 * @author Israel
 * @version 1.0 (Abr 2021)
 */
public class Teclado {
	private JButton a = new JButton();
	private JButton b = new JButton();
	private JButton c = new JButton();
	private JButton d = new JButton();
	private JButton e = new JButton();
	private JButton f = new JButton();
	private JButton g = new JButton();
	private JButton h = new JButton();
	private JButton i = new JButton();
	private JButton j = new JButton();
	private JButton k = new JButton();
	private JButton l = new JButton();
	private JButton m = new JButton();
	private JButton n = new JButton();
	private JButton o = new JButton();
	private JButton p = new JButton();
	private JButton q = new JButton();
	private JButton r = new JButton();
	private JButton s = new JButton();
	private JButton t = new JButton();
	private JButton u = new JButton();
	private JButton v = new JButton();
	private JButton w = new JButton();
	private JButton x = new JButton();
	private JButton y = new JButton();
	private JButton z = new JButton();
	private JPanel teclado = new JPanel();
	
	public Teclado() {
		teclado.setSize(600, 190);
		teclado.setLocation(300, 450);
		teclado.setLayout(new FlowLayout(FlowLayout.CENTER, 10, 10));
		teclado.setBackground(new Color(0,0,0,0));

		configuraBotao(a, "A");
		configuraBotao(b, "B");
		configuraBotao(c, "C");
		configuraBotao(d, "D");
		configuraBotao(e, "E");
		configuraBotao(f, "F");
		configuraBotao(g, "G");
		configuraBotao(h, "H");
		configuraBotao(i, "I");
		configuraBotao(j, "J");
		configuraBotao(k, "K");
		configuraBotao(l, "L");
		configuraBotao(m, "M");
		configuraBotao(n, "N");
		configuraBotao(o, "O");
		configuraBotao(p, "P");
		configuraBotao(q, "Q");
		configuraBotao(r, "R");
		configuraBotao(s, "S");
		configuraBotao(t, "T");
		configuraBotao(u, "U");
		configuraBotao(v, "V");
		configuraBotao(w, "W");
		configuraBotao(x, "X");
		configuraBotao(y, "Y");
		configuraBotao(z, "Z");
		
	}
	
	/**
	 * Método que configura as propriedades de cada botão e os adiciona ao teclado.
	 * @param botao recebe um botão para cada uma das 26 letras do alfabeto.
	 * @param tecla recebe uma letra para ser colocada no botão.
	 */
	public void configuraBotao(JButton botao, String tecla) {
		botao.setText(tecla);
		botao.setFont(new Font("Choco cooky", Font.BOLD, 14));
		botao.setContentAreaFilled(false);
		botao.setHorizontalTextPosition(SwingConstants.CENTER);
		botao.setPreferredSize(new Dimension(50, 50));
		botao.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		botao.setBorderPainted(false);
		botao.setHorizontalTextPosition(SwingConstants.CENTER);
		botao.setBackground(new Color(0,0,0,0));
		botao.setIcon(new ImageIcon(TelaSubtemas.class.getResource("/imagens/Botao_q.png")));

		teclado.add(botao);
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

	public JPanel getTeclado() {
		return teclado;
	}

	/*
	 * Não utiliado.

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
*/
}
