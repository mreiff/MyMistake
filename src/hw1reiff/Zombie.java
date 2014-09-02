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
public class Zombie implements Mob{
    
    @Override
    public void interact(Mob mob) {
        if(mob instanceof Animals){
            System.out.println("Aggressive");
        }else {
            System.out.println("Passive");
        }
    }

    @Override
    public void speak(){
        System.out.println("Arrg!");
    }
}
