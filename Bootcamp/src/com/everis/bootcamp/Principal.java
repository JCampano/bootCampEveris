package com.everis.bootcamp;

import javax.swing.JOptionPane;

public class Principal {

	public static void main(String[] args) {
		String palabra=JOptionPane.showInputDialog("Introduce tu nombre:");
		System.out.println("Hello world "+palabra+".");
		JOptionPane.showMessageDialog(null, "Hola "+palabra+".");
	}

}
