//Caua Da Fonseca  RA:2417685

public class MsgErro extends RuntimeException {

	private static final long serialVersionUID = 1L;

	public MsgErro(String msg) {
		super(msg);
	}

	public MsgErro(String msg, Throwable causa) {
		super(msg, causa);
	}

}
