package oop;

import java.util.ArrayList;
import java.util.Random;

public class Bang50 {
    ArrayList<Base> bang = new ArrayList<>();
    
    public Bang50(int number){
    
    for(int i = 1; i <= number; i++){

        Random rnd = new Random();
        int n = rnd.nextInt(7);
        
        switch (n) {
            case 0:
                bang.add(new Monk());

                break;
            
            case 1:
                bang.add(new Peasant());

                break;

            case 2:
                bang.add(new Robber());

                break;
            
            case 3:
                bang.add(new Sniper());

                break;
            
            case 4:
                bang.add(new Spearman());

                break;
            
            case 5:
                bang.add(new Wizard());

                break;

            case 6:
                bang.add(new Xbowman());

                break;

            default:
                break;
        }

    }
    
    }

    public ArrayList<Base> getBang(){
        return bang;
    }
}
