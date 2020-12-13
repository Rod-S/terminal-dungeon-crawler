public class Player {

    private int attack;
    private int defense;
    private int agility;
//    private boolean turn = true;
    private String name;

    public Player(){

    }

    public Player(int a, int d, int agility, String name){
        this.attack = a;
        this.defense = d;
        this.agility = agility;
        this.name = name;
    }

    public int getAttack(){
        return this.attack;
    }

    public int getDefense(){
        return this.defense;
    }

    public double dodgeChance(){
        return this.agility * .25;
    }

//    public void setAttack(int attack){
//        this.attack = attack;
//    }

//    public boolean cycleTurn(){
//        return !this.turn;
//    }

}
