import java.util.ArrayList;

public class FlightTester {

	public static void main(String[] args) {

		System.out.println("(1.1)-------------------------------");
		Airport Toronto = new Airport("YYZ","CAN");
		System.out.println(Toronto.getClass());
		System.out.println(Toronto.getCountry());
				
		Airport Ottawa = new Airport("YOW","CAN");
		Airport Frankfurt = new Airport("FRA","GER");
		Airport Vancouver = new Airport("YVR","CAN");
		Airport HongKong = new Airport("HKG","HKG");
		
		System.out.println("(1.2)-------------------------------");	
		Airplane CRJ700 = new Airplane("Bombardier CRJ700",4660,78);
		System.out.println(CRJ700.getType());
		System.out.println(CRJ700.getRange());
		System.out.println(CRJ700.getSeats());
		
		Airplane B787 = new Airplane("Boeing 787",14800,290);
		Airplane A320 = new Airplane("Airbus A320",6150,160);
		Airplane C172 = new Airplane("Cessna 172",1289,3);		
		
		System.out.println("(1.3)-------------------------------");
		Flight YYZFRA = new Flight(872,Toronto,Frankfurt,6343.66);
		System.out.println(YYZFRA.getFlightNumber());
		System.out.println(YYZFRA.getOrigin().getCode());
		System.out.println(YYZFRA.origin.code);		
		System.out.println(YYZFRA.getDestination().getCode());
		System.out.println(YYZFRA.destination.code);			
		System.out.println(YYZFRA.getDistance());
		System.out.println(YYZFRA);

		Flight YYZYOW = new Flight(446,Toronto,Ottawa,362.08);
		Flight HKGYVR = new Flight(8,HongKong,Vancouver,10272.73);
		
	/*	System.out.println("(1.4)-------------------------------");
		Passenger[] passengers = {new Passenger("Susan",111111),new Passenger("Tom",222222),new Passenger("Alice",0),new Passenger("Mike",333333),new Passenger("Peter",0)};
		System.out.println(passengers[0].getName());
		System.out.println(passengers[0].getPassportNumber());
		System.out.println(passengers[4].getName());
		System.out.println(passengers[4].getPassportNumber());
		
		
		System.out.println("(2.1)-------------------------------");
		for (Passenger p : passengers) {
			YYZYOW.addPassenger(p);
		}		
		System.out.println("First passenger: " + YYZYOW.passengers.get(0).name);
		
		System.out.println("(2.2)-------------------------------");
		System.out.println("Passenger list for flight from Toronto to Ottawa:");
		ArrayList<Passenger> passengerList = YYZYOW.getPassengerList();
		for (Passenger p : passengerList) {
			System.out.println(p.name);
		}
		
		
		System.out.println("(3)-------------------------------");		
		System.out.println("Passenger " + passengers[0].name + "'s first flight is from " + passengers[0].flights.get(0).origin.code + " to " + passengers[0].flights.get(0).destination.code + ".");
	
		
		System.out.println("(4.1)-------------------------------");
		if (YYZFRA.setPlane(A320)) {
			System.out.println("A320 added successfully!");
		}
		else {
			System.out.println("The A320's range is too small. Use a different plane.");			
		}

		System.out.println("(4.2)-------------------------------");
		if (YYZFRA.setPlane(B787)) {
			System.out.println("787 added successfully!");
		}
		else {
			System.out.println("The 787's range is too small. Use a different plane.");			
		}

		System.out.println("(5.1)-------------------------------");
		YYZYOW.setPlane(C172);
		int n = YYZYOW.overBooked();
		if (n == 0) {
			System.out.println("Flight from Toronto to Ottawa has space left.");
		}
		else {
			System.out.println("Flight from Toronto to Ottawa has " + n + " passengers too many.");
		}
		
		System.out.println("(5.2)-------------------------------");
		for (Passenger p : passengers) {
			YYZFRA.addPassenger(p);
		}
		int n2 = YYZFRA.overBooked();
		if (n2 == 0) {
			System.out.println("Flight from Toronto to Frankfurt has space left.");
		}
		else {
			System.out.println("Flight from Toronto to Frankfurt has " + n2 + " passengers too many.");			
		}

		System.out.println("(6.1)-------------------------------");			
		if (YYZYOW.isInternational()) {
			System.out.println("Flight from Toronto to Ottawa is international.");
		}
		else {
			System.out.println("Flight from Toronto to Ottawa is domestic.");
		}

		System.out.println("(6.2)-------------------------------");
		if (YYZFRA.isInternational()) {
			System.out.println("Flight from Toronto to Frankfurt is international.");
		}
		else {
			System.out.println("Flight from Toronto to Frankfurt is domestic.");
		}
		

		System.out.println("(7)-------------------------------");	
		System.out.println("Passengers on flight from Toronto to Frankfurt without passport:");
		ArrayList<Passenger> noPassportsList =  YYZFRA.noPassports();
		for (Passenger p : noPassportsList) {
			System.out.println(p.name);
		}
		
		System.out.println("(8)-------------------------------");			
		HKGYVR.addPassenger(passengers[0]);
				
		System.out.println(passengers[0].name + " has " + passengers[0].calculatePoints() + " frequent flyer points.");
		
		
	*/
	}

}
