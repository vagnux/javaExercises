package sql;

public class DbException extends RuntimeException {
	private static final long serialVertionUID = 1L;
	public DbException(String msg) {
		super(msg);
	}
}
