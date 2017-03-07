package pro.jtaylor.timetracker.core;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import pro.jtaylor.timetracker.core.dao.TimeEntry;

import java.util.List;

@Component
public class Tracker {
    @Autowired
    private List<TimeEntry> entries;
    
    /**
     * Add Method
     * @param int add for entries
     */
    

    public void add(TimeEntry entry) {
        entries.add(entry);
    }

    /**
     * Remove Method
     * @param int remove for entries
     */
 
    public void remove(TimeEntry entry) {
        entries.remove(entry);
    }

    /**
     * Size Method
     * @param int size for entries
     */
 

    public int size() {
        return entries.size();
    }

    /**
     * Get Method
     * @param TimeEntry get for entries
     */
 
    public TimeEntry get(int index) {
        
        // boolean vaild = false;
        // if (vaild == true) {
        // whatever
        //
        return entries.get(index);
    }
}



