package undirectional.unweighted;

public class Exceptions extends RuntimeException{
	
	private static final long serialVersionUID = 1L;
	private String msg;
	
	public Exceptions(String string) {
		// TODO Auto-generated constructor stub
		this.msg = string;
	}

	public void rangeDefaulterException() {
		throw new Exceptions(msg);
	}

}
