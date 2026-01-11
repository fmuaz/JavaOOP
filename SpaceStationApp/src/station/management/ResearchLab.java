package station.management;

import java.util.ArrayList;
import java.util.List;

import station.core.AcademicMember;
import station.exceptions.IncompatibleMemberException;

public class ResearchLab<T extends AcademicMember> {
	private List<T> members = new ArrayList<>();
	// new ArrayList<>(); --> eğer bu kısmı eklemeden tanımlasaydım Java bellekte
	// sadece "burada bir liste olacak" diye bir işaretçi oluşturur ve varsayılan
	// olarak buna null değerini atar. Sen addMember metodu içinde
	// members.add(member) dediğinde, Java aslında şunu yapmaya çalışıyor:
	// null.add(member). Boşluğa bir şey ekleyemediği için de "NullPointerException"
	// fırlatıyor hatası alırım

	public List<T> getMembers() {
		return members;
	}

	public void setMembers(List<T> members) {
		this.members = members;
	}

	public void addMember(T member) throws IncompatibleMemberException {
		if (member.getExperiencePoints() < 10) {
			throw new IncompatibleMemberException("Eklenen üyenin tecrübe puanı 10'dan az olduğu için ekleyemezsin");
		}
		members.add(member);
		System.out.println("Üye başarıyla eklendi ");
	}

	public void startProject() {
		for (T member : members) {
			member.conductResearch();
		}
	}

}
