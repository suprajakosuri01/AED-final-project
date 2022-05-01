/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Business.WorkQueue;

import java.util.ArrayList;

/**
 *
 * @author vivek
 */
public class WorkQueue extends WorkAppeal{
    
     private ArrayList<WorkAppeal> ListOfWorkQueues;

    public WorkQueue() {
        ListOfWorkQueues = new ArrayList();
    }

    public ArrayList<WorkAppeal> getListOfWorkQueues() {
        return ListOfWorkQueues;
    }
    
    public void addWorkAppeal(WorkAppeal workRequest){
            
        ListOfWorkQueues.add(workRequest);
    }
    
    
}
