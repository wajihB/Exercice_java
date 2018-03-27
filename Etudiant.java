package etudiant;
import java.util.ArrayList;

public class Etudiant {
	public String nom, prenom;
	public int age;
	public double notes;


	public Etudiant(String _nom, String _prenom, int _age) {


		nom = _nom;
		prenom = _prenom;
		age = _age;
	}

	public Etudiant (String _nom, String _prenom, int _age, double _notes) {

		nom = _nom;
		prenom = _prenom;
		age = _age;
		notes=_notes;
	}
	/*  public String getNom() {
	return nom;
    }
    void setAge(int _age) {
	age = _age;
    } */

	public String getNom() {
		return nom;
	}


	public void setNom(String nom) {
		this.nom = nom;
	}


	public String getPrenom() {
		return prenom;
	}


	public void setPrenom(String prenom) {
		this.prenom = prenom;
	}


	public int getAge() {
		return age;
	}


	public void setAge(int age) {
		this.age = age;
	}


	public double getNotes() {
		return notes;
	}


	public void setNotes(double notes) {
		this.notes = notes;
	}
}


