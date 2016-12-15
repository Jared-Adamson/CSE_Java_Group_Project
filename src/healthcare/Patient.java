/*
 *  This class stores the information of Patient which extends User
 */
package healthcare;
import java.util.*;
/**
 *
 * @author Jing Liang
 */
public class Patient extends User implements java.io.Serializable {
    private ArrayList<PainEntry> painHistory;
    private ArrayList<Visit> visitHistory;
    //instructor for Patient class
    public Patient(String username,String password)
    {
        super(username,password);
        painHistory = new ArrayList<>();
        visitHistory = new ArrayList<>();
    }
    public Patient(String username,String password,String name,String sex,int age,String ead,String phone)
    {
        super(username,password,name,sex,age,ead,phone);
        painHistory = new ArrayList<>();
        visitHistory = new ArrayList<>();
    }
    
    //getter and setter methods
    public ArrayList<PainEntry> getPainHistory()
    {
        return painHistory;
    }
    public void addPain(PainEntry pain)
    {
        painHistory.add(pain);
    }
    public PainEntry getLatestPain()
    {
        return painHistory.get(painHistory.size()-1);
    }
    public ArrayList<Visit> getVisitHistory()
    {
        return visitHistory;
    }
    public void addVisit(Visit visit)
    {
        visitHistory.add(visit);
    }
}
