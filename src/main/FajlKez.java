package main;

import java.io.IOException;
import java.util.List;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;

public class FajlKez {
    public static void main(String[] args) throws IOException {
       
        
        String myTxt = "adatok.txt";
        Path myPath = Paths.get(myTxt);
        System.out.println(myPath);
        List<String> sorok = Files.readAllLines(myPath);
        String fl = sorok.get(0);
        sorok.remove(0);
        System.out.println("Sorok száma: "+ sorok.size());
        
        
        List<Ember> emberek = new ArrayList<>();
        for (String sor : sorok) {
            emberek.add(new Ember(sor, ":"));
        }
        System.out.println(emberek.get(0).getNev());
    }
}
