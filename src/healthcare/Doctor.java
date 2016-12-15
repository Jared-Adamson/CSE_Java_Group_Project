/*
 * This class stores the information of Doctor which extends User
 */
package healthcare;

/**
 *
 * @author Jing Liang
 */
public class Doctor extends User implements java.io.Serializable {
    private String hospital;
    //instructor for Doctor class
    public Doctor(String username,String password)
    {
        super(username,password);
    }
    public Doctor(String username,String password,String name,String sex,int age,String ead,String phone)
    {
        super(username,password,name,sex,age,ead,phone);
    }
    
    //getter and setter methods
    public String getHospital()
    {
        return hospital;
    }
    public void setHospital(String hospital)
    {
        this.hospital = hospital;
    }
}
