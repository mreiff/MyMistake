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
public class Creeper implements Mob{
    
    @Override
    public void interact(Mob mob) {
        if(mob instanceof Creeper){
        System.out.println("Passive");
        }else{
            System.out.println("Aggressive");
        }
    }
            
    @Override
    public void speak() {
        System.out.println("Sssssssss");
    }
}
