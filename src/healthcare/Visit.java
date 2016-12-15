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
public class Visit implements java.io.Serializable {
    private String pat,docUserName,docName,hospital, treatment;
    private Date date;

    public Visit(String newDoc, String newPat) {
        docUserName = newDoc;
        pat = newPat;
    }

    public void setPatient(String pat1) {
        pat = pat1;
    }
    
    public String getPatient() {
        return pat;
    }
    
    public void setDocUserName(String do1) {
        docUserName = do1;
    }

    public String getDocUserName() {
        return docUserName;
    }
    
    public void setDocName(String do1) {
        docName = do1;
    }

    public String getDocName() {
        return docName;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date newDat) {
        date = newDat;
    }

    public void setTreatment(String t) {
        treatment = t;
    }

    public String getTreatment() {
        return treatment;
    }

    public void setHospital(String hp) {
        hospital = hp;
    }

    public String getHospital() {
        return hospital;
    }
}
