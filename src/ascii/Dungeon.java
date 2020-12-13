package ascii;

import java.util.ArrayList;

public class Dungeon {

    public Dungeon(){
        traverse();
    }


//    ArrayList<Object> dungeonMap = new ArrayList<>();
//    dungeonMap.add()
//    dungeon[0] = traverse();
//
//    dungeon[count]
//    if(e.key == w){
//        count++;
//    }

    public void traverse(){
        System.out.println("     \\                                         /      ");
        System.out.println("      \\                                       /     / ");
        System.out.println("       \\                                     /    /  ");
        System.out.println("        \\                                   /   /   ");
        System.out.println("         \\_________________________________/  /    ");
        System.out.println("          ||                               ||      ");
        System.out.println("          ||                               ||      ");
        System.out.println("      (I) ||                               || - - -   ");
        System.out.println("          ||                               ||      ");
        System.out.println("          ||_______________________________||\\     ");
        System.out.println("         /                                  \\ \\     ");
        System.out.println("        /                                    \\ \\  ");
        System.out.println("       /                                      \\ \\   ");
        System.out.println("      /                                        \\ ");
        System.out.println("     /                                          \\  ");
    }

}
