import java.util.ArrayList;

public class UserInput {
	static ArrayList<String> obj = new ArrayList<String>();

	public static class TextInput {
		public void add(char c) {
			String val = String.valueOf(c);
			// System.out.println(c);
			obj.add(val);

		}

		public void getValue() {
			System.out.println(obj);

		}
	}

	public static class NumericInput extends TextInput {
		public void ignore() {
			// getValue();
			for (int i = 0; i < obj.size(); i++) {
				if (obj.contains("a")) {
					obj.set(obj.indexOf("a"), "");
				}
				System.out.print(obj.get(i));
			}

		}

	}

	public static void main(String[] args) {

		NumericInput input = new NumericInput();
		input.add('1');
		input.add('a');
		input.add('0');
		input.ignore();

	}

}
