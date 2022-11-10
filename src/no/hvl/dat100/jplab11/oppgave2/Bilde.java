package no.hvl.dat100.jplab11.oppgave2;

import no.hvl.dat100.jplab11.common.TODO;

public class Bilde extends Tekst {

	// TODO - objekt variable
	private String url;
	
	public Bilde(int id, String bruker, String dato, String tekst, String url) {
		getId();
		setBruker(bruker);
		setDato(dato);
		setTekst(tekst);
		setUrl(url);
	}

	public Bilde(int id, String bruker, String dato, int likes, String tekst, String url) {
		getId();
		setBruker(bruker);
		setDato(dato);
		getLikes();
		setTekst(tekst);
		setUrl(url);
	}
	
	public String getUrl() {
		return url;

	}

	public void setUrl(String url) {
		this.url = url;
	}

	@Override
	public String toString() {
		String tekst = ("TEKST\n" + getId() + "\n" + getBruker() + "\n" + getDato() + "\n" + getLikes() + "\n" + getTekst() + "\n"+ getUrl() + "\n");
		return tekst;

	}

	// Metoden nedenfor er kun for valgfri oppgave 6
	public String toHTML() {
		
		throw new UnsupportedOperationException(TODO.method());
				
	}
}
