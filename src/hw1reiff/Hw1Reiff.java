/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package hw1reiff;

/**
 *
 * @author mreiff
 */
public class Hw1Reiff {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Mob zombie = new Zombie();
        Creeper creeper = new Creeper();
        Animals chicken1 = new Chicken();
        Chicken chicken2 = new Chicken();
        Cow cow = new Cow();
        
        System.out.print("The zombie attacked the cow and was ");zombie.interact(cow);
        
        System.out.print("The cow then died and dropped raw ");cow.food();
        
        System.out.print("The 2 chickens bred and now ");chicken1.breed(chicken2);
        
        System.out.print("The zombie attempted to interact with the creeper but was ");zombie.interact(creeper);
        
        System.out.print("The creeper then was ");creeper.interact(zombie);System.out.print(" and blew up the zombie");
        
    }
    
}
