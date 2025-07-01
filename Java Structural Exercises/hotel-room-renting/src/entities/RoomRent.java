package entities;

public class RoomRent {
	public String name;
	public String email;
	
	public RoomRent(String name, String email) {
		super();
		this.name = name;
		this.email = email;
	}

	@Override
	public String toString() {
		return name + ", " + email ;
	}
	
}
