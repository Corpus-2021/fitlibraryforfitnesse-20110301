package fit.decorator;

import fit.Fixture;
import fit.Parse;
import fit.decorator.exceptions.InvalidInputException;
import fit.decorator.util.Delta;
import fit.decorator.util.Table;

public class IncrementColumnsValue extends FixtureDecorator {

	public static final String COLUMN_NAME = "columnName";
	public static final String DELTA = "delta";
	private String columnName;
	private Delta delta;

	@Override
	protected void setupDecorator(String[] arguments)
			throws InvalidInputException {
		if (arguments.length != 3) {
			throw new InvalidInputException(
					"Column name, Data type and Delta Value must be specified");
		}
		columnName = arguments[0];
		delta = new Delta(arguments[1], arguments[2]);
		summary.put(COLUMN_NAME, columnName);
		summary.put(DELTA, delta);
	}

	@Override
	protected void run(Fixture fixture, Parse tableInitial) {
		Parse table = tableInitial;
		Table t = new Table(table);
		try {
			table = t.incrementColumnValuesByDelta(columnName, delta);
		} catch (InvalidInputException e) {
			// exception(table, e);
		}
		super.run(fixture, table);
	}

	@Override
	protected void updateColumnsBasedOnResults(Parse table) {
		// nothing to do
	}
}
