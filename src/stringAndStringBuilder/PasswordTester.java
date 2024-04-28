package stringAndStringBuilder;

public class PasswordTester {

    // Methode, um zu pr�fen, ob ein Passwort gut ist
    public boolean isGoodPassword(String password) {
        StringBuilder errorMessages = new StringBuilder();

        // Pr�fung der Mindestl�nge
        if (password.length() < 8) {
            errorMessages.append("Das Passwort ist zu kurz. Es muss mindestens 8 Zeichen lang sein.\n");
        }

        // Pr�fung auf Sonderzeichen
        if (!password.matches(".*[!@#$%^&*()_+].*")) {
            errorMessages.append("Das Passwort muss mindestens ein Sonderzeichen enthalten.\n");
        }

        // �berpr�fung, ob Fehlermeldungen vorhanden sind
        if (errorMessages.length() > 0) {
            System.err.println(errorMessages.toString());
            return false;
        }

        return true;
    }

    // Hauptmethode zum Testen der Passwort-�berpr�fung
    public static void main(String[] args) {
        PasswordTester tester = new PasswordTester();
        
        // Hier k�nnen verschiedene Passw�rter getestet werden
        String testPassword = "NoahDerSchmale!";
        boolean isGood = tester.isGoodPassword(testPassword);
        
        if (isGood) {
            System.out.println("Das Passwort ist stark.");
        } else {
            System.out.println("Das Passwort ist schwach.");
        }
    }
}

