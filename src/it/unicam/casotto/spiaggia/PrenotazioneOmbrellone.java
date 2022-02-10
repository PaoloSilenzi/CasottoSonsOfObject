package it.unicam.casotto.spiaggia;
import java.util.ArrayList;
import java.time.LocalDate;

public class PrenotazioneOmbrellone {

	private int idPrenotazioneO;
	private int dataInizio;
	private int dataFine;
	private int idCliente;
	private int idOmbrellone;

	/**
	 * 
	 * @param datainizio
	 * @param datafine
	 */
	public ArrayList<Ombrellone> cercaOmbrelloniLiberi(LocalDate datainizio, LocalDate datafine) {
		// TODO - implement PrenotazioneOmbrellone.cercaOmbrelloniLiberi
		throw new UnsupportedOperationException();
	}

	/**
	 * 
	 * @param idOmbrellone
	 */
	public void prenotaOmbrellone(String idOmbrellone) {
		// TODO - implement PrenotazioneOmbrellone.prenotaOmbrellone
		throw new UnsupportedOperationException();
	}

	/**
	 * 
	 * @param quantita
	 */
	public void richiediLettinoAggiuntivo(int quantita) {
		// TODO - implement PrenotazioneOmbrellone.richiediLettinoAggiuntivo
		throw new UnsupportedOperationException();
	}

	public void generaRiepilogo() {
		// TODO - implement PrenotazioneOmbrellone.generaRiepilogo
		throw new UnsupportedOperationException();
	}

	public void confermaPrenotazione() {
		// TODO - implement PrenotazioneOmbrellone.confermaPrenotazione
		throw new UnsupportedOperationException();
	}

	public void annullaPrenotazione() {
		// TODO - implement PrenotazioneOmbrellone.annullaPrenotazione
		throw new UnsupportedOperationException();
	}

	/**
	 * 
	 * @param qrCode
	 */
	public void getIdPrenotazione(String qrCode) {
		// TODO - implement PrenotazioneOmbrellone.getIdPrenotazione
		throw new UnsupportedOperationException();
	}

	/**
	 * 
	 * @param qrCode
	 */
	public void verificaPrenotazione(String qrCode) {
		// TODO - implement PrenotazioneOmbrellone.verificaPrenotazione
		throw new UnsupportedOperationException();
	}

}