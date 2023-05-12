
public class Professor extends Pessoa {

//	Caua da Fonseca RA:2417685

	private double salario;
	private Boolean status;
	private String materia;

	public Professor() {

	}

	public Professor(double salario, Boolean status, String materia) {
		super();
		this.salario = salario;
		this.status = status;
		this.materia = materia;
	}

	public double getSalario() {
		return salario;
	}

	public void setSalario(double salario) {
		this.salario = salario;
	}

	public Boolean getStatus() {
		return status;
	}

	public void setStatus(Boolean status) {
		this.status = status;
	}

	public String getMateria() {
		return materia;
	}

	public void setMateria(String materia) {
		this.materia = materia;
	}

	@Override
	public String toString() {
		return "Professor\nsalario: " + salario + "\nstatus: " + status + "\nmateria: " + materia + "\nNome: "
				+ getNome() + "\nIdade: " + getIdade() + "\nCpf: " + getCpf() + ".";
	}

}
