package exercicios.exProp.set.entities;

public class Students {

	private int cod;
	private String name;

	public Students(int cod) {
		this.cod = cod;
	}

	public Students(int cod, String name) {
		this.cod = cod;
		this.name = name;
	}

	public int getCod() {
		return cod;
	}

	public void setCod(int cod) {
		this.cod = cod;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + cod;
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Students other = (Students) obj;
		if (cod != other.cod)
			return false;
		return true;
	}

}
