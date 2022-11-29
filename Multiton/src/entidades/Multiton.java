package entidades;

import java.util.HashMap;

public class Multiton {
	private static HashMap<MultitonType, Multiton> instances = new HashMap<MultitonType, Multiton>();

	private static Multiton instancia;

	private MultitonType type;

	public Multiton(MultitonType type) {
		this.setType(type);
	}

	public MultitonType getType() {
		return type;
	}

	public void setType(MultitonType type) {
		this.type = type;
	}

	@Override
	public String toString() {
		return "My type is " + this.type;
	}

	public static Multiton GetInstance(MultitonType type) {

		if (!instances.containsKey(type)) {
			instancia = new Multiton(type);
			instances.put(type, instancia);

		} else {
			instancia = instances.get(type);
		}

		return instancia;
	}

}
