package station.main;

import station.core.PostDoc;
import station.core.Professor;
import station.exceptions.IncompatibleMemberException;
import station.management.ResearchLab;

public class SpaceStationApp {

	public static void main(String[] args) throws IncompatibleMemberException {
		Professor professor = new Professor("Dr.Raşit", 21, true, "Kalp Cerrahı");
		PostDoc postDoc = new PostDoc("Araştırmacı Bilal ", 21, true);

		ResearchLab<Professor> profLab = new ResearchLab<>();
		ResearchLab<PostDoc> postdocLab = new ResearchLab<>();

		profLab.addMember(professor);
		postdocLab.addMember(postDoc);

		try {
			System.out.println("\n---------Başvuru Testi----------\n");
			professor.applyForGrant(60000);
		} catch (Exception e) {
			System.err.println("Hata Yakalandı: " + e.getMessage());
			// Sadece e.getMessage() dersen ekranda hiçbir şey göremem
		} finally {
			System.out.println("\n--- Proje Başlatılıyor ---");
			profLab.startProject();
			postdocLab.startProject();
		}

	}

}
