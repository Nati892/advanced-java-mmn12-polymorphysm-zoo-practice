
public abstract class Bird extends Animal {

	public Bird(String name, int age, String color) {
		super(name, age, color);
	}

	abstract public void tweet();

	abstract public void fly();

}
