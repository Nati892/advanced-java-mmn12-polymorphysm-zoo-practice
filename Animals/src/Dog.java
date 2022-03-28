
public class Dog extends Mammal {
    private Owner _owner;

    public Dog(String name, int age, String color) {
        super(name, age, color);
        this._owner = null;
    }

    public Dog(String name, int age, String color, String owner_name, String phone_number) {
        super(name, age, color);
        this._owner = new Owner(owner_name, phone_number);
    }

    public void setOwner(Owner owner) {
        this._owner = owner;
    }

    public Owner getOwner() {
        return this._owner;

    }

    @Override
    public void eat() {
        System.out.println("The dog: " + this.get_name() + " is eating dog food!");
    }

    @Override
    public void sleep() {
        System.out.println("The dog: " + this.get_name() + " is asleep");
    }

    @Override
    public void roar() {
        // TODO Auto-generated method stub
        System.out.println("The dog: " + this.get_name() + ":\"woof woof!\" ");
    }

    @Override
    public void walk() {
        // TODO Auto-generated method stub
        System.out.println(
                "The dog: " + this.get_name() + " is walking around with his tounge dangling out of its mouth");
    }

    @Override
    public Object clone() {
        Dog returned_dog;
        if (this._owner == null) {
            returned_dog = new Dog(this._name, this._age, this._color);
        } else {
            returned_dog = new Dog(this._name, this._age, this._color, getOwner().get_name(),
                    this._owner.getPhone_number());
        }
        return returned_dog;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj instanceof Dog) {
            if (((Animal) obj).get_age() == this._age && ((Animal) obj).get_color().equals(this._color)
                    && ((Animal) obj).get_name().equals(this._name)) {//check attributes equality
                if (((Dog) obj)._owner != null && this._owner != null) {//check owners equality
                    if (((Dog) obj)._owner.equals(this._owner)) {
                        return true;
                    } else {
                        if (this._owner == null && ((Dog) obj).getOwner() == null)
                            return true;
                    }
                }
            }
        }
        return false;
    }

    @Override
    public String toString() {
        String returnedString = "Dog: ";
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
