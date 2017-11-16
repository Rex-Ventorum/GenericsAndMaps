package common;

import java.util.HashMap;
import java.util.Map;

public class StartUp {
    public static void main(String[] args) {
        Movie deadpool1 = new Movie("Dead Pool", "Tim Miller");
        Movie deadpool2 = new Movie(deadpool1.getMovieId(), "Dead Pool", "Tim Miller");
        Movie cinderellaLiveAction = new Movie("Cinderella","Kenneth Branagh");
        Movie cinderellaDisney = new Movie("Cinderella", "Clyde Geronimi");
        Map<String,Movie> map = new HashMap<>();
        map.put("D1", deadpool1);
        map.put("D2", deadpool2);
        map.put("CL1",cinderellaLiveAction);
        map.put("CD1",cinderellaDisney);
        
        System.out.println("Item Retrieved from .get(\"D1\") Key: " + map.get("D1"));
        
        System.out.println("\nLoop Each Value: ");
        for(Movie movie : map.values()){
            System.out.println("- " + movie);
        }
        
        System.out.println("\nLoop Each Key: ");
        for(String key : map.keySet()){
            System.out.println("- " + key);
        }
        
        System.out.println("\nLoop Both Key and Value:");
        for(String key : map.keySet()){
            System.out.println("Key: " + key + " -> Value: " + map.get(key));
        }
        
    }
}
