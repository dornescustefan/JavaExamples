package com.GUI;

import java.awt.Canvas;
import java.awt.Graphics;

import javax.swing.JFrame;

public class JavaGUI {


	public static void drawCanvas() {
		JFrame frame = new JFrame("My Drawing");
		Canvas canvas = new Canvas();
		canvas.setSize(400, 400);
		frame.add(canvas);
		frame.pack();
		frame.setVisible(true);
		}
	public static void paint(Graphics g) {
		g.fillOval(100, 100, 200, 200);
		}
	
}
