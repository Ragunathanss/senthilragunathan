package org.partialabstraction.test;
// child 1
public class TamilTheater extends Movie {

	@Override
	public void theaterName() {
	System.out.println("theater name is PVR");
	}

	@Override
	public void ticketRate() {
		System.out.println("ticket rate is 200");
	}
	
public static void main(String[] args) {
	TamilTheater t = new TamilTheater();
	t.theaterName();
	t.ticketRate();
	t.movieName();
	t.portalName();
}
}
