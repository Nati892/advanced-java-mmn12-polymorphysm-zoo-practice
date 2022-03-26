
public class Owner {
	private String _name;
	private String phone_number;

	public Owner(String _name, String phone_number) {
		super();
		this._name = _name;
		this.phone_number = phone_number;
	}

	public String get_name() {
		return _name;
	}

	public void set_name(String _name) {
		this._name = _name;
	}

	public String getPhone_number() {
		return phone_number;
	}

	public void setPhone_number(String phone_number) {
		this.phone_number = phone_number;
	}

	@Override
	public String toString() {
		return "name: "+this._name+", phone number: "+this.phone_number;
		
	}

}
