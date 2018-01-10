import java.io.*;
import java.util.*;

public class Hero{
    private ArrayList<Weapon> weapons = new ArrayList<Weapon>();
    private String name;
    private int xPos;
    private int yPos;
    private int health;
    private Weapon weapon;
    private Armor armor;
    private int numPotions;
    
    public Hero(String name){
        this.name = name;
        xPos = 0;
        yPos = 9;
        health = 100;
        weapon = new Weapon(0);
        numPotions = 0;
    }
    
    public int getNumPotions(){
        return numPotions;
    }
    
    public int setNumPotions(int addPotion){
        numPotions += addPotion;
        return numPotions;
    }
    
    public String getName(){
        return name;
    }
    
    public int getX(){
        return xPos;
    }
    
    public int getY(){
        return yPos;
    }
    
    public Weapon setWeapon(int newWeapon){
        weapon = new Weapon(newWeapon);
        return weapon;
    }
    
    public Weapon getWeapon(){
        return weapon;
    }
    
    public int getHealth(){
        return health;
    }
    
    public int setHealth(int newHealth){
        health = newHealth;
        return health;
    }
}
