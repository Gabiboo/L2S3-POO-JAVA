package ex1;

public class Fraction {
	
	private int n;
	private int d;
	
	//Pas d'erreur a cause du 0 au denominateur 
	public Fraction(int n, int d){
		this.n = n;
		if(d!= 0)
			this.d = d;
		else
			this.d=1;
	}
	
	//retourne la valeur de num et du denom
	public int getNumerateur(){
		return this.n;
	}
	
	public int getDenominateur(){
		return this.d;
	}
	
	//Modifier le numerateur (setter)
	public void setNumerateur(int n){
		this.n = n;
	}
	
	public void setDenominateur(int d){
		this.d = d;
	}
	
	public boolean egaleA(Fraction f){
		if(this.n == f.getNumerateur() && this.d == f.getDenominateur())
			return true;
		else
			return false;
		
	}
	
	public void ajoute(Fraction f){
		this.n = this.n * f.getDenominateur() + this.d * f.getNumerateur();
		this.d = this.d * f.getDenominateur();
	}
	
	public static int pgcd(int a, int b){
		int c;
		while (b != 0){
			c = a % b;
			a = b;
			b = c;
		}
		return a;
	}
	
	
	//Reduit / simplifie la fraction
	public void reduire(){
		
	}


	public void multiplie(Fraction f){
		this.n = this.n * f.getNumerateur();
		this.d = this.d * f.getDenominateur();
	}
	
	public void inverse(){
		int j;
		j = this.n;
		this.n = this.d;
		this.d = this.n;
	}
	
	public void multiplierParCoeff(int i){
		this.n = this.n * i; 
	}
	
	public void divise(Fraction f){
		inverse();
		multiplie(f);
	}

}
