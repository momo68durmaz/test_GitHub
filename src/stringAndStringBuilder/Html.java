package stringAndStringBuilder;

public class Html {
	
	
    // Methode zum Erstellen eines HTML-Elements
    public static String htmlElement(String tag, String body) {
        if (tag == null || tag.isEmpty()) {
            return body; // Keine Start-End-Tags, nur Body zurückgeben
        }
        if (body == null) {
            body = ""; // Null Body als leerer String behandeln
        }
        return "<" + tag + ">" + body + "</" + tag + ">"; // Start- und End-Tag um den Body
    }

    // Methode zum Hervorheben von Text mit <strong>
    public static String strong(String str) {
        return htmlElement("strong", str);
    }

    // Methode zum Betonen von Text mit <em>
    public static String emphasized(String str) {
        return htmlElement("em", str);
    }

    // Testmethode
    public static void main(String[] args) {
        // Einige Beispiele zur Überprüfung der Implementierung
        System.out.println(htmlElement("strong","strong is bold "));
        System.out.println(strong(emphasized("strong + emphasized")));
        System.out.println(htmlElement("span", null));
        System.out.println(htmlElement("","no"));
        System.out.println(htmlElement(null,"not strong"));
        System.out.println(htmlElement(null, null));





    }

}
