package view;

import java.awt.CardLayout;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;
import javax.swing.JPanel;

import controle.Operacoes;
import java.awt.BorderLayout;

public class Janela extends JFrame implements ActionListener{
	private JPanel tela = new JPanel();
	private CardLayout cards =  new CardLayout();
	private static TelaInicial telaInicial = new TelaInicial();
	private static TelaTemas telaTemas = new TelaTemas();
	private static TelaSubtemas telaSubtemas = new TelaSubtemas();
	private static TelaPrincipal telaPrincipal = new TelaPrincipal();
	private Operacoes op = new Operacoes();

	public Janela() {
		setSize(1200, 700);
		setTitle("Jogo da Forca");
		setIconImage(Toolkit.getDefaultToolkit().getImage(Janela.class.getResource("/imagens/Icone.png")));
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setLocationRelativeTo(null);
		setResizable(false);
		getContentPane().setLayout(new BorderLayout(0, 0));
		
		tela.setLayout(cards);
		tela.add(telaInicial.getTelaInicial(), "inicio");
		tela.add(telaTemas.getTelaTemas(), "temas");
		tela.add(telaSubtemas.getTelaSubtemas(), "subtemas");
		tela.add(telaPrincipal.getTelaPrincipal(), "principal");
		
		getContentPane().add(tela);

		setVisible(true);
		
	}
	public static void main(String[] args) {
		Janela janela = new Janela();

		telaInicial.getIniciar().addActionListener(janela);
		telaInicial.getFechar().addActionListener(janela);
		
		telaTemas.getVoltar().addActionListener(janela);
		telaTemas.getNomes().addActionListener(janela);
		telaTemas.getGeografia().addActionListener(janela);
		telaTemas.getNatureza().addActionListener(janela);
		telaTemas.getEsportes().addActionListener(janela);
		
		telaSubtemas.getVoltar().addActionListener(janela);
		telaSubtemas.getBotao1().addActionListener(janela);
		telaSubtemas.getBotao2().addActionListener(janela);
		
		telaPrincipal.getVoltar().addActionListener(janela);
		telaPrincipal.getA().addActionListener(janela);
		telaPrincipal.getB().addActionListener(janela);
		telaPrincipal.getC().addActionListener(janela);
		telaPrincipal.getD().addActionListener(janela);
		telaPrincipal.getE().addActionListener(janela);
		telaPrincipal.getF().addActionListener(janela);
		telaPrincipal.getG().addActionListener(janela);
		telaPrincipal.getH().addActionListener(janela);
		telaPrincipal.getI().addActionListener(janela);
		telaPrincipal.getJ().addActionListener(janela);
		telaPrincipal.getK().addActionListener(janela);
		telaPrincipal.getL().addActionListener(janela);
		telaPrincipal.getM().addActionListener(janela);
		telaPrincipal.getN().addActionListener(janela);
		telaPrincipal.getO().addActionListener(janela);
		telaPrincipal.getP().addActionListener(janela);
		telaPrincipal.getQ().addActionListener(janela);
		telaPrincipal.getR().addActionListener(janela);
		telaPrincipal.getS().addActionListener(janela);
		telaPrincipal.getT().addActionListener(janela);
		telaPrincipal.getU().addActionListener(janela);
		telaPrincipal.getV().addActionListener(janela);
		telaPrincipal.getW().addActionListener(janela);
		telaPrincipal.getX().addActionListener(janela);
		telaPrincipal.getY().addActionListener(janela);
		telaPrincipal.getZ().addActionListener(janela);

	}

