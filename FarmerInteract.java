public class FarmerInteract{    
    private boolean heroHasArmor = false;
    
    public FarmerInteract(Hero hero, int farmerNum, int monstersKilled){
        if(farmerNum == 1){
            if(monstersKilled < 2){
                System.out.println("Hero has encountered a farmer!");
                System.out.println("Farmer: My sheep have been taken… My family is gone and I have nothing left except for bronze amor I have buried… Only a true hero will receive this.\nCome back when you have killed two monsters.");
            }else if(monstersKilled >= 2){
                System.out.println("Hero has encountered a farmer!");
                System.out.println("Farmer: Take this armor, it will help you in your fight against the monsters.");
                System.out.println("Hero has received armor.");
                heroHasArmor = true;
            }
        }else if(farmerNum == 2){
            if(monstersKilled < 4){
                System.out.println("Hero has encountered a farmer!");
                System.out.println("Farmer: I am crafting a broad sword... come back to me when you have killed four monsters.");
            }else if(monstersKilled >= 4){
                System.out.println("Hero has encountered a farmer!");
                System.out.println("Take this broad swoard, it will help you in your fight against the monsters.");
                System.out.println("Hero has received a broad sword.");
                hero.setWeapon(1);
            }
        }
    }
    
    public boolean hasArmor(){
        return heroHasArmor;
    }
}