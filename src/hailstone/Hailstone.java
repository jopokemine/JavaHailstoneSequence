/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hailstone;

/**
 *
 * @author josh
 */
public class Hailstone {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        System.out.println(hailstone(7, true));
        System.out.println(hailstone(7, false));
        
    }
    
    //Returns the hailstone 
    public static String hailstone(int num, boolean forward) {
        
        String hailstone = "" + num;
        
        if (num == 1) return hailstone;
        
        else {
            if (forward) return hailstone + ", " + ((num % 2 == 0)?(hailstone(num / 2, forward)):(hailstone(3 * num + 1, forward)));
            
            else return ((num % 2 == 0)?(hailstone(num / 2, forward)):(hailstone(3 * num + 1, forward))) + ", " + hailstone;
        }
        
        
    }
    
}
