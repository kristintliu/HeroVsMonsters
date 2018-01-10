import java.util.*;
import java.io.*;

public class Driver{
    public static void main(String args[]){
        Object[][] map = new Object[10][10];
        for (int i = 0; i < map.length; i++){
            for (int j = 0; j < map.length; j++){
                map[j][i] = null;
            }
        }
        System.out.println("The map has been generated");
        Hero hero = new Hero("Hero");
        int heroXPos = hero.getX();
        int heroYPos = hero.getY();
        int monstersKilled = 0;
        String direction;
        boolean game = true;
        Monster m1 = new Monster();
        Monster m2 = new Monster();
        Monster m3 = new Monster();
        Monster m4 = new Monster();
        Monster m5 = new Monster();
        Monster m6 = new Monster();
        Potions p1 = new Potions(hero);
        Potions p2 = new Potions(hero);
        Farmer f1 = new Farmer();
        Farmer f2 = new Farmer();
        int m1x = (int)(Math.random()*10);
        int m1y = (int)(Math.random()*10);
        int m2x = (int)(Math.random()*10);
        int m2y = (int)(Math.random()*10);
        int m3x = (int)(Math.random()*10);
        int m3y = (int)(Math.random()*10);
        int m4x = (int)(Math.random()*10);
        int m4y = (int)(Math.random()*10);
        int m5x = (int)(Math.random()*10);
        int m5y = (int)(Math.random()*10);
        int m6x = (int)(Math.random()*10);
        int m6y = (int)(Math.random()*10);
        int p1x = (int)(Math.random()*10);
        int p1y = (int)(Math.random()*10);
        int p2x = (int)(Math.random()*10);
        int p2y = (int)(Math.random()*10);
        int f1x = (int)(Math.random()*10);
        int f1y = (int)(Math.random()*10);
        int f2x = (int)(Math.random()*10);
        int f2y = (int)(Math.random()*10);
        map[m1x][m1y] = m1;
        map[m2x][m2y] = m2;
        map[m3x][m3y] = m3;
        map[m4x][m4y] = m4;
        map[m5x][m5y] = m5;
        map[m6x][m6y] = m6;
        map[p1x][p1y] = p1;
        map[p2x][p2y] = p2;
        map[f1x][f1y] = f1;
        map[f2x][f2y] = f2;
        Fight fight;
        FarmerInteract farmerInteract;
        
        for(int i = 0; i < map.length; i++){
            for (int j = 0; j < map.length; j++){
                if(map[j][i] == null){
                    map[j][i] = ".";
                }
            }
        }
        
        for (int i = 0; i < map.length; i++){
            for (int j = 0; j < map.length; j++){
                if(map[j][i].equals(m1) || map[j][i].equals(m2) || map[j][i].equals(m3) || map[j][i].equals(m4) || map[j][i].equals(m5) || map[j][i].equals(m6)){
                    map[j][i] = "M";
                }
                if(map[j][i].equals(p1) || map[j][i].equals(p2)){
                    map[j][i] = "P";
                }
                if(map[j][i].equals(f1) || map[j][i].equals(f2)){
                    map[j][i] = "F";
                }
            }
        }
         
        Scanner input = new Scanner(System.in);
        System.out.println("Welcome to Hero and Monsters!");
        System.out.println("Type \"help\" for a list of commands. ");
        while(game){
            for(int i = 0; i < map.length; i++){
                for(int j = 0; j < map.length; j++){
                    if(map[j][i] == null){
                        map[j][i] = ".";
                    }
                }
            }
            for(int b = 0; b < 10; b++){
                for(int a = 0; a < 10; a++){
                    if((heroXPos == a) && (heroYPos == b)){
                        System.out.print("H" + "\t");
                    }else if((heroXPos - 1 == a && heroYPos == b) || (heroXPos - 2 == a && heroYPos == b)){
                        System.out.print(map[b][a] + "\t");
                    }else if((heroXPos + 1 == a && heroYPos == b) || (heroXPos + 2 == a && heroYPos == b)){
                        System.out.print(map[b][a] + "\t");
                    }else if((heroYPos - 1 == b && heroXPos == a) || (heroYPos - 2 == b && heroXPos == a)){
                        System.out.print(map[b][a] + "\t");
                    }else if((heroYPos + 1 == b && heroXPos == a) || (heroYPos + 2 == b && heroXPos == a)){
                        System.out.print(map[b][a] + "\t");
                    }else if((heroYPos + 1 == b && heroXPos + 1 == a) || (heroYPos + 2 == b && heroXPos + 1 == a)){
                        System.out.print(map[b][a] + "\t");
                    }else if((heroYPos + 1 == b && heroXPos + 2 == a) || (heroYPos + 2 == b && heroXPos + 2 == a)){
                        System.out.print(map[b][a] + "\t");
                    }else if((heroYPos + 1 == b && heroXPos - 1 == a) || (heroYPos + 2 == b && heroXPos - 1 == a)){
                        System.out.print(map[b][a] + "\t");
                    }else if((heroYPos + 1 == b && heroXPos - 2 == a) || (heroYPos + 2 == b && heroXPos - 2 == a)){
                        System.out.print(map[b][a] + "\t");
                    }else if((heroYPos - 1 == b && heroXPos == a) || (heroYPos + 2 == b && heroXPos == a)){
                        System.out.print(map[b][a] + "\t");
                    }else if((heroYPos - 1 == b && heroXPos + 1 == a) || (heroYPos - 2 == b && heroXPos + 1 == a)){
                        System.out.print(map[b][a] + "\t");
                    }else if((heroYPos - 1 == b && heroXPos + 2 == a) || (heroYPos - 2 == b && heroXPos + 2 == a)){
                        System.out.print(map[b][a] + "\t");
                    }else if((heroYPos - 1 == b && heroXPos - 1 == a) || (heroYPos - 2 == b && heroXPos - 1 == a)){
                        System.out.print(map[b][a] + "\t");
                    }else if((heroYPos - 1 == b && heroXPos - 2 == a) || (heroYPos - 2 == b && heroXPos - 2 == a)){
                        System.out.print(map[b][a] + "\t");
                    }else{
                        System.out.print("." + "\t");
                    }
                }
                System.out.print("\n");
            }
            System.out.println("Enter direction (north/w, south/s, east/d, west/a): ");
            
            direction = input.nextLine();
            direction = direction.toLowerCase();
            System.out.println("\n");
            if(direction.equals("north")||direction.equals("w")){ // checks that it is possible to move in this direction and that it isnt out of the array
                if(heroYPos != 0){
                    heroYPos -= 1;
                    if(heroYPos == p1x && heroXPos == p1y){
                        if(map[p1x][p1y] == null){
                            continue;
                        }else{
                            System.out.println("The hero found a potion!");
                            hero.setNumPotions(1);
                            map[p1x][p1y] = null;
                        }
                    }else if(heroYPos == p2x && heroXPos == p2y){
                        if(map[p2x][p2y] == null){
                            continue;
                        }else{
                            System.out.println("The hero found a potion!");
                            hero.setNumPotions(1);
                            map[p2x][p2y] = null;
                        }
                    }
                    if(heroYPos == f1x && heroXPos == f1y){
                        farmerInteract = new FarmerInteract(hero, 1, monstersKilled);
                    }else if(heroYPos == f2x && heroXPos == f2y){
                        farmerInteract = new FarmerInteract(hero, 2, monstersKilled);
                    }
                    if(heroYPos == m1x && heroXPos == m1y){
                        if(m1.getMonsterHealth() <= 0){
                            continue;
                        }else{
                            fight = new Fight(hero, m1);
                            monstersKilled += 1;
                            if(monstersKilled == 6){
                                System.out.println("Hero has killed all the monsters!");
                                game = false;
                            }
                            if(hero.getHealth() <= 0){
                                game = false;
                            }
                        }
                    }else if(heroYPos == m2x && heroXPos == m2y){
                        if(m2.getMonsterHealth() <= 0){
                            continue;
                        }else{
                            fight = new Fight(hero, m2);
                            monstersKilled += 1;
                            if(monstersKilled == 6){
                                System.out.println("Hero has killed all the monsters!");
                                game = false;
                            }
                            if(hero.getHealth() <= 0){
                                game = false;
                            }
                        }
                    }else if(heroYPos == m3x && heroXPos == m3y){
                        if(m3.getMonsterHealth() <= 0){
                            continue;
                        }else{
                            fight = new Fight(hero, m3);
                            monstersKilled += 1;
                            if(monstersKilled == 6){
                                System.out.println("Hero has killed all the monsters!");
                                game = false;
                            }
                            if(hero.getHealth() <= 0){
                                game = false;
                            }
                        }
                    }else if(heroYPos == m4x && heroXPos == m4y){
                        if(m4.getMonsterHealth() <= 0){
                            continue;
                        }else{
                            fight = new Fight(hero, m4);
                            monstersKilled += 1;
                            if(monstersKilled == 6){
                                System.out.println("Hero has killed all the monsters!");
                                game = false;
                            }
                            if(hero.getHealth() <= 0){
                                game = false;
                            }
                        }
                    }else if(heroYPos == m5x && heroXPos == m5y){
                        if(m5.getMonsterHealth() <= 0){
                            continue;
                        }else{
                            fight = new Fight(hero, m5);
                            monstersKilled += 1;
                            if(monstersKilled == 6){
                                System.out.println("Hero has killed all the monsters!");
                                game = false;
                            }
                            if(hero.getHealth() <= 0){
                                game = false;
                            }
                        }
                    }else if(heroYPos == m6x && heroXPos == m6y){
                        if(m6.getMonsterHealth() <= 0){
                            continue;
                        }else{
                            fight = new Fight(hero, m6);
                            monstersKilled += 1;
                            if(monstersKilled == 6){
                                System.out.println("Hero has killed all the monsters!");
                                game = false;
                            }
                            if(hero.getHealth() <= 0){
                                game = false;
                            }
                        }
                    }
                }else{
                    System.out.println("There is too much fog to continue in this direction");
                }
            }else if(direction.equals("south")||direction.equals("s")){
                if(heroYPos != 9){
                    heroYPos += 1;
                    if(heroYPos == p1x && heroXPos == p1y){
                        System.out.println("The hero found a potion!");
                        hero.setNumPotions(1);
                        map[p1x][p1y] = null;
                    }else if(heroYPos == p2x && heroXPos == p2y){
                        System.out.println("The hero found a potion!");
                        hero.setNumPotions(1);
                        map[p2x][p2y] = null;
                    }
                    if(heroYPos == f1x && heroXPos == f1y){
                        farmerInteract = new FarmerInteract(hero, 1, monstersKilled);
                    }else if(heroYPos == f2x && heroXPos == f2y){
                        farmerInteract = new FarmerInteract(hero, 2, monstersKilled);
                    }
                    if(heroYPos == m1x && heroXPos == m1y){
                        if(m1.getMonsterHealth() <= 0){
                            continue;
                        }else{
                            fight = new Fight(hero, m1);
                            monstersKilled += 1;
                            if(monstersKilled == 6){
                                System.out.println("Hero has killed all the monsters!");
                                game = false;
                            }
                            if(hero.getHealth() <= 0){
                                game = false;
                            }
                        }
                    }else if(heroYPos == m2x && heroXPos == m2y){
                        if(m2.getMonsterHealth() <= 0){
                            continue;
                        }else{
                            fight = new Fight(hero, m2);
                            monstersKilled += 1;
                            if(monstersKilled == 6){
                                System.out.println("Hero has killed all the monsters!");
                                game = false;
                            }
                            if(hero.getHealth() <= 0){
                                game = false;
                            }
                        }
                    }else if(heroYPos == m3x && heroXPos == m3y){
                        if(m3.getMonsterHealth() <= 0){
                            continue;
                        }else{
                            fight = new Fight(hero, m3);
                            monstersKilled += 1;
                            if(monstersKilled == 6){
                                System.out.println("Hero has killed all the monsters!");
                                game = false;
                            }
                            if(hero.getHealth() <= 0){
                                game = false;
                            }
                        }
                    }else if(heroYPos == m4x && heroXPos == m4y){
                        if(m4.getMonsterHealth() <= 0){
                            continue;
                        }else{
                            fight = new Fight(hero, m4);
                            monstersKilled += 1;
                            if(monstersKilled == 6){
                                System.out.println("Hero has killed all the monsters!");
                                game = false;
                            }
                            if(hero.getHealth() <= 0){
                                game = false;
                            }
                        }
                    }else if(heroYPos == m5x && heroXPos == m5y){
                        if(m5.getMonsterHealth() <= 0){
                            continue;
                        }else{
                            fight = new Fight(hero, m5);
                            monstersKilled += 1;
                            if(monstersKilled == 6){
                                System.out.println("Hero has killed all the monsters!");
                                game = false;
                            }
                            if(hero.getHealth() <= 0){
                                game = false;
                            }
                        }
                    }else if(heroYPos == m6x && heroXPos == m6y){
                        if(m6.getMonsterHealth() <= 0){
                            continue;
                        }else{
                            fight = new Fight(hero, m6);
                            monstersKilled += 1;
                            if(monstersKilled == 6){
                                System.out.println("Hero has killed all the monsters!");
                                game = false;
                            }
                            if(hero.getHealth() <= 0){
                                game = false;
                            }
                        }
                    }
                }else{
                    System.out.println("There is too much fog to continue in this direction");
                }
            }else if(direction.equals("east")||direction.equals("d")){
                if(heroXPos != 9){
                    heroXPos += 1;
                    if(heroYPos == p1x && heroXPos == p1y){
                        System.out.println("The hero found a potion!");
                        hero.setNumPotions(1);
                        map[p1x][p1y] = null;
                    }else if(heroYPos == p2x && heroXPos == p2y){
                        System.out.println("The hero found a potion!");
                        hero.setNumPotions(1);
                        map[p2x][p2y] = null;
                    }
                    if(heroYPos == f1x && heroXPos == f1y){
                        farmerInteract = new FarmerInteract(hero, 1, monstersKilled);
                    }else if(heroYPos == f2x && heroXPos == f2y){
                        farmerInteract = new FarmerInteract(hero, 2, monstersKilled);
                    }
                    if(heroYPos == m1x && heroXPos == m1y){
                        if(m1.getMonsterHealth() <= 0){
                            continue;
                        }else{
                            fight = new Fight(hero, m1);
                            monstersKilled += 1;
                            if(monstersKilled == 6){
                                System.out.println("Hero has killed all the monsters!");
                                game = false;
                            }
                            if(hero.getHealth() <= 0){
                                game = false;
                            }
                        }
                    }else if(heroYPos == m2x && heroXPos == m2y){
                        if(m2.getMonsterHealth() <= 0){
                            continue;
                        }else{
                            fight = new Fight(hero, m2);
                            monstersKilled += 1;
                            if(monstersKilled == 6){
                                System.out.println("Hero has killed all the monsters!");
                                game = false;
                            }
                            if(hero.getHealth() <= 0){
                                game = false;
                            }
                        }
                    }else if(heroYPos == m3x && heroXPos == m3y){
                        if(m3.getMonsterHealth() <= 0){
                            continue;
                        }else{
                            fight = new Fight(hero, m3);
                            monstersKilled += 1;
                            if(monstersKilled == 6){
                                System.out.println("Hero has killed all the monsters!");
                                game = false;
                            }
                            if(hero.getHealth() <= 0){
                                game = false;
                            }
                        }
                    }else if(heroYPos == m4x && heroXPos == m4y){
                        if(m4.getMonsterHealth() <= 0){
                            continue;
                        }else{
                            fight = new Fight(hero, m4);
                            monstersKilled += 1;
                            if(monstersKilled == 6){
                                System.out.println("Hero has killed all the monsters!");
                                game = false;
                            }
                            if(hero.getHealth() <= 0){
                                game = false;
                            }
                        }
                    }else if(heroYPos == m5x && heroXPos == m5y){
                        if(m5.getMonsterHealth() <= 0){
                            continue;
                        }else{
                            fight = new Fight(hero, m5);
                            monstersKilled += 1;
                            if(monstersKilled == 6){
                                System.out.println("Hero has killed all the monsters!");
                                game = false;
                            }
                            if(hero.getHealth() <= 0){
                                game = false;
                            }
                        }
                    }else if(heroYPos == m6x && heroXPos == m6y){
                        if(m6.getMonsterHealth() <= 0){
                            continue;
                        }else{
                            fight = new Fight(hero, m6);
                            monstersKilled += 1;
                            if(monstersKilled == 6){
                                System.out.println("Hero has killed all the monsters!");
                                game = false;
                            }
                            if(hero.getHealth() <= 0){
                                game = false;
                            }
                        }
                    }
                }else{
                    System.out.println("There is too much fog to continue in this direction");
                }
            }else if(direction.equals("west")||direction.equals("a")){
                if(heroXPos != 0){
                    heroXPos -= 1;
                    if(heroYPos == p1x && heroXPos == p1y){
                        System.out.println("The hero found a potion!");
                        hero.setNumPotions(1);
                        map[p1x][p1y] = null;
                    }else if(heroYPos == p2x && heroXPos == p2y){
                        System.out.println("The hero found a potion!");
                        hero.setNumPotions(1);
                        map[p2x][p2y] = null;
                    }
                    if(heroYPos == f1x && heroXPos == f1y){
                        farmerInteract = new FarmerInteract(hero, 1, monstersKilled);
                    }else if(heroYPos == f2x && heroXPos == f2y){
                        farmerInteract = new FarmerInteract(hero, 2, monstersKilled);
                    }
                    if(heroYPos == m1x && heroXPos == m1y){
                        if(m1.getMonsterHealth() <= 0){
                            continue;
                        }else{
                            fight = new Fight(hero, m1);
                            monstersKilled += 1;
                            if(monstersKilled == 6){
                                System.out.println("Hero has killed all the monsters!");
                                game = false;
                            }
                            if(hero.getHealth() <= 0){
                                game = false;
                            }
                        }
                    }else if(heroYPos == m2x && heroXPos == m2y){
                        if(m2.getMonsterHealth() <= 0){
                            continue;
                        }else{
                            fight = new Fight(hero, m2);
                            monstersKilled += 1;
                            if(monstersKilled == 6){
                                System.out.println("Hero has killed all the monsters!");
                                game = false;
                            }
                            if(hero.getHealth() <= 0){
                                game = false;
                            }
                        }
                    }else if(heroYPos == m3x && heroXPos == m3y){
                        if(m3.getMonsterHealth() <= 0){
                            continue;
                        }else{
                            fight = new Fight(hero, m3);
                            monstersKilled += 1;
                            if(monstersKilled == 6){
                                System.out.println("Hero has killed all the monsters!");
                                game = false;
                            }
                            if(hero.getHealth() <= 0){
                                game = false;
                            }
                        }
                    }else if(heroYPos == m4x && heroXPos == m4y){
                        if(m4.getMonsterHealth() <= 0){
                            continue;
                        }else{
                            fight = new Fight(hero, m4);
                            monstersKilled += 1;
                            if(monstersKilled == 6){
                                System.out.println("Hero has killed all the monsters!");
                                game = false;
                            }
                            if(hero.getHealth() <= 0){
                                game = false;
                            }
                        }
                    }else if(heroYPos == m5x && heroXPos == m5y){
                        if(m5.getMonsterHealth() <= 0){
                            continue;
                        }else{
                            fight = new Fight(hero, m5);
                            monstersKilled += 1;
                            if(monstersKilled == 6){
                                System.out.println("Hero has killed all the monsters!");
                                game = false;
                            }
                            if(hero.getHealth() <= 0){
                                game = false;
                            }
                        }
                    }else if(heroYPos == m6x && heroXPos == m6y){
                        if(m6.getMonsterHealth() <= 0){
                            continue;
                        }else{
                            fight = new Fight(hero, m6);
                            monstersKilled += 1;
                            if(monstersKilled == 6){
                                System.out.println("Hero has killed all the monsters!");
                                game = false;
                            }
                            if(hero.getHealth() <= 0){
                                game = false;
                            }
                        }
                    }
                }else{
                    System.out.println("There is too much fog to continue in this direction");
                }
            }else if(direction.equals("quit")){
                game = false;
            }else if(direction.equals("help")){
                System.out.println("Command: north/w = Move North");
                System.out.println("Command: south/s = Move South");
                System.out.println("Command: west/a = Move West");
                System.out.println("Command: east/d = Move East");
                System.out.println("Command: stats = View stats");
                System.out.println("Command: inv/inventory = View inventory");
            }else{
                System.out.println("An invalid direction has been entered!");
            }
        }
    }
}