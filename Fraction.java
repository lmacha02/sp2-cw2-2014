/**
 * @author Luis
 * 
 */

public class Fraction {
    private int numerator;
    private int denominator;

    public Fraction(int num, int denom) {
        if (denom == 0) {
            System.out.println("Invalid fraction with denominator 0"); // this should use exceptions
            return;
        }
        int gcd = myGcd(num, denom);
        setNumerator(num / gcd);
        setDenominator(denom / gcd);
    }

    @Override
    public String toString() {
    	if(getDenominator() == 1){
    		return ""+ getNumerator();
    	}
    	
        return "" + getNumerator() + '/' + getDenominator();
    }

    public int getNumerator() {
        return numerator;
    }

    public void setNumerator(int num) {
        numerator = num;
    }

    public int getDenominator() {
        return denominator;
    }

    public void setDenominator(int num) {
        denominator = num;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Fraction fraction = (Fraction) o;

        if (getDenominator() != fraction.getDenominator()) return false;
        if (getNumerator() != fraction.getNumerator()) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = numerator;
        result = 31 * result + denominator;
        return result;
    }

    public Fraction multiply(Fraction frac) {
        int num = this.getNumerator() * frac.getNumerator();
        int denom = this.getDenominator() * frac.getDenominator();
        return new Fraction(num, denom);
    }

    public Fraction negate(){	
    	int num = this.getNumerator() * -1;
    	int denom = this.getDenominator();
    	
    	return new Fraction(num, denom);
    }
    
    public Fraction absValue(){
    	int num = Math.abs(this.getNumerator());
    	int denom = Math.abs(this.getDenominator());
    
    	return new Fraction(num, denom);
    }
    
    private int myGcd(int a, int b) {
        while (b != 0) {
            int t = b;
            b = a % b;
            a = t;
        }
        return a;
    }
    
    public Fraction divide(Fraction frac){
    	
    	int num = frac.getDenominator();
    	int denom = frac.getNumerator();
    	
    	Fraction f2 = new Fraction(num, denom);
    	
    	return this.multiply(f2);
    }
    
    public Fraction add(Fraction frac){
    	
    	int num;
    	int denom;
    	
    	if(this.getDenominator() == frac.getDenominator()){
    		num = this.getNumerator() + frac.getNumerator();
    		denom = this.getDenominator();
    	}else{
    		
    		num = (this.getNumerator() * frac.getDenominator()) + (frac.getNumerator() * this.getDenominator());
    		denom = this.getDenominator() * frac.getDenominator();
    	}
    	
    	return new Fraction(num,denom);	
    }

	public Fraction subtract(Fraction frac) {
		
		int num;
		int denom;
		
		if(this.getDenominator() == frac.getDenominator()){
			num = this.getNumerator() - frac.getNumerator();
			denom = this.getDenominator();
		}else{
			num = (this.getNumerator() * frac.getDenominator()) - (frac.getNumerator() * this.getDenominator());
    		denom = this.getDenominator() * frac.getDenominator();
		}
		return new Fraction(num, denom);
	}
}
