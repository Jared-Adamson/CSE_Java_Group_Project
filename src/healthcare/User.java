/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package healthcare;

/**
 *
 * @author Jing Liang
 */
public class User implements java.io.Serializable {
    private String username,password,name,gender,emailAddress,phoneNumber;
    private int age;
    //instructor for User class
    public User(String username,String password)
    {
        this.username = username;
        this.password = password;
    }
    public User(String username,String password,String name,String sex,int age,String ead,String phone)
    {
        this.username = username;
        this.password = password;
        this.name = name;
        this.gender = sex;
        this.age = age;
        this.emailAddress = ead;
        this.phoneNumber = phone;
    }
    
    //getter and setter methods
    public String getUserName()
    {
        return username;
    }
    public String getPassword()
    {
        return password;
    }
    public void setPassword(String password)
    {
        this.password = password;
    }
    public String getName()
    {
        return name;
    }
    public void setName(String name)
    {
        this.name = name;
    }
    public String getGender()
    {
        return gender;
    }
    public void setGender(String sex)
    {
        this.gender = sex;
    }
    public int getAge()
    {
        return age;
    }
    public void setAge(int age)
    {
        this.age = age;
    }
    public String getEmailAddress()
    {
        return emailAddress;
    }
    public void setEmailAddress(String emailAddress)
    {
        this.emailAddress = emailAddress;
    }
    public String getPhoneNumber()
    {
        return phoneNumber;
    }
    public void setPhoneNumber(String phone)
    {
        this.phoneNumber = phone;
    }
}
