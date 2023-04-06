package model;

public class ReservationHotel extends Reservation{
	private int nbLitSimple;
	private int nbLitDouble;
	private int numChambre;
	
	public ReservationHotel(int jour, int mois) {
		super(jour, mois);
	}

	@Override
	public String toString() {
		return "Le "+ jour +"/"+ mois +" : chambre n�"+ numChambre +" avec " + nbLitSimple + " lit simple et " + nbLitDouble + " lit doubles.\n";
	}
}
