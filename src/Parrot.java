
public class Parrot extends Bird {
    private Owner _owner;

    public Parrot(String name, int age, String color) {
        super(name, age, color);
        this._owner = null;
    }

    public Parrot(String name, int age, String color, String owner_name, String owner_phone_num) {
        super(name, age, color);
        this._owner = new Owner(owner_name, owner_phone_num);
    }

    public void setOwner(Owner owner) {
        this._owner = owner;
    }

    public Owner getOwner() {
        return this._owner;

    }

    @Override
    public void eat() {
        System.out.println("The parrot: " + this.get_name() + " is eating sunflower seeds");
    }

    @Override
    public void sleep() {
        System.out.println("The parrot: " + this.get_name() + " is asleep on my shoulder");
    }

    @Override
    public void tweet() {
        // TODO Auto-generated method stub
        System.out.println("The parrot: " + this.get_name() + " Just repeated after you");
    }

    @Override
    public void fly() {
        // TODO Auto-generated method stub
        System.out.println("The parrot: " + this.get_name() + " flying around and being all beautiful");
    }

    @Override
    public Object clone() {
        Parrot returned_parrot;
        if (this._owner == null) {
            returned_parrot = new Parrot(this._name, this._age, this._color);
        } else {
            returned_parrot = new Parrot(this._name, this._age, this._color, getOwner().get_name(),
                    this._owner.getPhone_number());
        }

        return returned_parrot;

    }

    @Override
    public boolean equals(Object obj) {
        if (obj instanceof Cat) {
            if (((Animal) obj).get_age() == this._age && ((Animal) obj).get_color().equals(this._color)
                    && ((Animal) obj).get_name().equals(this._name)) {//check attributes equality
                if (((Parrot) obj)._owner != null && this._owner != null) {//check owners equality
                    if (((Parrot) obj)._owner.equals(this._owner)) {
                        return true;
                    } else {
                        if (this._owner == null && ((Parrot) obj).getOwner() == null)
                            return true;
                    }
                }
            }
        }
        return false;
    }

    @Override
    public String toString() {
        String returnedString = "Parrot: ";
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
