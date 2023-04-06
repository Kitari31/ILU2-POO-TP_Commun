package model;

import java.util.Iterator;

public class CentraleReservation<E extends EntiteReservable <F>,F extends Formulaire> {
	E[] entiteReserve;
	int nbrEntite= 0;
	
	public CentraleReservation(E[] entiteReserve) {
		this.entiteReserve = entiteReserve;
		this.nbrEntite = nbrEntite;
	}
	
	public int ajouterEntite(E entite) {
		if(nbrEntite>entiteReserve.length) {
			return -1;
		}
		entiteReserve[nbrEntite]=entite;
		nbrEntite++;
		return nbrEntite;
	}
	
	public int[] donnerPossibilite(F formulaire) {
		int[] entiteLibre = new int[nbrEntite];
		for (int i = 0; i < entiteReserve.length; i++) {
			if(entiteReserve[i].estLibre(formulaire)) {
				entiteLibre[i]=i;
			}else {
				entiteLibre[i]=0;
			}
		}
		return entiteLibre;
	}
	
	public Reservation reserver(int numeroEntite, F formulaire) {
		if(!entiteReserve[numeroEntite].estLibre(formulaire)) {
			return null;
		}
		return entiteReserve[numeroEntite].reserver(formulaire);
	}
}
