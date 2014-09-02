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
public class Chicken implements Animals{
    
    @Override
    public void breed(Animals animal) {
        if(animal instanceof Chicken){
            System.out.println("There is 1 more chicken");
        }else{
            System.out.println("No new chickens");
        }
    }

    @Override
    public void food() {
        System.out.println("Chicken");
    }

    @Override
    public void interact(Mob mob) {
        System.out.println("Passive");
    }

    @Override
    public void speak() {
        System.out.println("Bwak");
    }
}
