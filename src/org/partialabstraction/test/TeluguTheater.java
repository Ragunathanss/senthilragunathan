package org.partialabstraction.test;
// child 2
public class TeluguTheater extends Movie{

	@Override
	public void theaterName() {
	System.out.println("Theater name is DCR");
	}

	@Override
	public void ticketRate() {
		System.out.println("ticket rate is 300");	
	}
	
	public static void main(String[] args) {
		TeluguTheater t = new TeluguTheater();
		t.theaterName();
		t.ticketRate();
		t.movieName();
		t.portalName();
	}
	}

