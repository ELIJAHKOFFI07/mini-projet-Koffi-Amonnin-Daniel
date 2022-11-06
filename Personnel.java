package miniprojet;
/*
 * presenté par KOFFi Amonnin daniel Elie
 */
import javax.swing.JOptionPane;

public class Personnel {
private String name,matricule;
private int Indice;
static int paye=20000;// la valeur qui multipliée par 'indice permet d'obtenir le salaire
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public String getMatricule() {
	return matricule;
}
public void setMatricule(String matricule) {
	this.matricule = matricule;
}
public int getIndice() {
	return Indice;
}
public Personnel(String name, String matricule, int indice) {
	this.name = name;
	this.matricule = matricule;
	Indice = indice;
}
protected long Salaire() {
return paye*Indice;
}

public void Informtion() {
	JOptionPane.showMessageDialog(null,"nom:"+name+ " matricule:"+matricule+" Indice salariale: "+Indice);
}
}
