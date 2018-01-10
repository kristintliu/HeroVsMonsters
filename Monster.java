public class Monster{
    private int monsterHealth;
    private int monsterSpeed;
    private int monsterAttack;
    
    public Monster(){
        monsterHealth = 100;
        monsterSpeed = (int)(Math.random() * 4);
        monsterAttack = (int)(Math.random() * 11 + 10);
    }
    
    public int getMonsterSpeed(){
        return monsterSpeed;
    }
    
    public int getMonsterHealth(){
        return monsterHealth;
    }
    
    public int setMonsterAttack(int newAttack){
        monsterAttack = newAttack;
        return newAttack;
    }
    
    public int setMonsterHealth(int newHealth){
        monsterHealth = newHealth;
        return newHealth;
    }
    
    public int getMonsterAttack(){
        return monsterAttack;
    }
}
