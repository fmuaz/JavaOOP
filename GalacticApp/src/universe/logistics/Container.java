package universe.logistics;

import java.util.ArrayList;
import java.util.List;

import universe.core.CargoItem;
import universe.exceptions.FragileItemBrokenException;
import universe.exceptions.HazardousMaterialException;

public class Container<T extends CargoItem> {
	private List<T> items = new ArrayList<>();
	private int currentWeight = 0;

	public void load(T item) throws HazardousMaterialException, FragileItemBrokenException {
		if (item.getWeight() > 1000) {
			throw new HazardousMaterialException("Toplam ağırlık 1000 kg'ımı geçti");
		}

		if (item.isFragile() && Math.random() < 0.1) {
			throw new FragileItemBrokenException(item.getId() + " yüklenirken kırıldı!");
		}
		items.add(item);
		currentWeight += item.getWeight();
		System.out.println(item.getId() + " başarıyla yüklendi.");
	}

	public List<T> getItems() {
		return items;
	}

}
