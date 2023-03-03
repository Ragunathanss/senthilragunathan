package org.fullyabs.est;
// child 1
public class CentralMinister implements PrimeMinister{
// checking to find conflict for git
	@Override
	public void party() {
		System.out.println("party name is ASD");
		
	}

	@Override
	public void rules() {
		System.out.println("No rules");
		
	}

	@Override
	public void laws() {
		System.out.println("no laws");
		
	}
	public static void main(String[] args) {
		CentralMinister c = new CentralMinister();
		c.party();
		c.rules();
		c.laws();
	}

}
