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
public class Cow implements Animals{
    
    @Override
    public void breed(Animals animal) {
        if(animal instanceof Cow){
            System.out.println("There is 1 new cow");
        }else{
            System.out.println("No new Cows");
        }
    }

    @Override
    public void food() {
        System.out.println("Steak");
    }

    @Override
    public void interact(Mob mob) {
        System.out.println("Passive");
    }

    @Override
    public void speak() {
        System.out.println("Moo");
    }
}
