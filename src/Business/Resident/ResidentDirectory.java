/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Business.Resident;

import java.util.ArrayList;

/**
 *
 * @author vivek
 */
public class ResidentDirectory {
    
    
    private ArrayList<Resident> residentList;

    public ResidentDirectory() {
        residentList = new ArrayList<>();
    }

    public ArrayList<Resident> getResidentList() {
        return residentList;
    }

    public Resident addResident(Resident resident) {
        
        residentList.add(resident);
        return resident;
    }
    
    public boolean checkIfcustomerisUnique(String userName){
        
        for(Resident resident : residentList){
            
            if(resident.getUserName().equals(userName)) return false;
        }
        
        return true;
    }
    
}
