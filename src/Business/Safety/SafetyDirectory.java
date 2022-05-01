/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Business.Safety;

import java.util.ArrayList;

/**
 *
 * @author vivek
 */
public class SafetyDirectory {
    
    
    
    private ArrayList<Safety> emergencyList;

    public SafetyDirectory(ArrayList<Safety> safetyList) {
        this.emergencyList = emergencyList;
    }

    public ArrayList<Safety> getEmergencyList() {
        return emergencyList;
    }
   
    public Safety createEntry(Safety safety) {
        emergencyList.add(safety);
        return safety;
    }
}
