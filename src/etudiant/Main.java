package etudiant;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {


		System.out.println("Bonjour, bienvenue dans le systeme de gestion des notes d'etudiant.");
		System.out.println("1. Ajouter un etudiant   2.Supprimer un etudiant    3.Editer une note à un etudiant    4.Quitter");
		Scanner sc = new Scanner(System.in); 
		int choixUtilisateur = sc.nextInt();
		Promotion promo1=new Promotion("promo1");
		while (choixUtilisateur==4) {
			switch (choixUtilisateur) {

			case 1:  System.out.println("nom : ");
			sc.nextLine();
			String _nom=sc.nextLine();

			System.out.println("prenom : ");
			String _prenom=sc.nextLine();

			System.out.println("age : ");

			int _age=sc.nextInt();

			Etudiant etu1 = new Etudiant(_nom, _prenom, _age); // je ne veut pas du dernier parametre, le null correspond a la note 
			promo1.ajouterEtudiant(etu1);

			break;

			case 2:  

				System.out.println("Nom de l'etudiant à supprimer");
				System.out.println("nom : ");
				sc.nextLine();
				String nomASupprimer=sc.nextLine();

				promo1.supprimerEtudiant(nomASupprimer);



				break;
			case 3:
				System.out.println("Nom de l'etudiant à supprimer : ");
				sc.nextLine();
				String nomNotes=sc.nextLine();
				sc.nextLine();
				System.out.println("Note de l'etudiant a ajouter: ");
				sc.nextLine();
				double noteSaisie=sc.nextDouble();
				promo1.setnoteEtudiant(nomNotes, noteSaisie);


				break;
			case 4:  
				break;
			}
		}
	}
}




