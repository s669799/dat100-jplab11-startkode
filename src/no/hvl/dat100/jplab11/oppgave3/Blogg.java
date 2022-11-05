package no.hvl.dat100.jplab11.oppgave3;

import no.hvl.dat100.jplab11.common.TODO;
import no.hvl.dat100.jplab11.oppgave1.*;

public class Blogg {

	// TODO: objektvariable
	private Innlegg[] innleggtabell;
	private int nesteledig;

	public Blogg() {
		innleggtabell = new Innlegg[20];
	}

	public Blogg(int lengde) {
		innleggtabell = new Innlegg[lengde];
	}

	public int getAntall() {
		return nesteledig;
	}

	public Innlegg[] getSamling() {
		return innleggtabell;
	}

	public int finnInnlegg(Innlegg innlegg) {
		int pos = 0;
		boolean funnet = false;

		while (pos < nesteledig && !funnet) {
			if (innleggtabell[pos].erLik(innlegg)) {
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
		boolean funnet = false;
		
		if (finnInnlegg(innlegg) >= 0) {
			funnet = true;
		}
		return funnet;
	}

	public boolean ledigPlass() {
		return nesteledig < innleggtabell.length;
	}

	public boolean leggTil(Innlegg innlegg) {
		boolean lagttil = false;

		if (!finnes(innlegg)) {
			innleggtabell[nesteledig] = innlegg;
			nesteledig++;
			lagttil = true;
		}
		return lagttil;
	}

	public String toString() {
		String s = "" + nesteledig + "\n";

		for (int i = 0; i < nesteledig; i++) {
			s += innleggtabell[i];
		}
		return s;
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