import ascii.*;

import java.util.ArrayList;
import java.util.Scanner;


public class Game {

    public static void startScreen() throws InterruptedException {
        Scanner sc = new Scanner(System.in);
        System.out.printf("Oh, chosen one.\n");
//        Thread.sleep(2000);
//        System.out.printf("This land has waited countless ages until a hero would appear...\n");
//        Thread.sleep(2000);
//        System.out.printf("What is your name, hero?\n");
//        String userInput = sc.nextLine();
//        System.out.printf("'%s', you say?\n", userInput);
//        Thread.sleep(2000);
//        System.out.printf("Yes... you shall be our hero.\n");
//        Thread.sleep(2000);
//        System.out.println("Now go! Your adventure now begins!");
//        Thread.sleep(4000);
    }

    public static void pressAnyKeyToContinue()
    {
        System.out.println("Press Enter key to continue...");
        try
        {
            System.in.read();
        }
        catch(Exception e)
        {}
        space();
    }

    public static void space(){
        System.out.println(" ");
        System.out.println(" ");
        System.out.println(" ");
        System.out.println(" ");
        System.out.println(" ");
        System.out.println(" ");
        System.out.println(" ");
        System.out.println(" ");
        System.out.println(" ");
        System.out.println(" ");
        System.out.println(" ");
        System.out.println(" ");
        System.out.println(" ");
        System.out.println(" ");
        System.out.println(" ");
        System.out.println(" ");
        System.out.println(" ");
        System.out.println(" ");
        System.out.println(" ");
        System.out.println(" ");
        System.out.println(" ");
        System.out.println(" ");
        System.out.println(" ");
        System.out.println(" ");
        System.out.println(" ");
        System.out.println(" ");
        System.out.println(" ");
    }

    public static void main(String[] args) throws InterruptedException {
        Scanner sc = new Scanner(System.in);

        startScreen();
        GUI.displayScreen();
        GUI.blankScreen(5, "Spooky Dungeon");
        pressAnyKeyToContinue();
//        Dungeon level = new Dungeon();
//        pressAnyKeyToContinue();
        GUI.displayScreen();
        Enemies enemy1 = new Enemies(1);
        GUI.HUD(10, 10, 5000);
        ArrayList<Object> enemyList = new ArrayList<>();
        enemyList.add(enemy1);
        pressAnyKeyToContinue();
        GUI.displayScreen();
        Enemies enemy2 = new Enemies(1);
        GUI.HUD(20, 20, 4950);

    }
}
