package model;

public class FormulaireHotel implements Formulaire{
	private int jour;
	private int mois;
	private int numChambre;
	private int nbrLitSimple;
	private int nbrLitDouble;
	
	
	public FormulaireHotel(int jour, int mois,int nbrLitSimple,int nbrLitDouble) {
		this.jour = jour;
		this.mois = mois;
		this.nbrLitSimple=nbrLitSimple;
		this.nbrLitDouble=nbrLitDouble;
	}
	
	@Override
	public int getJour() {
		return this.jour;
	}

	@Override
	public int getMois() {
		return this.mois;
	}

	public int getNbrLitSimple() {
		return nbrLitSimple;
	}

	public int getNbrLitDouble() {
		return nbrLitDouble;
	}
	
	//Identification
	public int getIdentificationEntite() {
		return this.numChambre;
	}
	
	public void setIdentificationEntite(int numChambre) {
		this.numChambre=numChambre;
	}


	
	

}