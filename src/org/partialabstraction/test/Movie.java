package org.partialabstraction.test;
// parent
public abstract class Movie{
	
// non abs method
	public void movieName() {
		System.out.println("movie name is PS");
	}
	
	// non abs method
public void portalName() {
	System.out.println("portal name is book my show");
}

// abs method
public abstract void theaterName();


// abs method
public abstract void ticketRate();
	

}

