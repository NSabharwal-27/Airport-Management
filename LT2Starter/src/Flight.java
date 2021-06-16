
public class Flight {
	

	int flightNumber;
	Airport origin;
	Airport destination;
	double distance;
	
	public Flight(int flightNumber, Airport origin, Airport destination, double distance) {
		flightNumber = this.flightNumber;
		origin = this.origin;
		destination = this.destination;
		distance = this.distance;
	}
	
	public int getFlightNumber() {
		return this.flightNumber;
	}
	
	public Airport getOrigin() {
		return this.origin;
	}
	
	public Airport getDestination() {
		return this.destination;
	}
	
	public double getDistance() {
		return this.distance;
	}
}
