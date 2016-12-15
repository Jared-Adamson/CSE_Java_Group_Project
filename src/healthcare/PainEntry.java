/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package healthcare;

import java.util.Date;

/**
 *
 * @author Ye
 */
public class PainEntry implements java.io.Serializable {

    private int[] painInfo;
    private int pain = 0;
    private int drowsiness = 0;
    private int nausean = 0;
    private int anxiety = 0;
    private int depression = 0;
    private int average = 0;
    private boolean treated;
    private String docUserName,docName;
    private Date date;
    private String patUserName,patName;

    public PainEntry(int pa, int dr, int na, int an, int de) {
        pain = pa;
        drowsiness = dr;
        nausean = na;
        anxiety = an;
        depression = de;
        average = (pa + dr + na + an + de) / 5;
        treated = false;
        docUserName = "";
        docName = "";
    }

    public int getAvePain() {
        return average;
    }

    
        public int[] getPainInfo()
    {
        painInfo = new int[5];
        painInfo[0]=pain;
         painInfo[1]=drowsiness;
          painInfo[2]=nausean;
           painInfo[3]=anxiety;
            painInfo[4]=depression;
        
        return painInfo;
    }

    public void setPatUserName(String newPat) {
        this.patUserName = newPat;
    }
    
    public String getPatUserName() {
        return patUserName;
    }
    public void setPatName(String newPat) {
        this.patName = newPat;
    }
    
    public String getPatName() {
        return patName;
    }

    public void setDocUserName(String doc) {
        this.docUserName = doc;
    }

    public String getDocUserName() {
        return docUserName;
    }
    
    public void setDocName(String doc) {
        this.docName = doc;
    }

    public String getDocName() {
        return docName;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date a) {
        date = a;
    }

    public void setTreateStatus(boolean tf) {
        treated = tf;
    }

    public boolean getTreateStatus() {
        return treated;
    }
    
}
