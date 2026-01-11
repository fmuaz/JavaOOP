package universe.logistics;

import java.util.ArrayList;
import java.util.List;

import universe.core.CargoItem;

public class LogisticsManager {
	// Producer (Üretici/Kaynak): Eğer bir jenerik yapıdan (liste, konteyner vb.)
	// veri okuyorsan, o bir üreticidir. Burada <? extends > kullanılır
	// LOWER BOUND (? super): Veriyi YAZMAK/EKLEMEK için (destination)
	public static void transferCargo(Container<? extends CargoItem> source, Container<? super CargoItem> destination) {
		for (CargoItem item : source.getItems()) {
			try {
				destination.load(item); // source'dan okuyoruz, destination'a yazıyoruz
			} catch (Exception e) {
				System.err.println("Transfer sırasında hata: " + e.getMessage());
			}
		}
	}

	public static List<CargoItem> filterHighRisk(List<? extends CargoItem> list, double threshold) {
		List<CargoItem> highRiskItems = new ArrayList<>();
		for (CargoItem item : list) {
			if (item.calculateRiskScore() > threshold) {
				highRiskItems.add(item);
			}
		}
		return highRiskItems;
	}
}
