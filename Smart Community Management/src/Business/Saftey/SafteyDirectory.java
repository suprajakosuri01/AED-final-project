/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Saftey;

import java.util.ArrayList;

/**
 *
 * @author suprajakosuri
 */
public class SafteyDirectory {
     private ArrayList<Saftey> SafteyList;
      public SafteyDirectory(ArrayList<Saftey> SafteyList) {
        this.SafteyList=this.SafteyList;
    }

    public ArrayList<Saftey> getSafteyList() {
        return SafteyList;
    }

   public Saftey createEntry( Saftey  saftey) {
        SafteyList.add(saftey);
        return saftey;
    }


}
