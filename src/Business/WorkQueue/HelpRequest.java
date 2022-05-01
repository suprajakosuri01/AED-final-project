/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Business.WorkQueue;

/**
 *
 * @author vivek
 */
public class HelpRequest extends WorkAppeal{
    
     private String helpComments;
    private double amount;
    private String accountNumber;

    public String getHelpComments() {
        return helpComments;
    }

    public void setHelpComments(String helpComments) {
        this.helpComments = helpComments;
    }

    public double getAmount() {
        return amount;
    }

    public void setAmount(double amount) {
        this.amount = amount;
    }

    public String getAccountNumber() {
        return accountNumber;
    }

    public void setAccountNumber(String accountNumber) {
        this.accountNumber = accountNumber;
    }
    
    
    
}
