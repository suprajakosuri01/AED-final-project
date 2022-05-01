/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Business.Emergency;

/**
 *
 *  @author supraja kosuri
 */
public class Emergency {
    String emergencyType;
    String priority;
    String comments;

    /*public Emergency(String emergencyType, String priority, String comments) {
        this.emergencyType = emergencyType;
        this.priority = priority;
        this.comments = comments;*/
    }

    public String getEmergencyType() {
        return emergencyType;
    }

    public void setEmergencyType(String emergencyType) {
        this.emergencyType = emergencyType;
    }

    public String getPriority() {
        return priority;
    }

    public void setPriority(String priority) {
        this.priority = priority;
    }

    public String getComments() {
        return comments;
    }

    public void setComments(String comments) {
        this.comments = comments;
    }
    
    
}
