package no.hvl.dat100.jplab11.oppgave3;

import no.hvl.dat100.jplab11.common.TODO;
import no.hvl.dat100.jplab11.oppgave1.*;

public class Blogg {

	// TODO: objektvariable
	private Innlegg[] tabell;
	private int nesteledig;

	public Blogg() {
		tabell = new Innlegg[20];
		nesteledig = 20;
		
		throw new UnsupportedOperationException(TODO.constructor("Blogg"));
	}

	public Blogg(int lengde) {
		tabell = new Innlegg[lengde];
		nesteledig = 20;
		throw new UnsupportedOperationException(TODO.constructor("Blogg"));
	}

	public int getAntall() {
		throw new UnsupportedOperationException(TODO.method());
	}
	
	public Innlegg[] getSamling() {
		throw new UnsupportedOperationException(TODO.method());

	}
	
	public int finnInnlegg(Innlegg innlegg) {
		int pos = 0;
		boolean funnet = false;
		while (pos < nesteledig && !funnet) {
			if (tabell[pos].getInnlegg() == innlegg) {
				funnet = true;
			} else {
				pos++;
			}
		}
		if (funnet) {
			return pos;
		} else {
			return -1;
		}
	}

	public boolean finnes(Innlegg innlegg) {
		throw new UnsupportedOperationException(TODO.method());
	}

	public boolean ledigPlass() {
		throw new UnsupportedOperationException(TODO.method());

	}
	
	public boolean leggTil(Innlegg innlegg) {

		throw new UnsupportedOperationException(TODO.method());
	}
	
	public String toString() {
		throw new UnsupportedOperationException(TODO.method());
	}

	// valgfrie oppgaver nedenfor
	
	public void utvid() {
		throw new UnsupportedOperationException(TODO.method());
	}
	
	public boolean leggTilUtvid(Innlegg innlegg) {

		throw new UnsupportedOperationException(TODO.method());
		
	}
	
	public boolean slett(Innlegg innlegg) {
		
		throw new UnsupportedOperationException(TODO.method());
	}
	
	public int[] search(String keyword) {
		
		throw new UnsupportedOperationException(TODO.method());

	}
}