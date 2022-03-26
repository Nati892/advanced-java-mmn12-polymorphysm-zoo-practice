
public class Cat extends Mammal {

	private Owner _owner;

	public Cat(String name, int age, String color) {
		super(name, age, color);
		this._owner = null;
	}

	public Cat(String name, int age, String color, String owner_name, String owner_phone_num) {
		super(name, age, color);
		_owner = new Owner(owner_name, owner_phone_num);
	}

	public void setOwner(Owner owner) {
		this._owner = owner;
	}

	public Owner getOwner() {
		return this._owner;

	}

	@Override
	public void eat() {
		System.out.println("The cat: " + this.get_name() + " is eating a mouse!");
	}

	@Override
	public void sleep() {
		System.out.println("The cat: " + this.get_name() + " is asleep");
	}

	@Override
	public void roar() {
		// TODO Auto-generated method stub
		System.out.println("The cat: " + this.get_name() + ":\"meow!\" ");
	}

	@Override
	public void walk() {
		// TODO Auto-generated method stub
		System.out.println("The cat: " + this.get_name() + " is walking around all fluffy and cute like a cat ");
	}

	@Override
	public boolean equals(Object obj) {
		if (this.equals(obj)) {
			if (obj instanceof Cat) {
				return true;
			}

		}
		return false;
	}

	@Override
	public Object clone() throws CloneNotSupportedException {
		Cat returned_cat;
		if (this._owner == null) {
			returned_cat = new Cat(this._name, this._age, this._color);
		} else {
			returned_cat = new Cat(this._name, this._age, this._color, getOwner().get_name(),
					this._owner.getPhone_number());
		}

		return returned_cat;

	}

	@Override
	public String toString() {
		String returnedString = "Cat: ";
		returnedString += super.toString();
		returnedString += ",owner: ";
		if (_owner == null) {
			returnedString += "none!";
		} else {
			returnedString += _owner.toString();
			;
		}
		return returnedString;
	}

}
