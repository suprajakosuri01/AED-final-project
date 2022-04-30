/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.WorkQueue;

/**
 *
 * @author supraja kosuri
 */
public class HelpRequest extends WorkRequest{
    
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
