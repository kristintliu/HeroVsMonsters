public class Weapon{
    private String name;
    private int randomDamage;
    
    public Weapon(int weapon){
        switch(weapon){
            case 1:
                name = "Broad Sword";
                randomDamage = (int)(Math.random() * 31 + 20);
                break;
            default:
                name = "Dagger";
                randomDamage = (int)(Math.random() * 21 + 10);
        }
    }
    
    public int getDamage(){
        return randomDamage;
    }
    
    public String getName(){
        return name;
    }
    
    public String toString(){
        String a = "";
        
        a = a + "Name: " + name + "\n";
        a = a + "Damage: " + randomDamage;
        return a;
    }
}