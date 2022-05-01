/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Business.Emergency;

import java.util.ArrayList;

/**
 *
 *  @author supraja kosuri
 */
public class EmergencyDirectory {
    
   private ArrayList<Emergency> emergencyList;

    public EmergencyDirectory(ArrayList<Emergency> emergencyList) {
        //this.emergencyList = emergencyList;
    }

    public ArrayList<Emergency> getEmergencyList() {
        //return emergencyList;
    }
   
    public Emergency createEntry(Emergency emergency) {
        emergencyList.add(emergency);
        return emergency;
    }
}
