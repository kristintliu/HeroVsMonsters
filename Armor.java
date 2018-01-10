public class Armor{
    public Armor(Monster monster){
        int currAtt;
        currAtt = monster.getMonsterAttack();
        currAtt = currAtt/3;
        monster.setMonsterAttack(currAtt);
    }
}