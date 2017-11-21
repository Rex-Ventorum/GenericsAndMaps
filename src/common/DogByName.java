
package common;

import java.util.Comparator;

public class DogByName implements Comparator<Dog>{

    @Override
    public int compare(Dog current, Dog target) {
        return current.getName().compareTo(target.getName());
    }
    
}
