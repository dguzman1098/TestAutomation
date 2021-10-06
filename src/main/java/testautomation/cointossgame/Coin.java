package testautomation.cointossgame;

import java.util.Random;

/**chapter 14 - Selenium framework
 *
 * Discussed WebDriver, Page and other methods in Selenium
 * Offers a range of tools and libraries that enable and support the automation of web browsers
 *
 * Emulates user interaction with browsers
 *
 * At the core of Selenium is a WebDriver, an interface to write instruction sets
 * that can be run interchangeably in many browsers.
**/

public class Coin {

    private String side;
    private static final String heads = "heads";
    private static final String tails = "tails";

    public Coin(){

    }

    //flips the coin from tails to heads
    public String flip(){
        Random random = new Random();
        int side = random.nextInt(2); //50% chance, heads or tails
        if(side == 1){
            this.side = tails;
            return tails;
        } else {
            this.side = heads;
            return heads;
        }
    }


}
