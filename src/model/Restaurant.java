package model;

public class Restaurant implements IEtablissement {
	private Table[] tables = new Table[100];
	int nbrTable = 0;
	private CentraleReservation<EntiteReservable<FormulaireRestaurant>, FormulaireRestaurant> centraleReservation;
	
	public void ajouterTable(int nbrChaise) {
		
	}
	
	public int[] donnerPossibilites(FormulaireRestaurant formulaire) {
		return centraleReservation.donnerPossibilite(formulaire);
	}
	
	public Reservation reserver(int numEntite, FormulaireRestaurant formulaire) {
		return tables[numEntite].reserver(formulaire);
	}
	
	
	
	//Classe Interne Table
	
	public class Table extends EntiteReservable<FormulaireRestaurant> {
		private int nbrChaises;
		private CalendrierAnnuel calendrierPersonnel;
		private int identifiant;
		private FormulaireRestaurant formulaire;
		private CalendrierAnnuel calendrierDeuxiemeService;
		

		public Table( int numeroID, CalendrierAnnuel calendrierPersonnel, FormulaireRestaurant formulaire, int nbrChaises) {
			super(numeroID, calendrierPersonnel, formulaire);
			this.nbrChaises=nbrChaises;
		}
		

		@Override
		public Reservation reserver(FormulaireRestaurant formulaire) {
			if(!estLibre(formulaire)) {
				return null;
			}
			if(formulaire.getNumService()==1) {
				calendrierPersonnel.reserver(formulaire.getJour(), formulaire.getMois());
				return new ReservationRestaurant(formulaire.getJour(), formulaire.getMois()
						,formulaire.getNombrePersonnes(),1);
			}else {
				calendrierDeuxiemeService.reserver(formulaire.getJour(), formulaire.getMois());
				return new ReservationRestaurant(formulaire.getJour(), formulaire.getMois()
						,formulaire.getNombrePersonnes(),2);
			}
			
		}
		
		@Override
		public boolean compatible(FormulaireRestaurant formulaire) {
			return (formulaire.getNombrePersonnes() == nbrChaises);
		}


	}


}