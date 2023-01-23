package dinmeret;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

public class Halmaz {
    private String fejlec;
    public static void main(String[] args) throws IOException {
        String myFile = "fuvar.csv";
        Path myPath = Paths.get(myFile);
        List<String> myList = Files.readAllLines(myPath);
       
        ArrayList<Fuvar> fuvarok = new ArrayList<>();
        for (int i = 1; i < myList.size(); i++) {
            fuvarok.add(new Fuvar(myList.get(i).replace(",", "."))) ;
        }
//        kiir(fuvarok);
    // hány féle fizmód van
    // set: halmaz egyféléből csak egy megy belw
        Set<String> ennyiFele = new TreeSet<>();
        
        
        Set<String> ennyiFele2 = new HashSet<>();
        for (Fuvar fuvar : fuvarok) {
            ennyiFele.add(fuvar.getFizetes_modja());
            ennyiFele2.add(fuvar.getFizetes_modja());
        }
        halmazKiir(ennyiFele);
        System.out.println("");
        halmazKiir(ennyiFele2);
        
        }
        
    public static void kiir(ArrayList lista) {
        for (Object object : lista) {
            System.out.println(object.toString());
            
        }
    }
    public static void halmazKiir(Set halmaz) {
        for (Object string : halmaz) {
            System.out.println(string);
        }
        
    }
    
  
        
    }

