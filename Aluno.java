public class Aluno extends Pessoa {

//	Caua da Fonseca RA:2417685

	private int ra;
	private int anomatricula;
	private String curso;

//	sobrecarga
	public Aluno() {

	}

	public Aluno(int ra, int anomatricula, String curso) {
		this.ra = ra;
		this.anomatricula = anomatricula;
		this.curso = curso;
	}

//	sobrecarga
	public Aluno(int ra, int anomatricula) {
		this.ra = ra;
		this.anomatricula = anomatricula;
	}

	public int getRa() {
		return ra;
	}

	public void setRa(int ra) {
		this.ra = ra;
	}

	public int getAnomatricula() {
		return anomatricula;
	}

	public void setAnomatricula(int anomatricula) {
		this.anomatricula = anomatricula;
	}

	public String getCurso() {
		return curso;
	}

	public void setCurso(String curso) {
		this.curso = curso;
	}

	@Override
	public String toString() {
		return "Aluno:\nra: " + ra + "\nano de matricula: " + anomatricula + "\ncurso: " + curso + "\nId: " + getId()
				+ "\nNome: " + getNome() + "\nIdade: " + getIdade() + "\nCpf: " + getCpf();
	}

}
