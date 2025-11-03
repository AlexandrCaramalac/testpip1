public class Main {
//änderung
    public static void main(String[] args) {
        System.out.println("Starte manuelle Tests für Continuous Integration...");

        boolean allTestsPassed = true;

        // Test 1: Normalfall
        if (add(2, 3) == 5) {
            System.out.println("✅ Test 1 bestanden: 2 + 3 = 5");
        } else {
            System.out.println("❌ Test 1 fehlgeschlagen: 2 + 3 != 5");
            allTestsPassed = false;
        }

        // Test 2: Negative Zahl
        if (add(2, -3) == -1) {
            System.out.println("✅ Test 2 bestanden: 2 + (-3) = -1");
        } else {
            System.out.println("❌ Test 2 fehlgeschlagen: 2 + (-3) != -1");
            allTestsPassed = false;
        }

        // Test 3: Nullwerte
        if (add(0, 0) == 0) {
            System.out.println("✅ Test 3 bestanden: 0 + 0 = 0");
        } else {
            System.out.println("❌ Test 3 fehlgeschlagen: 0 + 0 != 0");
            allTestsPassed = false;
        }

        // Test 4: Fehlerhafter Test
        if (add(7, 3) == 10) {
            System.out.println("✅ Test 4 bestanden: 7 + 3 = 73");
        } else {
            System.out.println("❌ Test 4 fehlgeschlagen: 7 + 3 != 73");
            allTestsPassed = false;
        }

        // Zusammenfassung
        if (allTestsPassed) {
            System.out.println("\n🎉 Alle Tests erfolgreich bestanden!");
        } else {
            System.out.println("\n🚨 Mindestens ein Test ist fehlgeschlagen!");
            System.exit(1); // sorgt dafür, dass die Pipeline fehlschlägt
        }
    }

    // Methode, die getestet wird
    public static int add(int a, int b) {
        return a + b;
    }
}
