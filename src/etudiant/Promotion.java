package etudiant;

import java.util.ArrayList;

public class Promotion {

	public String promotionName;
	public ArrayList<Etudiant> EtudiantArray;

	public Promotion (String _nomPromotion) {
		promotionName=_nomPromotion;
		EtudiantArray = new ArrayList<Etudiant>();
	}

	public String getPromotionName() {
		return promotionName;
	}



	public void ajouterEtudiant(Etudiant ajouterEtudiant) {

		Etudiant etudiant_temp=new Etudiant(ajouterEtudiant.getNom(),ajouterEtudiant.getPrenom(),ajouterEtudiant.getAge());
		EtudiantArray.add(etudiant_temp);
	}

	public void supprimerEtudiant(String nom) {


		for (int i=0; i<EtudiantArray.size();i++)
		{

			if(nom.equals(EtudiantArray.get(i).getNom()))
				EtudiantArray.remove(i);


		}
	}

	public void setnoteEtudiant(String Nom, double note) {
		for (int i=0; i<EtudiantArray.size();i++)
		{
			if(Nom.equals(EtudiantArray.get(i).getNom()))
				EtudiantArray.get(i).setNotes(note);

		}


	}



}
