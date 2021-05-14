package se.kth.iv1350.seminar4.model;

/**
 * This is a virtual register. Used for keeping track of the money in the register
 */
public class Register {
    double amount;

    /**
     * This function generates a new instance of a register.
     */
    public Register() {
        this.amount = 1000;
    }

    
    /** 
     * Returns the amount in register.
     * @return double: the amount of money in the register.
     */
    public double getAmount() {
        return amount;
    }

    
    /** 
     * This function can update the amount in the register.
     * @param amount the relative change of the amount. Can be negative.
     */
    public void updateAmount(double amount) {
        this.amount += amount;
    }
}
