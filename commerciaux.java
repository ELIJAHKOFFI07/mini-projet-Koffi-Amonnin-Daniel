package miniprojet;

import javax.swing.JOptionPane;

public class commerciaux extends  Personnel {
 private  int vente;
	public commerciaux(String name, String matricule, int indice) {
		super(name, matricule, indice);
	}
	
protected int updatevente() {
 vente=Integer.parseInt(JOptionPane.showInputDialog(null,"Entrer le nombre de vos ventes "));// on entre le nombre de ventes 
return vente;
}


protected long Salaire() {
	return super.Salaire()+(3*vente);// la vente est multipliée par 3
}

}
