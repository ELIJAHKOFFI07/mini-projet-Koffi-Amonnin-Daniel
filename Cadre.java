package miniprojet;

import java.util.ArrayList;

import javax.swing.JOptionPane;

public class Cadre extends Personnel {
	ArrayList<Personnel>personnel=new ArrayList<>();// creéation d'un tableau dynamique de personnel
public Cadre(String name, String matricule, int indice) {
		super(name, matricule, indice);

	}

protected ArrayList<Personnel> register(int nbreSub) {// reçoit le nobre de subalterne comme paramètre
	for (int i=0;i<nbreSub;i++) {
		
 String nom=JOptionPane.showInputDialog(null,"entrer le nom");	
 String matricule =JOptionPane.showInputDialog(null,"entrer le matricule");	
 int Indice=Integer.parseInt(JOptionPane.showInputDialog(null,"entrer l'indice"));	
		personnel.add(new Personnel(nom,matricule,Indice));// on ajoute un nouveau subalterne au tableau dynamique
		
	}
	return personnel;
}
protected void Affichesubalterne() {
	for (Personnel personnel2 : personnel) {
		personnel2.Informtion();
	}// on affiche les informations pour chaque subalterne enregistré
}
}
