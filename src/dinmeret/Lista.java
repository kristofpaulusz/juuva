package dinmeret;

import java.util.ArrayList;
import java.util.Random;

public class Lista {
    public static void main(String[] args) {
        // 5 db 2 jegyű számot a listába
        ArrayList<Integer> al = new ArrayList<>();
        for (int i = 0; i < 5; i++) {
            al.add(rnd2jgy());
        }
        al.add((int)(Math.random()*45)*2+11);
        megjelenit(al);
        paratlankiszed(al);
        megjelenit(al);
        
    }
    public static int rnd2jgy() {
        Random myRandom = new Random();
       return myRandom.nextInt(10, 100);
    }

    private static void megjelenit(ArrayList<Integer> list) {
      for (int i = 0; i < list.size(); i++) {
            System.out.print(list.get(i)+" ");
        }
        System.out.println("");
    }

    private static void paratlankiszed(ArrayList<Integer> list) {
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i)%2 != 0) {
                list.remove(i);
                // ez nem jó megoldás de nekem tetszik
                paratlankiszed(list);
            }
       }
    }
    
}
