package miniprojet;

import java.util.ArrayList;

import javax.swing.JOptionPane;

public class Principale extends Personnel {
 private static  long Salairesub=0;
	public Principale(String name, String matricule, int indice) {
		super(name, matricule, indice);
	
	}

	public static void main(String[] args) {
	int enregistrement=Integer.parseInt( JOptionPane.showInputDialog(null,"Combien d'employes voulez vous enregistrer"));// pour les cadres 
Cadre cadre=new Cadre("Boston ","14005157M",39);
 ArrayList<Personnel>sub=cadre.register(enregistrement);// on enregistre les subalternes 
cadre.Affichesubalterne();// on affiche les subalternes
commerciaux commerce=new commerciaux("BIl","14005857P",14);
 long update=commerce.updatevente();// le commercial entre ses ventes 
JOptionPane.showMessageDialog(null, "le salaire total est  :" +SalaireTotal( sub,update )+"£" );

	}
protected static  long SalaireTotal(ArrayList<Personnel> personne, long vente) {
	for (int i=0;i<personne.size() ;i++) {
		  Salairesub=Salairesub+personne.get(i).Salaire();// on fais la somme des salaires de tous les subalternes
	}
	return Salairesub+vente;
}
}
