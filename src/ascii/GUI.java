package ascii;

public class GUI {

    public int pHP;
    public int pMP;
    public int mHP;




    public static void displayScreen() {

        String leftAlignFormat = "%-20s %-8s | %-81s | %-8s %n";
        System.out.format("                     ------   |¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯| ------   %n");
        System.out.format("                     ------   |                                                                                   | ------   %n");
    }

    public static void blankScreen(int num, String level) {
        String leftAlignFormat = "%-20s %-8s | %-81s | %-8s %n";
        String levelAlignFormat = "%-19s  %-35s  %-53s   | %-9s %n";
        System.out.format("                     ------   |                                                                                   | ------   %n");
        for (int i = 1; i <= 7; i++) {
            System.out.format(leftAlignFormat,"", "------", "", "------");
        }
        System.out.format(levelAlignFormat, "" , "------   |", "Current Level: " + level, "------");
        for (int i = 1; i <= 8; i++) {
            System.out.format(leftAlignFormat,"", "------", "", "------");
        }
        System.out.format("                     ------   |___________________________________________________________________________________| ------   %n");

    }

    public static void HUD(int playerHP, int playerMP, int enemyHP) {
//        String leftAlignFormat = "%-20s %-8s | %-81s | %-8s %n";
        System.out.format("                     ------   |¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯| ------   %n");
        System.out.format("                     ------   |  PLAYER STATUS                                                      ENEMY STATUS  | ------   %n");
        System.out.format("                     ------   |  HP:  %d                                                            HP: %d      | ------   %n", playerHP, enemyHP);
        System.out.format("                     ------   |  MP:  %d                                                                          | ------   %n", playerMP);
        System.out.format("                     ------   |   (A)ttack   (I)nventory   (D)efend   (R)un                                       | ------   %n");
        System.out.format("                     ------   |___________________________________________________________________________________| ------   %n");
    }

    public static void HUD(String command) {
//        String leftAlignFormat = "%-20s %-8s | %-81s | %-8s %n";
        System.out.format("                     ------   |¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯| ------   %n");
        System.out.format("                     ------   |  %d (P)otions                                                      ENEMY STATUS  | ------   %n");
        System.out.format("                     ------   |  %d (B)uff                                                           HP: %d      | ------   %n");
        System.out.format("                     ------   |  %d                                                                        | ------   %n");
        System.out.format("                     ------   |   (A)ttack   (I)nventory   (D)efend   (R)un                                       | ------   %n");
        System.out.format("                     ------   |___________________________________________________________________________________| ------   %n");
    }



}
