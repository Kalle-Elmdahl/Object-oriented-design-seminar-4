package se.kth.iv1350.seminar4.model;

/**
 * The register is a singleton class and therefore is accessed by the getInstance function
 */
public class Register {
    double amount;

    private Register() {
        this.amount = 1000;
    }
    
    private static class RegisterHolder {
      private static Register instance = new Register();
    } 
  
    public static Register getInstance() {
      return RegisterHolder.instance;
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
