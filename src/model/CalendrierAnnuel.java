package model;

public class CalendrierAnnuel {
	private Mois[] mois;
	
	public CalendrierAnnuel() {
		this.mois = new Mois[12];
		mois[0] = new Mois("janvier",31);
		mois[1] = new Mois("f�vrier",28);
		mois[2] = new Mois("mars",31);
		mois[3] = new Mois("avril",30);
		mois[4] = new Mois("mai",31);
		mois[5] = new Mois("juin",30);
		mois[6] = new Mois("juillet",31);
		mois[7] = new Mois("aout",31);
		mois[8] = new Mois("septembre",30);
		mois[9] = new Mois("octobre",31);
		mois[10] = new Mois("novembre",30);
		mois[11] = new Mois("decembre",31);
	}
	
	private static class Mois{
		private String nom;
		private boolean[] jours;
		
		private Mois(String nom, int nbJours) {
			this.nom = nom;
			this.jours = new boolean[nbJours];
		}
		
		private boolean estLibre(int jour) {
			return !jours[jour-1];
		}
		
		private void reserver(int jour) {
			if(!estLibre(jour)) {
				throw new IllegalStateException("Le jour " + jour + " n'est pas disponible");
			}
			jours[jour-1]=true;
		}
	}
	
	public boolean estLibre(int jour, int numMois) {
		return this.mois[numMois-1].estLibre(jour);
	}
	
	public boolean reserver(int jour, int numMois) {
		if(!estLibre(jour,numMois)) {
			return false;
		}
		mois[numMois-1].reserver(jour);
		return true;
	}

}
