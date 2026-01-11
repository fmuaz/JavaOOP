package station.core;

public abstract class AcademicMember {
	protected String name;
	protected int experiencePoints;
	protected boolean isActive;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getExperiencePoints() {
		return experiencePoints;
	}

	public void setExperiencePoints(int experiencePoints) {
		this.experiencePoints = experiencePoints;
	}

	public boolean isActive() {
		return isActive;
	}

	public void setActive(boolean isActive) {
		this.isActive = isActive;
	}

	AcademicMember(String name, int experiencePoint, boolean isActive) {
		this.name = name;
		this.experiencePoints = experiencePoint;
		this.isActive = isActive;
	}

	public abstract void conductResearch();
}
