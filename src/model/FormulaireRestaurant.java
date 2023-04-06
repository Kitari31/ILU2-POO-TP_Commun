package model;

public class FormulaireRestaurant implements Formulaire{
	private int jour;
	private int mois;
	private int numTable;
	private int nbrPersonnes;
	private int numService;
	

	public FormulaireRestaurant(int jour, int mois,int nbrPersonnes,int numService) {
		this.jour = jour;
		this.mois = mois;
		this.nbrPersonnes=nbrPersonnes;
		this.numService=numService;
	}
	
	@Override
	public int getJour() {
		return this.jour;
	}

	@Override
	public int getMois() {
		return this.mois;
	}

	public int getNombrePersonnes() {
		return nbrPersonnes;
	}

	public int getNumService() {
		return numService;
	} 
	
	//Identification
		public int getIdentificationEntite() {
			return numTable;
		}

		public void setIdentificationEntite(int numTable) {
			this.numTable = numTable;
		}
	
	

}