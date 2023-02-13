package gui;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.SwingConstants;

import impl.ConverterMethods;
import model.Currency;

public class MainWindow {
	
	
	public void createWindow() {
		
		JFrame frame = new JFrame("Converter");
		
		frame.setLayout(null);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setSize(400, 350);
		frame.getContentPane().setBackground(Color.darkGray);
		
		JLabel lbValuta = new JLabel("Unesite naziv valute za konvertovanje: ",  SwingConstants.CENTER);
		
		lbValuta.setBounds(10, 40, 240, 30);
		lbValuta.setOpaque(true);
		lbValuta.setForeground(Color.black);
		lbValuta.setBackground(Color.cyan);
		frame.add(lbValuta);
		
		JTextField tfValuta = new JTextField();
		tfValuta.setForeground(Color.black);
		tfValuta.setBackground(Color.cyan);
		tfValuta.setBounds(270, 40, 100, 30);
		frame.add(tfValuta);
		
		JLabel lbKolicina = new JLabel("Unesite kolicinu novca za konvertovanje: ",  SwingConstants.CENTER);
		
		lbKolicina.setBounds(10, 120, 240, 30);
		lbKolicina.setOpaque(true);
		lbKolicina.setForeground(Color.black);
		lbKolicina.setBackground(Color.cyan);
		frame.add(lbKolicina);
		
		JTextField tfKolicina = new JTextField();
		tfKolicina.setForeground(Color.black);
		tfKolicina.setBackground(Color.cyan);
		tfKolicina.setBounds(270, 120, 100, 30);
		frame.add(tfKolicina);
		
		JLabel lbUValutu = new JLabel("Unesite naziv valute konverzije: ",  SwingConstants.CENTER);
		
		lbUValutu.setBounds(10, 200, 240, 30);
		lbUValutu.setOpaque(true);
		lbUValutu.setForeground(Color.black);
		lbUValutu.setBackground(Color.cyan);
		frame.add(lbUValutu);
		
		JTextField tfUValutu = new JTextField();
		tfUValutu.setForeground(Color.black);
		tfUValutu.setBackground(Color.cyan);
		tfUValutu.setBounds(270, 200, 100, 30);
		frame.add(tfUValutu);
		
		JTextField tfRezultat = new JTextField();
		tfRezultat.setEditable(false);
		tfRezultat.setForeground(Color.black);
		tfRezultat.setBackground(Color.cyan);
		tfRezultat.setBounds(130, 260, 100, 30);
		frame.add(tfRezultat);
		
		JButton jbIzracunaj = new JButton("Convert");
		jbIzracunaj.setBounds(10, 260, 100, 30);
		jbIzracunaj.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				
				String valuta = tfValuta.getText();
				double kolicina = Double.parseDouble(tfKolicina.getText());
				
				Currency curr = new Currency(valuta, kolicina);
				String UValutu = tfUValutu.getText();
	
				Double rez = ConverterMethods.convert(curr, UValutu);
				tfRezultat.setText(rez.toString());
			}
			
		});
		frame.add(jbIzracunaj);
		
		frame.setLocationRelativeTo(null);
		frame.setVisible(true);
	}
	
}
