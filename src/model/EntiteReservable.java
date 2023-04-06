package model;

public abstract class EntiteReservable<F extends Formulaire> {
	private CalendrierAnnuel calendrierPersonnel;
	private int numero;
	
	public EntiteReservable(int numero, CalendrierAnnuel calendrierPersonnel, F formulaire) {
		this.numero = numero;
		this.calendrierPersonnel = calendrierPersonnel;
	}
	
	public int getNumero() {
		return numero;
	}
	
	public void setNumero(int numero) {
		this.numero = numero;
	}
	
	public boolean estLibre(F formulaire) {
		return calendrierPersonnel.estLibre(formulaire.getJour(),formulaire.getMois());
	}	
	
	public abstract boolean compatible(F formulaire);
	
	public abstract Reservation reserver(F formulaire);
}