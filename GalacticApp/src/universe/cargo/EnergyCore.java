package universe.cargo;

import universe.core.CargoItem;

public class EnergyCore extends CargoItem {
	private int radiationLevel;

	public EnergyCore(String id, double weight, boolean isFragile, int radiationLevel) {
		super(id, weight, isFragile);
		this.radiationLevel = radiationLevel;
	}

	@Override
	public double calculateRiskScore() {
		// TODO Auto-generated method stub
		return weight * radiationLevel;
	}

	public void increaseRadiation() {
		this.radiationLevel++;
	}

}
