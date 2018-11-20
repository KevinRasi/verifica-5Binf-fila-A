
 
package it.marconicivitavecchia.as2018_19.c5Binf;
import javax.swing.*;

public class Main extends JFrame {
	
	public Main() {
		super("");
		super.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
		super.setSize(300,900);
		
		StringBuilder sb = new StringBuilder();
		sb.append("<html>");
		sb.append("<h1>Color Picker</h1>");
		
		sb.append("<div style='display:table'>");
		
		sb.append("<div style='display:table-row'>");
		sb.append("<div style='display:table-cell'>");
		sb.append("Name");
		sb.append("</div>");
		sb.append("<div style='display:table-cell'>");
		sb.append("Hex");
		sb.append("</div>");
		sb.append("<div style='display:table-cell'>");
		sb.append("Rgb");
		sb.append("</div>");
		
		sb.append("</div>");
		sb.append("<div style='display:table-row'>");
		sb.append("<div style='display:table-cell'>");
		sb.append("Persian Green");
		sb.append("</div>");
		sb.append("<div style='display:table-cell'>");
		sb.append("#00A693");
		sb.append("</div>");
		sb.append("<div style='display:table-cell'>");
		sb.append("0,166,147");
		sb.append("</div>");
		
		sb.append("</div>");
		sb.append("<div style='display:table-row'>");
		sb.append("<div style='display:table-cell'>");
		sb.append("Venice Blue");
		sb.append("</div>");
		sb.append("<div style='display:table-cell'>");
		sb.append("#055989");
		sb.append("</div>");
		sb.append("<div style='display:table-cell'>");
		sb.append("5,89,137");
		sb.append("</div>");
		
		sb.append("</div>");
		sb.append("<div style='display:table-row'>");
		sb.append("<div style='display:table-cell'>");
		sb.append("Pale Blue");
		sb.append("</div>");
		sb.append("<div style='display:table-cell'>");
		sb.append("#73D1E4");
		sb.append("</div>");
		sb.append("<div style='display:table-cell'>");
		sb.append("115,209,228");
		sb.append("</div>");
		sb.append("</div>");
		
		
		
		
		
	    
String htmlText = sb.toString();
		
		super.add(new JLabel(htmlText));
		super.pack();
		super.setVisible(true);
		 
		System.out.println("Verifica Swing-GitHub");
		
		
	}
	
	public static void main (String[] args) {
		new Main();
	}
}

