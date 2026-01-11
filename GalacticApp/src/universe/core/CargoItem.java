package universe.core;

public abstract class CargoItem {
	protected String id; //
	protected double weight;
	protected boolean isFragile;

	protected CargoItem(String id, double weight, boolean isFragile) {
		this.id = id;
		this.weight = weight;
		this.isFragile = isFragile;
	}

	public abstract double calculateRiskScore();

	public String getId() {
		return id;
	}

	public double getWeight() {
		return weight;
	}

	public boolean isFragile() {
		return isFragile;
	}
}
