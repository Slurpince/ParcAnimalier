package application;

import javafx.scene.control.Button;

public class Animal {

	String famille;
	String nom;
	String photo;
	String race;
	int    age;
	String sexe;
	double taille;
	String villerefuge;
	
	Animal(String famille, String nom, String photo, String race, int age, String sexe, double taille, String villerefuge) {
		this.famille = famille;
		this.nom = nom;
		this.photo = photo;
		this.race = race;
		this.age = age;
		this.sexe = sexe;
		this.taille = taille;
		this.villerefuge = villerefuge;
	}
	
	public String getFamille() {
		return famille;
	}

	public void setFamille(String famille) {
		this.famille = famille;
	}

	public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

	public String getPhoto() {
		return photo;
	}

	public void setPhoto(String photo) {
		this.photo = photo;
	}

	public String getRace() {
		return race;
	}

	public void setRace(String race) {
		this.race = race;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getSexe() {
		return sexe;
	}

	public void setSexe(String sexe) {
		this.sexe = sexe;
	}

	public double getTaille() {
		return taille;
	}

	public void setTaille(double taille) {
		this.taille = taille;
	}

	public String getvillerefuge() {
		return villerefuge;
	}

	public void setvillerefuge(String villerefuge) {
		this.villerefuge = villerefuge;
	}
	
	
}