	@Override
	public void actionPerformed(ActionEvent event) {
		Object src = event.getSource();

		if(src == telaInicial.getIniciar()) {
			cards.next(tela);
		}
		if(src == telaInicial.getFechar()) {
			System.exit(0);
		}
		if(src == telaTemas.getVoltar() || src == telaSubtemas.getVoltar()) {
			cards.previous(tela);
		}
		if(src == telaPrincipal.getVoltar()) {
			cards.previous(tela);
			telaPrincipal.reabilitarBotoes(true);
			telaPrincipal.setForca(0);
			op.apagaPalavra();
		}
		if(src == telaTemas.getNomes()) {
			telaSubtemas.setBotao1("Nome feminino");
			telaSubtemas.setBotao2("Nome masculino");
			cards.next(tela);
		}
		if(src == telaTemas.getGeografia()) {
			telaSubtemas.setBotao1("Países");
			telaSubtemas.setBotao2("Cidades");
			cards.next(tela);
		}
		if(src == telaTemas.getNatureza()) {
			telaSubtemas.setBotao1("Animais");
			telaSubtemas.setBotao2("Plantas");
			cards.next(tela);
		}
		if(src == telaTemas.getEsportes()) {
			telaSubtemas.setBotao1("Esportes");
			telaSubtemas.setBotao2("Times de Futebol");
			cards.next(tela);
		}
		if(src == telaSubtemas.getBotao1()) {
			op.subtemaEscolhido(telaSubtemas.getBotao1().getText());
			telaPrincipal.setPalavraEscolhida(op.getPalavraOculta());
			cards.next(tela);
		}
		if(src == telaSubtemas.getBotao2()) {
			op.subtemaEscolhido(telaSubtemas.getBotao2().getText());
			telaPrincipal.setPalavraEscolhida(op.getPalavraOculta());
			cards.next(tela);
		}
		if(src == telaPrincipal.getA()) {
			op.verificaChute('A');
			telaPrincipal.setPalavraEscolhida(op.getPalavraOculta());
			telaPrincipal.getA().setEnabled(false);
		}
		if(src == telaPrincipal.getB()) {
			op.verificaChute('B');
			telaPrincipal.setPalavraEscolhida(op.getPalavraOculta());
			telaPrincipal.getB().setEnabled(false);
		}
		if(src == telaPrincipal.getC()) {
			op.verificaChute('C');
			telaPrincipal.setPalavraEscolhida(op.getPalavraOculta());
			telaPrincipal.getC().setEnabled(false);
		}
		if(src == telaPrincipal.getD()) {
			op.verificaChute('D');
			telaPrincipal.setPalavraEscolhida(op.getPalavraOculta());
			telaPrincipal.getD().setEnabled(false);
		}
		if(src == telaPrincipal.getE()) {
			op.verificaChute('E');
			telaPrincipal.setPalavraEscolhida(op.getPalavraOculta());
			telaPrincipal.getE().setEnabled(false);
		}
		if(src == telaPrincipal.getF()) {
			op.verificaChute('F');
			telaPrincipal.setPalavraEscolhida(op.getPalavraOculta());
			telaPrincipal.getF().setEnabled(false);
		}
		if(src == telaPrincipal.getG()) {
			op.verificaChute('G');
			telaPrincipal.setPalavraEscolhida(op.getPalavraOculta());
			telaPrincipal.getG().setEnabled(false);
		}
		if(src == telaPrincipal.getH()) {
			op.verificaChute('H');
			telaPrincipal.setPalavraEscolhida(op.getPalavraOculta());
			telaPrincipal.getH().setEnabled(false);
		}
		if(src == telaPrincipal.getI()) {
			op.verificaChute('I');
			telaPrincipal.setPalavraEscolhida(op.getPalavraOculta());
			telaPrincipal.getI().setEnabled(false);
		}
		if(src == telaPrincipal.getJ()) {
			op.verificaChute('J');
			telaPrincipal.setPalavraEscolhida(op.getPalavraOculta());
			telaPrincipal.getJ().setEnabled(false);
		}
		if(src == telaPrincipal.getK()) {
			op.verificaChute('K');
			telaPrincipal.setPalavraEscolhida(op.getPalavraOculta());
			telaPrincipal.getK().setEnabled(false);
		}
		if(src == telaPrincipal.getL()) {
			op.verificaChute('L');
			telaPrincipal.setPalavraEscolhida(op.getPalavraOculta());
			telaPrincipal.getL().setEnabled(false);
		}
		if(src == telaPrincipal.getM()) {
			op.verificaChute('M');
			telaPrincipal.setPalavraEscolhida(op.getPalavraOculta());
			telaPrincipal.getM().setEnabled(false);
		}
		if(src == telaPrincipal.getN()) {
			op.verificaChute('N');
			telaPrincipal.setPalavraEscolhida(op.getPalavraOculta());
			telaPrincipal.getN().setEnabled(false);
		}
		if(src == telaPrincipal.getO()) {
			op.verificaChute('O');
			telaPrincipal.setPalavraEscolhida(op.getPalavraOculta());
			telaPrincipal.getO().setEnabled(false);
		}
		if(src == telaPrincipal.getP()) {
			op.verificaChute('P');
			telaPrincipal.setPalavraEscolhida(op.getPalavraOculta());
			telaPrincipal.getP().setEnabled(false);
		}
		if(src == telaPrincipal.getQ()) {
			op.verificaChute('Q');
			telaPrincipal.setPalavraEscolhida(op.getPalavraOculta());
			telaPrincipal.getQ().setEnabled(false);
		}
		if(src == telaPrincipal.getR()) {
			op.verificaChute('R');
			telaPrincipal.setPalavraEscolhida(op.getPalavraOculta());
			telaPrincipal.getR().setEnabled(false);
		}
		if(src == telaPrincipal.getS()) {
			op.verificaChute('S');
			telaPrincipal.setPalavraEscolhida(op.getPalavraOculta());
			telaPrincipal.getS().setEnabled(false);
		}
		if(src == telaPrincipal.getT()) {
			op.verificaChute('T');
			telaPrincipal.setPalavraEscolhida(op.getPalavraOculta());
			telaPrincipal.getT().setEnabled(false);
		}
		if(src == telaPrincipal.getU()) {
			op.verificaChute('U');
			telaPrincipal.setPalavraEscolhida(op.getPalavraOculta());
			telaPrincipal.getU().setEnabled(false);
		}
		if(src == telaPrincipal.getV()) {
			op.verificaChute('V');
			telaPrincipal.setPalavraEscolhida(op.getPalavraOculta());
			telaPrincipal.getV().setEnabled(false);
		}
		if(src == telaPrincipal.getW()) {
			op.verificaChute('W');
			telaPrincipal.setPalavraEscolhida(op.getPalavraOculta());
			telaPrincipal.getW().setEnabled(false);
		}
		if(src == telaPrincipal.getX()) {
			op.verificaChute('X');
			telaPrincipal.setPalavraEscolhida(op.getPalavraOculta());
			telaPrincipal.getX().setEnabled(false);
		}
		if(src == telaPrincipal.getY()) {
			op.verificaChute('Y');
			telaPrincipal.setPalavraEscolhida(op.getPalavraOculta());
			telaPrincipal.getY().setEnabled(false);
		}
		if(src == telaPrincipal.getZ()) {
			op.verificaChute('Z');
			telaPrincipal.setPalavraEscolhida(op.getPalavraOculta());
			telaPrincipal.getZ().setEnabled(false);
		}
		if(op.getNumErros() > 0) {
			if(op.getNumErros() == 5) {
				telaPrincipal.reabilitarBotoes(false);
			}
			telaPrincipal.setForca(op.getNumErros());
		}
		if(op.getPalavraEscolhida().length() != 0 && op.getNumAcertos() == op.getQtdLetras()) {
			telaPrincipal.reabilitarBotoes(false);
			telaPrincipal.setForca(-1);

		}
	}
}
