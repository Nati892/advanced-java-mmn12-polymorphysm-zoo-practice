
public class Snake extends Reptile {
	public Snake(String name, int age, String color) {
		super(name, age, color);
	}

	@Override
	public void eat() {
		System.out.println("The snake: " +this.get_name() + " is eating well a small mouse");
	}
	
	@Override
	public void sleep() {
		System.out.println("The snake: " +this.get_name() + " is asleep in the bushes");
	}

	@Override
	public void hiss() {
		// TODO Auto-generated method stub
		System.out.println("The snake: " +this.get_name() + ": hisssssssss");
	}

	@Override
	public void crawl() {
		// TODO Auto-generated method stub
		System.out.println("The snake: " +this.get_name() + " is crawling but really fast!!");
	}

	@Override
	public Object clone() throws CloneNotSupportedException {
		return new Snake(this._name, this._age, this._color);
	}

	@Override
	public boolean equals(Object obj) {
		if (this.equals(obj)) {
			if (obj instanceof Snake) {
				return true;
			}
		}
		return false;
	}

	@Override
	public String toString() {
		String returnedString = "Snake: ";
		returnedString += super.toString();
		return returnedString;
	}
}
