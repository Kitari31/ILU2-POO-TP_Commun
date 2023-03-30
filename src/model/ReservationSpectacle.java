package model;

public class ReservationSpectacle extends Reservation{
	private int numZone;
	private int numChaise;
	
	public ReservationSpectacle(int jour, int mois) {
		super(jour, mois);
		this.numZone = numZone;
		this.numChaise = numChaise;
	}

	@Override
	public String toString() {
		return "Le "+ jour +"/"+ mois +" : La place " + numChaise + " dans la zone " + numZone +".\n";
	}
}
