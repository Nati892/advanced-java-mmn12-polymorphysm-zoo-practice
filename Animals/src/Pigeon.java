
public class Pigeon extends Bird {
	public Pigeon(String name, int age, String color) {
		super(name, age, color);
	}

	@Override
	public void eat() {
		System.out.println("The pigeon: " +this.get_name() + " is eating worms");
	}

	@Override
	public void sleep() {
		System.out.println("The pigeon: " +this.get_name() + " is asleep on a tree");
	}

	@Override
	public void tweet() {
		// TODO Auto-generated method stub
		System.out.println("The pigeon: " +this.get_name() + " brr brr");
	}

	@Override
	public void fly() {
		// TODO Auto-generated method stub
		System.out.println("The pigeon: " +this.get_name() + " flying around and bombing innocent pedestrians");
	}

	@Override
	public Object clone() throws CloneNotSupportedException {
		return new Pigeon(this._name, this._age, this._color);
	}

	
	@Override
	public boolean equals(Object obj) {
		if (this.equals(obj)) {
			if (obj instanceof Pigeon) {
				return true;
			}

		}
		return false;
	}

	@Override
	public String toString() {
		String returnedString = "Pigeon: ";
		returnedString += super.toString();
		return returnedString;
	}
}
