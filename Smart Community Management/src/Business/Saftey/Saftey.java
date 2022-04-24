/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Saftey;

/**
 *
 * @author suprajakosuri
 */
public class Saftey {
String emergencyType;
    String precedence;
    String remarks;
    public Saftey(String emergencyType,
    String precedence,
    String remarks){
        this.emergencyType=emergencyType;
        this.precedence=precedence;
        this.remarks=remarks;
        
        
    }

    public String getEmergencyType() {
        return emergencyType;
    }

    public void setEmergencyType(String emergencyType) {
        this.emergencyType = emergencyType;
    }

    public String getPrecedence() {
        return precedence;
    }

    public void setPrecedence(String precedence) {
        this.precedence = precedence;
    }

    public String getRemarks() {
        return remarks;
    }

    public void setRemarks(String remarks) {
        this.remarks = remarks;
    }
    
    
}
