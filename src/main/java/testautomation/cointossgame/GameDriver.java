package testautomation.cointossgame;

import java.util.Iterator;

public class GameDriver {
    public static void main(String[] args) {

        Coin coin = new Coin();
        //System.out.println(coin.flip());


        //flips the coin 3 times
        for(int i = 0; i < 3; i++){
            System.out.println(coin.flip());
        }


    }
}
