package Ex1;

abstract class Bien {

	protected int valEuros;
	protected int coutEntretienMensuel;
	protected static int nbExemplaires;
	
	
	public void main(String[] args) {
		// TODO Auto-generated method stub
	}
	
	
	/* DEUX SORTES DE CONSTRUCTEURS !!
	public Bien() {
		valEuros = 0;
		coutEntretienMensuel = 0;
		nbExemplaires ++;
	}*/
	
	public Bien(int val, int cout) {
		valEuros = val;
		coutEntretienMensuel = cout;
		nbExemplaires ++;
	}
	
	protected int getValEuros() {
		return valEuros;
	}
	
	protected void setValEuros(int v) {
		this.valEuros = v;
	}
	
	protected int getCoutEntretienMensuel() {
		return coutEntretienMensuel;
	}
	
	protected void setCoutEntretienMensuel(int c) {
		this.coutEntretienMensuel = c;
	}
	
	protected static int getNbExemplaires() {
		return nbExemplaires;
	}
	
	
	
	public String getInfo() {
		return "Valeur du bien est égale à " + valEuros + "€ , le cout d'entretien est de " + coutEntretienMensuel + "€ .";
		
	}

}
