package station.core;

public class PostDoc extends AcademicMember {

	public PostDoc(String name, int experiencePoint, boolean isActive) {
		super(name, experiencePoint, isActive);
	}

	@Override
	public void conductResearch() {
		System.out.println("PostDoc " + name + "veri analizi yapıyor");

	}

}
