package stringAndStringBuilder;

public class CamelCase {

	public static String camelCaseSplitter(String str) {
	 	StringBuilder sb = new StringBuilder();
	 	for (int i = 0; i < str.length(); i++) {
	 		char c = str.charAt(i);
	 		if ( i > 0 && Character.isUpperCase(c) && !Character.isUpperCase(str.charAt(i - 1))) {
	 			sb.append(' ');
	 		}
	 		sb.append(c);
	 	}
	 	return sb.toString();
	}

	public static void main(String[] args) {
		System.out.println(camelCaseSplitter("numberOfElement"));
		System.out.println(camelCaseSplitter("DieseAufgabeIstErledigt"));
		System.out.println(camelCaseSplitter("HALLO"));
		System.out.println(camelCaseSplitter("IchWillNachHauseeeeeeeeee"));
	}
}
