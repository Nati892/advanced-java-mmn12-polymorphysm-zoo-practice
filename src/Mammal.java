
public abstract class Mammal extends Animal {

	public Mammal(String name, int age, String color) {
		super(name, age, color);
	}

	abstract public void roar();

	abstract public void walk();

	@Override
	public String toString() {
		return super.toString();
	}

}
