import java.io.*;
import java.util.*;
public class Fight{
    public Fight(Hero hero, Monster monster){
        Scanner input;
        int monstersKilled = 0;
        int probability;
        
        String answ;
        boolean loop = true;
        int hDamage;
        int mDamage;
        while(loop){
            input = new Scanner(System.in);
            
            System.out.println("\n\n\n");
            System.out.println("Monster Health: " + monster.getMonsterHealth() + "\tMonster Attack: " + monster.getMonsterAttack() + "\tMonster Speed: " + monster.getMonsterSpeed());
            System.out.println("What will the hero do?");
            System.out.println("1. Attack");
            System.out.println("2. Use Potion");
            System.out.println("3. Run Away");
            
            System.out.println("The hero has " + hero.getHealth() + " Health!");
            System.out.println("The monster has " + monster.getMonsterHealth() + " Health!");
            System.out.println("\n\n\n");
            
            answ = input.nextLine();
            if(answ.equals("1")){
                System.out.println("The hero attacked the monster!");
                
                hDamage = hero.getWeapon().getDamage();
                System.out.println("The hero damaged the monster for " + hDamage + " health!");
                monster.setMonsterHealth(monster.getMonsterHealth() - hDamage);
                if(monster.getMonsterHealth() <= 0){
                    System.out.println("The monster was slain!");
                    monstersKilled += 1;
                    if(monstersKilled == 6){
                        System.out.println("Hero has killed all monsters in the game!");
                        System.exit(0);
                    }
                    loop = false;
                    return;
                }else{
                    System.out.println("The monster attacked the hero!");
                    mDamage = (int)((Math.random() * monster.getMonsterAttack() - (monster.getMonsterAttack() - 10) + 1 + (monster.getMonsterAttack() - 10)));
                    System.out.println("The monster damaged the hero for " + mDamage + " health!");
                    hero.setHealth(hero.getHealth() - mDamage);
                    if(hero.getHealth() <= 0){
                        System.out.println("The hero died!");
                        break;
                    }
                }
            }else if(answ.equals("2")){
                if(hero.getNumPotions() == 0){
                    System.out.println("The hero does not have any potion!");
                }else{
                    hero.setHealth(100);
                    System.out.println("Full Health Energy Potion used!");
                    hero.setNumPotions(-1);
                }
            }else if(answ.equals("3")){
                probability = (int)(Math.random() * 4);
                if(monster.getMonsterSpeed() == 0){
                    if(probability == 0 || probability == 1 || probability == 2){
                        System.out.println("Hercules managed to get away!");
                        loop = false;
                    }else{
                        System.out.println("Hercules was unable to run away!");
                        System.out.println("The monster attacked the hero!");
                        mDamage = monster.getMonsterAttack();
                        System.out.println("The monster damaged the hero for " + mDamage + " health!");
                        hero.setHealth(hero.getHealth() - mDamage);
                        if(hero.getHealth() <= 0){
                            System.out.println("The hero died!");
                            break;
                        }
                    }
                }else if(monster.getMonsterSpeed() == 1){
                    if(probability == 0 || probability == 1){
                        System.out.println("Hercules managed to get away!");
                        loop = false;
                    }else{
                        System.out.println("Hercules was unable to run away!");
                        System.out.println("The monster attacked the hero!");
                        mDamage = monster.getMonsterAttack();
                        System.out.println("The monster damaged the hero for " + mDamage + " health!");
                        hero.setHealth(hero.getHealth() - mDamage);
                        if(hero.getHealth() <= 0){
                            System.out.println("The hero died!");
                            break;
                        }
                    }
                }else if(monster.getMonsterSpeed() == 2){
                    if(probability == 0){
                        System.out.println("Hercules managed to get away!");
                        loop = false;
                    }else{
                        System.out.println("Hercules was unable to run away!");
                        System.out.println("The monster attacked the hero!");
                        mDamage = monster.getMonsterAttack();
                        System.out.println("The monster damaged the hero for " + mDamage + " health!");
                        hero.setHealth(hero.getHealth() - mDamage);
                        if(hero.getHealth() <= 0){
                            System.out.println("The hero died!");
                            break;
                        }
                    }
                }else if(monster.getMonsterSpeed() == 3){
                    System.out.println("Hercules was unable to run away!");
                    System.out.println("The monster attacked the hero!");
                    mDamage = monster.getMonsterAttack();
                    System.out.println("The monster damaged the hero for " + mDamage + " health!");
                    hero.setHealth(hero.getHealth() - mDamage);
                    if(hero.getHealth() <= 0){
                        System.out.println("The hero died!");
                        break;
                    }
                }
            }else{
                System.out.println("You did not choose a valid command!!");
            }
        }
        return;
    }
}
