
package org.fullyabs.est;
// child 2
public class ChiefMinister implements PrimeMinister{

	@Override
	public void party() {
	System.out.println("party name is XCV");
		
	}

	@Override
	public void rules() {
		System.out.println("rules are regulated");
		
	}

	@Override
	public void laws() {
		System.out.println("laws are classified");
		
	}
	public static void main(String[] args) {
		ChiefMinister c = new ChiefMinister();
		c.party();
		c.rules();
		c.laws();
	}

}
