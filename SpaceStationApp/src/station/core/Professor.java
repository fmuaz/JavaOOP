package station.core;

import station.exceptions.GrantLimitException;

public class Professor extends AcademicMember implements Grantable {
	private String fieldOfExpertise;

	public Professor(String name, int experiencePoint, boolean isActive, String fieldOfExpertise) {
		super(name, experiencePoint, isActive);
		this.fieldOfExpertise = fieldOfExpertise;
	}

	public String getFieldOfExpertise() {
		return this.fieldOfExpertise;
	}

	public void setFieldOfExpertise(String fieldOfExpertise) {
		this.fieldOfExpertise = fieldOfExpertise;
	}

	@Override
	public void applyForGrant(int amount) throws GrantLimitException {
		if (amount > 50000) {
			throw new GrantLimitException("Bütçe sınırını aştın");
		}
		System.out.println(amount + "$ hibe onaylandı.");
	}

	@Override
	public void conductResearch() {
		System.out.println("Profesör " + name + ", " + fieldOfExpertise + " alanında derin araştırma yapıyor.");
	}

}
