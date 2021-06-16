
public class Airplane {

	String type;
	int range;
	int seats;
	
	public Airplane(String type, int range, int seats) {
		type = this.type;
		range = this.range;
		seats = this.seats;
	}
	
	public String getType() {
		return this.type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public int getRange() {
		return this.range;
	}

	public void setRange(int range) {
		this.range = range;
	}

	public int getSeats() {
		return this.seats;
	}

	public void setSeats(int seats) {
		this.seats = seats;
	}

}
