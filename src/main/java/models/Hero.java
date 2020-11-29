package models;
import java.util.ArrayList;


public class Hero {
    private String name;
    private int age;
    private String specialPower;
    private Sring weakness;
    private static ArrayList<Hero> instances = new ArrayList<>();
    private int id;
    private int squadID;

    public Hero(String name, int age,String specialPower,String weakness, int squadID){
        this.age=age;
        this.name=name;
        this.specialPower=specialPower;
        this.weakness=weakness;
        instances.add(this);
        this.squadID=squadID;
        addHeroToSquad(squadID);
        this.id = instances.size();

    }
    public void addHeroToSquad(int squadID){
        for(Squad squad:Squad.getAll()){
            if(squad.getId() == squadID){
                squad.addMember(this);
                break;

            }
        }
    }
}
