package no.hvl.dat100.jplab11.oppgave4;

import java.io.FileNotFoundException;
import java.io.PrintWriter;

import no.hvl.dat100.jplab11.common.TODO;
import no.hvl.dat100.jplab11.oppgave3.*;

public class SkrivBlogg {

	public static boolean skriv(Blogg samling, String mappe, String filnavn) {

		PrintWriter skriver = null;
		boolean skriv = true;
		try {
			skriver = new PrintWriter(mappe + filnavn);
			
			skriver.println(samling);
			
		}
		catch (FileNotFoundException e) {
			skriv = false;
		}
		finally {
			if(skriver != null) {
				skriver.close();
			}
		}
		return skriv;
	}
}
