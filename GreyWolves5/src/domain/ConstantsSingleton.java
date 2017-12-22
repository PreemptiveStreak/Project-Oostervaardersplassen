package domain;

public class ConstantsSingleton {
	private static ConstantsSingleton singleton;
	private int numberOfYears = 10;
	
	private ConstantsSingleton() {
		
	}
	
	public static ConstantsSingleton instance() {
		if (singleton == null) {
			singleton = new ConstantsSingleton();
		}
		return singleton;
	}

	public int getNumberOfYears() {
		return numberOfYears;
	}

	public void setNumberOfYears(int numberOfYears) {
		this.numberOfYears = numberOfYears;
	}
}
