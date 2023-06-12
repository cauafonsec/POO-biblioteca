//Caua Da Fonseca  RA:2417685

public class Funcionario extends Pessoa {

	private int registro;
	private String cargo;
	private String area;

	public Funcionario() {

	}

	public Funcionario(int registro, String cargo, String area) {
		super();
		this.registro = registro;
		this.cargo = cargo;
		this.area = area;
	}

	public int getRegistro() {
		return registro;
	}

	public void setRegistro(int registro) {
		this.registro = registro;
	}

	public String getCargo() {
		return cargo;
	}

	public void setCargo(String cargo) {
		this.cargo = cargo;
	}

	public String getArea() {
		return area;
	}

	public void setArea(String area) {
		this.area = area;
	}

	@Override
	public String toString() {
		return "Funcionario\nregistro:" + registro + "\ncargo:" + cargo + "\narea:" + area + "\nNome:" + getNome()
				+ "\nIdade:" + getIdade() + "\nCpf:" + getCpf();
	}

}
