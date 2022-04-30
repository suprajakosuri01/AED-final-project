/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Resident;

import java.util.ArrayList;

/**
 *
 *  @author sowmika
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
