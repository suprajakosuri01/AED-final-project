/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.WorkQueue;

import java.util.ArrayList;

/**
 *
 *@author supraja kosuri
 */
public class WorkQueue {
    private ArrayList<WorkRequest> ListOfWorkQueues;

    public WorkQueue() {
        ListOfWorkQueues = new ArrayList();
    }

    public ArrayList<WorkRequest> getListOfWorkQueues() {
        return ListOfWorkQueues;
    }
    
    public void addWorkRequest(WorkRequest workRequest){
            
        ListOfWorkQueues.add(workRequest);
    }
    
    
}
