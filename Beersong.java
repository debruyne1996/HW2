/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package beersong;

/**
 *
 * @author bryan
 */
public class Beersong {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
    }
    static void Ninety_Nine_Bottles_Of_Beer(){

       int BeerLeft = 99;
        String word = "bottles";
        while (BeerLeft > 0) {
            System.out.println(BeerLeft + " " + word + " of beer on the wall, " + BeerLeft + " " + word + " of beer");
            BeerLeft = BeerLeft - 1;
            if (BeerLeft == 1) {
                word = "bottle"; //ONE bottle
            }
            if (BeerLeft > 0) {
                System.out.println("Take one down, pass it round " + BeerLeft + " " + word + " of beer");
            }
        }
        if (BeerLeft == 0) {
            System.out.println("No more bottles of beer");
        }
   }
    
}
