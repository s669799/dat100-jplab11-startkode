package no.hvl.dat100.jplab11.oppgave4;

import java.io.FileNotFoundException;
import java.io.PrintWriter;

import javax.swing.JOptionPane;

import no.hvl.dat100.jplab11.common.TODO;
import no.hvl.dat100.jplab11.oppgave3.Blogg;

public class SkrivBlogg {

	public static boolean skriv(Blogg samling, String mappe, String filnavn) {
		
		PrintWriter skriver = null;
		
		try {
			skriver = new PrintWriter(samling + mappe + filnavn);
			
		skriver.close();
		throw new UnsupportedOperationException(TODO.method());
		
		} catch (FileNotFoundException e) {
			JOptionPane.showMessageDialog(null, "Fil ikke funnet!");
		}
	}
}
