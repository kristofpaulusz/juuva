package dinmeret;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class AsszociativOsszetett {
    public static void main(String[] args) {
        HashMap<String, Double> nevekAtlaggal = new HashMap<>();
        nevekAtlaggal.put("Kristi", 5.0);
        nevekAtlaggal.put("Bence", 1.0);
    
        HashMap<String, ArrayList<Integer>> nevekJegyekkel = new HashMap<>();
        ArrayList<Integer> jegyek = new ArrayList<>();
        jegyek.add(5);
        jegyek.add(1);
        jegyek.add(2);
        jegyek.add(3);
        nevekJegyekkel.put("Pál", jegyek);
        
        for (Map.Entry<String, ArrayList<Integer>> entry : nevekJegyekkel.entrySet()) {
            String key = entry.getKey();
            ArrayList<Integer> value = entry.getValue();
            System.out.println(key);
            System.out.println(value);
            
        }
    }
    
}
