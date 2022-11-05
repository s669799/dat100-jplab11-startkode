package no.hvl.dat100.jplab11.oppgave4;

import java.io.FileNotFoundException;
import java.io.PrintWriter;

import javax.swing.JOptionPane;

import no.hvl.dat100.jplab11.oppgave3.Blogg;

public class SkrivBlogg {

	public static boolean skriv(Blogg samling, String mappe, String filnavn) {
		boolean skrevet = false;
		PrintWriter skriver = null;
		
		try {
			skriver = new PrintWriter(mappe + filnavn);
			skriver.println(samling.toString());
			skrevet = true;
						
		} catch (FileNotFoundException e) {
			JOptionPane.showMessageDialog(null, "Fil kan ikke åpnes!");
		} finally {
			if (skriver != null) {
				skriver.close();
			}
		}
		return skrevet;
	}
}
