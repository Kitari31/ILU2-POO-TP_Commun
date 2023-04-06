package model;

public class FormulaireSpectacle implements Formulaire{
	private int jour;
	private int mois;
	private int numZone;
	private int numChaise;

	public FormulaireSpectacle(int jour, int mois,int numZone) {
		this.jour = jour;
		this.mois = mois;
		this.numZone=numZone;
	}
	
	@Override
	public int getJour() {
		return this.jour;
	}

	@Override
	public int getMois() {
		return this.mois;
	}

	public int getNumZone() {
		return numZone;
	}
	
	//Identification
	public int getIdentificationEntite() {
		return numChaise;
	}

	public void setIdentificationEntite(int numChaise) {
		this.numChaise = numChaise;
	} 

}