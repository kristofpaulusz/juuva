package dinmeret;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
/// WIP BELEZAVARODTAM
public class Asszociativ {
    public static void main(String[] args) throws IOException {
        String myFile = "fuvar.csv";
        Path myPath = Paths.get(myFile);
        List<String> myList = Files.readAllLines(myPath);
       
        ArrayList<Fuvar> fuvarok = new ArrayList<>();
            Map<String, Integer> mibolMennyi = new HashMap<>();
        for (int i = 1; i < myList.size(); i++) {
            fuvarok.add(new Fuvar(myList.get(i).replace(",", "."))) ;
            
            for (Fuvar fuvar : fuvarok) {
                String kulcs = fuvar.getFizetes_modja();
                if (mibolMennyi.containsKey(kulcs)) {
                    int ertek = mibolMennyi.get(kulcs);
                    mibolMennyi.put(kulcs, ertek++);
                }
                else {
                mibolMennyi.put(kulcs, 1);
                }
            }
    }
        for (Map.Entry<String, Integer> entry : mibolMennyi.entrySet()) {
            Object key = entry.getKey();
            Object value = entry.getValue();
            System.out.println(key+ " "+ value);
        }
//            System.out.println(mibolMennyi.toString());
        }
    }
 
