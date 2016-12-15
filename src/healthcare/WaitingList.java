
package healthcare;

import java.util.ArrayList;
import java.util.Iterator;

/**
 *
 * @author Jing
 */
public class WaitingList implements java.io.Serializable {
    private ArrayList<PainEntry> list;
    
    // Initialize Waiting List ArrayList
    public WaitingList()
    {
        list = new ArrayList<>();
    }
    
    // Adds elements onto ArrayList
    public void add(PainEntry entry)
    {
        // Iterates through the arraylist to find similar elements
        // If found, we remove the entry
        // Else, add onto list
        for (Iterator<PainEntry> it = list.iterator(); it.hasNext();) {
            PainEntry e = it.next();
            if(e.getPatUserName().equals(entry.getPatUserName()))
            {
                list.remove(e);
                break;
            }
        }
        list.add(entry);
    }
    
    // returns ArrayList
    public ArrayList<PainEntry> getList()
    {
        return list;
    }
}
