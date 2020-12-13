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
        String levelAlignFormat = "%-18s | %-37s %-51s    | %-8s %n";
        System.out.format("                     ------   |                                                                                   | ------   %n");
        for (int i = 1; i <= 7; i++) {
            System.out.format(leftAlignFormat,"", "------", "", "------");
        }
        System.out.format(levelAlignFormat,"" , "------", "Current Level: " + level, "------");
        for (int i = 1; i <= 8; i++) {
            System.out.format(leftAlignFormat,"", "------", "", "------");
        }
        System.out.format("                     ------   |___________________________________________________________________________________| ------   %n");

    }

    public static void HUD() {
        String leftAlignFormat = "%-20s %-8s | %-81s | %-8s %n";

        System.out.format("                     ------   |¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯| ------   %n");
        System.out.format("                     ------   |  PLAYER STATUS                                                      ENEMY STATUS  | ------   %n");
        System.out.format("                     ------   |  HP:                                                                HP:           | ------   %n");
        System.out.format("                     ------   |  MP:                                                                              | ------   %n");
        System.out.format("                     ------   |                                                                                   | ------   %n");
        System.out.format("                     ------   |___________________________________________________________________________________| ------   %n");
    }



}
