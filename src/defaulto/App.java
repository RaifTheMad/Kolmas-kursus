package defaulto;

public class App {

	public static void main(String[] args) {
		App ap = new App();

		System.out.println(ap.firstCapital("Tänav"));
		System.out.println(ap.moreUpperCase("AURUALlveelaev"));
		System.out.println(ap.getStringRepresentation(10));
		System.out.println(ap.stringEqualsInt("kaheksa", 8));

		String jsonString = "{ \"firstName\": \"dsad\", \"lastName\": \"Smith\", \"age\": 25, \"address\": \"Puiestee\" }";

		System.out.println(jsonString);
		System.out.println(ap.tempName(
				"{ \"firstName\": \"dsad\", \"lastName\": \"Smith\", \"age\": 25, \"address\": \"Puiestee\" }", "age"));
	}

	public boolean firstCapital(String str) {
		return Character.isUpperCase(str.charAt(0));
	}

	public boolean moreUpperCase(String str) {
		int count = 0;

		for (int i = 0; i < str.length(); i++) {
			if (Character.isUpperCase(str.charAt(i))) {
				count++;
			} else {
				count--;
			}
		}
		return count > 0;
	}

	public String getStringRepresentation(int num) {
		String stringnum[] = { "null", "üks", "kaks", "kolm", "neli", "viis", "kuus", "seitse", "kaheksa", "üheksa",
				"kümme" };
		String str = "";

		if (num < 11) {
			str = (stringnum[num]);
		} else
			str = "liiga suur number, anna alla 11";

		return str;

	}

	public boolean stringEqualsInt(String strVal, int num) {
		String numStringVal = getStringRepresentation(num);
		return numStringVal.equals(strVal);
	}

	private String tempName(String json, String parameter) {
		String value = "";
		String temp = "";
		for (int i = 0; i < json.length() - parameter.length(); i++) {
			String substring = json.substring(i, i + parameter.length());
			if (substring.equalsIgnoreCase(parameter)) {
				temp = json.substring(i + parameter.length());

				int firstIndexOf = temp.indexOf(':') + 2;
				int secondIndexOf = temp.indexOf(',');
				value = temp.substring(firstIndexOf, secondIndexOf);

			}

		}
		if (value.equals("")) {
			throw new IllegalArgumentException("pole sellist kategooriat");
		}

		return value;
	}
}
