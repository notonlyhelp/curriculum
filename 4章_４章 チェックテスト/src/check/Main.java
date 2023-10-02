package check;

import constants.Constants;

public class Main {
	
	//‰Û‘è‡@@
    private String firstName = "sì";
    private String lastName = "—T‘¾";
    
    //‰Û‘è‡B
    public static void main(String[] args) {
    	
        Main main = new Main();
        main.printName();
        
        Pet pet_instance = new Pet(Constants.CHECK_CLASS_JAVA,Constants.CHECK_CLASS_HOGE);
        pet_instance.introduce();
        
        RobotPet robotPet_instance  = new RobotPet(Constants.CHECK_CLASS_R2D2,Constants.CHECK_CLASS_LUKE);
        robotPet_instance.introduce();
        
    }
    
    //‰Û‘è‡A
    private void printName() {
        String fullName = firstName + lastName;
        System.out.println("printNameƒƒ\ƒbƒh ¨@" + fullName);
    }


}