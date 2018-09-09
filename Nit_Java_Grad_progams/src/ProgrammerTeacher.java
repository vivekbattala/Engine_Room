import java.util.*;

class Programmer {
	static ArrayList<String> Languages = new ArrayList<String>();

	public void getLanguages() {
		System.out.println(Languages);

	}

	public void addLanguage(String language) {
		Languages.add(language);

	}
}

public class ProgrammerTeacher extends Programmer {
	public static void main(String[] args) {
		ProgrammerTeacher teacher = new ProgrammerTeacher();
		teacher.addLanguage("Java");
		teacher.addLanguage("C#");
		teacher.addLanguage("Phython");
		for (int i = 0; i < Languages.size(); i++) {
			System.out.print(Languages.get(i));
		}
		Programmer programmer = new Programmer();
		teacher.teach(programmer, "Java");

	}

	public boolean teach(Programmer programmer, String Language) {

		return true;

	}
}
