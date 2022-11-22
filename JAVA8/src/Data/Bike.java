package Data;

public class Bike {

	private String name;
	private String model;

	public Bike(String name2, String model2) {
		// TODO Auto-generated constructor stub

		this.name = name2;
		this.model = model2;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getModel() {
		return model;
	}

	public void setModel(String model) {
		this.model = model;
	}

	@Override
	public String toString() {
		return "Bike{" + "name='" + name + '\'' + ", model='" + model + '\'' + '}';
	}
}
