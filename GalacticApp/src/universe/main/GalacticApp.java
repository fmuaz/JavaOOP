package universe.main;

import universe.cargo.BiologicalSpecimen;
import universe.cargo.EnergyCore;
import universe.core.CargoItem;
import universe.exceptions.CargoException;
import universe.logistics.Container;
import universe.logistics.LogisticsManager;

public class GalacticApp {

	public static void main(String[] args) {

		EnergyCore core = new EnergyCore("CORE-01", 600, false, 10);
		BiologicalSpecimen specimen = new BiologicalSpecimen("BIO-99", 100, true, 4);

		Container<EnergyCore> source = new Container<>();
		Container<CargoItem> destination = new Container<>();

		try {
			source.load(core);
			System.out.println("Kaynak konteyner hazır.");
			LogisticsManager.transferCargo(source, destination);

		} catch (CargoException e) {
			System.err.println("SİSTEM HATASI: " + e.getMessage());
		} finally {
			System.out.println("Lojistik operasyonu sonlandı.");
		}

	}

}
