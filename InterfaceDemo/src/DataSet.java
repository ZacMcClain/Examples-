
public class DataSet {
	private double sum;
	private Measurable max;
	private int count;
	
	public void add(Measurable measurable) {
		sum += measurable.getMeasure();
		if (count == 0 || measurable.getMeasure() > max.getMeasure())
			max = measurable;
		count++;
	}
	
	public Measurable getMaximum() {
		return max;
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		BankAccount mine = new BankAccount("me", 500);
		BankAccount yours = new BankAccount("you", 800);
		DataSet data = new DataSet();
		data.add(mine);
		data.add(yours);
		System.out.println(data.getMaximum().getMeasure());
		DataSet data2 = new DataSet();
		data2.add(new Student("mickey mouse", 3.0));
		data2.add(new Student("pluto dog", 2.5));
		data2.add(new Student("goofy", 1.3));
		System.out.println(data2.getMaximum().getMeasure());
		
		System.out.println(data2.getMaximum());

	}

}
