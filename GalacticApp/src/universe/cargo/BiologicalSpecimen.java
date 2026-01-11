package universe.cargo;

import universe.core.CargoItem;

public class BiologicalSpecimen extends CargoItem {
	private int storageTemperature;

	public BiologicalSpecimen(String id, double weight, boolean isFragile, int storageTemperature) {
		super(id, weight, isFragile);
		this.storageTemperature = storageTemperature;
	}

	@Override
	public double calculateRiskScore() {
		// TODO Auto-generated method stub
		return weight / (storageTemperature + 1);
	}

}
