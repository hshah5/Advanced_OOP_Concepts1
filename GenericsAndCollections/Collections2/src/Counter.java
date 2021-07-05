import java.util.HashMap;
import java.util.Set;

public class Counter<E> {
    private HashMap<E, Integer>counts; /* TODO
The HashMap should accomodate a generic class for the keys and Integer for the value*/

    public Counter(E[] things) {
        counts = new HashMap<>();
        for (E element : things) {
            if (counts.containsKey(element))
                counts.put(element, counts.get(element) + 1);
            else
                counts.put(element, 1);
        }
    }

/* TODO
Loop through the elements of "things" and use the HashMap "counts"
to store the elements of things as keys, and the number of times they
appear in the array as values. Check the instructions. */

    public Integer getCount(E element){
            return counts.get(element);
      /* TODO 
This just returns the specific count for an element. It is a wrapper
for a getting the value of the HashMap given the key "element" */
    }

    public int getSize(){
        return this.counts.size();
    }

    public E mostFrequent(){
            int max = 0;
            E element = null;
            Set<E> keys = counts.keySet();
            for(E key:keys) {
                Integer v = counts.get(key);
                if(v>max) {
                    max =v;
                    element = key;
                }
            } return element;
            /* TODO
Returns the most frequent key in the HashMap*/
    }
}
