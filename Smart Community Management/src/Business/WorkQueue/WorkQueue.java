/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.WorkQueue;

import java.util.ArrayList;

/**
 *
 * @author suprajakosuri
 */
public class WorkQueue {
    
    private ArrayList<WorkAppeal> WorkAppeals;

    public WorkQueue() {
        WorkAppeals = new ArrayList();
    }

    public ArrayList<WorkAppeal> getWorkAppeals() {
        return WorkAppeals;
    }
    public void addWorkRequest(WorkAppeal workAppeals){
            
        WorkAppeals.add(workAppeals);

   
   
    
    
}
}
