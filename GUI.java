package Calculadora;

import java.awt.BorderLayout;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;



public class GUI {
	
	JLabel label = new JLabel(" ");
	ArrayList<String> numeros = new ArrayList<String>();
	
	private  class EscuchadorInterno implements ActionListener{
		public void actionPerformed(ActionEvent e) {
			
			
			String comando = e.getActionCommand();
			
			actualizaTextoLabel(comando);

		}
	}
	
	public  void actualizaTextoLabel(String comando) {
		String resultado = "";
		if (comando == "-->") {
			int largura = numeros.size();
			numeros.remove(largura - 1);
			for (int i = 0; numeros.size() > i; i++) {
				resultado = resultado + numeros.get(i);
			}
			label.setText(resultado);
			
		}else if(comando == "C"){
			
			numeros.removeAll(numeros);
			for (int i = 0; numeros.size() > i; i++) {
				resultado = resultado + numeros.get(i);
			}
			label.setText(resultado);
			
		}else {
		numeros.add(comando);
		
		for (int i = 0; numeros.size() > i; i++) {
			resultado = resultado + numeros.get(i);
		}
		label.setText(resultado);
		}
	}
	
	public void Calculadora(){
		JFrame.setDefaultLookAndFeelDecorated(true);
		JFrame frame = new JFrame("Border layout Itaca");
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		JPanel panelSuperior = new JPanel();
		
		
		JButton jb1 = new JButton("1");
		JButton jb2 = new JButton("2");
		JButton jb3 = new JButton("3");
		JButton jb4 = new JButton("4");
		JButton jb5 = new JButton("5");
		JButton jb6 = new JButton("6");
		JButton jb7 = new JButton("7");
		JButton jb8 = new JButton("8");
		JButton jb9 = new JButton("9");
		JButton jb0 = new JButton("0");
		JButton jbMas = new JButton("+");
		JButton jbMenos = new JButton("-");
		JButton jbMulti = new JButton("X");
		JButton jbDivid = new JButton("/");
		JButton jbBorrar = new JButton("-->");
		JButton jbIgual = new JButton("=");
		JButton jbReset = new JButton("C");
		JButton jbPunto = new JButton(".");
		JButton jbMasMenos = new JButton("+/-");
		
		
		
		EscuchadorInterno eb = new EscuchadorInterno();
		
		jb1.addActionListener(eb);
		jb2.addActionListener(eb);
		jb3.addActionListener(eb);
		jb4.addActionListener(eb);
		jb5.addActionListener(eb);
		jb6.addActionListener(eb);
		jb7.addActionListener(eb);
		jb8.addActionListener(eb);
		jb9.addActionListener(eb);
		jb0.addActionListener(eb);
		jbMas.addActionListener(eb);
		jbMenos.addActionListener(eb);
		jbBorrar.addActionListener(eb);
		jbMulti.addActionListener(eb);
		jbReset.addActionListener(eb);
		jbPunto.addActionListener(eb);
		jbMasMenos.addActionListener(eb);
		jbDivid.addActionListener(eb);
		jbIgual.addActionListener(eb);
		
		
		JPanel panel = new JPanel();
		
		panel.setLayout(new BorderLayout());

		JPanel panelCentral = new JPanel();
		
		
		GridBagConstraints c = new GridBagConstraints();
	
		panelCentral.setLayout(new GridBagLayout());
		
		
		
		c.fill = GridBagConstraints.HORIZONTAL;
		c.gridx = 0;
		c.gridy = 1;
		panelCentral.add(jb7,c);
		
		c.fill = GridBagConstraints.HORIZONTAL;
		c.gridx = 1;
		c.gridy = 1;
		panelCentral.add(jb8,c);
		
		c.fill = GridBagConstraints.HORIZONTAL;
		c.gridx = 2;
		c.gridy = 1;
		panelCentral.add(jb9,c);
		
		c.fill = GridBagConstraints.HORIZONTAL;
		c.gridx = 3;
		c.gridy = 1;
		panelCentral.add(jbMasMenos,c);
		
		c.fill = GridBagConstraints.HORIZONTAL;
		c.gridx = 4;
		c.gridy = 1;
		panelCentral.add(jbBorrar,c);
		
		c.fill = GridBagConstraints.HORIZONTAL;
		c.gridx = 0;
		c.gridy = 2;
		panelCentral.add(jb4,c);
		
		c.fill = GridBagConstraints.HORIZONTAL;
		c.gridx = 1;
		c.gridy = 2;
		panelCentral.add(jb5,c);
		
		c.fill = GridBagConstraints.HORIZONTAL;
		c.gridx = 2;
		c.gridy = 2;
		panelCentral.add(jb6,c);
		
		c.fill = GridBagConstraints.HORIZONTAL;
		c.gridx = 3;
		c.gridy = 2;
		panelCentral.add(jbMulti,c);
		
		c.fill = GridBagConstraints.HORIZONTAL;
		c.gridx = 4;
		c.gridy = 2;
		panelCentral.add(jbDivid,c);
		
		c.fill = GridBagConstraints.HORIZONTAL;
		c.gridx = 0;
		c.gridy = 3;
		panelCentral.add(jb1,c);
		
		c.fill = GridBagConstraints.HORIZONTAL;
		c.gridx = 1;
		c.gridy = 3;
		panelCentral.add(jb2,c);
		
		c.fill = GridBagConstraints.HORIZONTAL;
		c.gridx = 2;
		c.gridy = 3;
		panelCentral.add(jb3,c);
		
		c.fill = GridBagConstraints.HORIZONTAL;
		c.gridx = 3;
		c.gridy = 3;
		panelCentral.add(jbMenos,c);
		
		c.fill = GridBagConstraints.HORIZONTAL;
		c.gridx = 0;
		c.gridy = 4;
		panelCentral.add(jbReset,c);
		
		c.fill = GridBagConstraints.HORIZONTAL;
		c.gridx = 1;
		c.gridy = 4;
		panelCentral.add(jb0,c);
		
		c.fill = GridBagConstraints.HORIZONTAL;
		c.gridx = 2;
		c.gridy = 4;
		panelCentral.add(jbPunto,c);
		
		c.fill = GridBagConstraints.HORIZONTAL;
		c.gridx = 3;
		c.gridy = 4;
		panelCentral.add(jbMas,c);
		
		c.fill = GridBagConstraints.HORIZONTAL;
		c.ipady = 27;      
		c.weightx = 0.0;
		c.gridheight = 2;
		c.gridx = 4;
		c.gridy = 3;
		panelCentral.add(jbIgual,c);
		
		
		panelSuperior.add(label);
		panel.add(panelSuperior, BorderLayout.NORTH);
		panel.add(panelCentral, BorderLayout.CENTER);
		frame.add(panel);
		frame.pack();
		frame.setVisible(true);
	}
	
	
	
	
	
	public static void main(String[] args) {
	
	GUI gui = new GUI();
	
	gui.Calculadora();
	
}
	}
