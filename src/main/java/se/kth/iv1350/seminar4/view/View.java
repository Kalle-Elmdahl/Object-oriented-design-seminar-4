package se.kth.iv1350.seminar4.view;

import se.kth.iv1350.seminar4.controller.Controller;
import se.kth.iv1350.seminar4.integration.ItemNotFoundException;
import se.kth.iv1350.seminar4.integration.ServerDownException;

/**
 * This is a pleaceholder for the real view. It contains a hardcoded execution with calls to all 
 * system operations in the controller
 */
public class View {
    private Controller contr;

    /**
     * Creates a new instance, that uses the specifier controller for all calls to other layers
     * 
     * @param contr The controller to use for all calls to other layers.
     */
    public View(Controller contr) {
        this.contr = contr;
        contr.addSaleObserver(new TotalRevenueView());
        contr.addSaleObserver(new TotalRevenueFileOutput());
    }

    /**
     * Performs a fake sale, by calling all system operations in the controller.
     */
    public void runFakeExecution() {
        contr.startSale();
        System.out.println("A new sale has been started.");
        try {
            contr.enterItem("identifier1");
            System.out.println("Added an item with identifier: identifier1");
        } catch (ItemNotFoundException e) {
            System.err.println("Could not find item");
        } catch (ServerDownException e) {
            System.err.println("The server is down right now, please try again later :)");
        }
        contr.pay(500, "SEK");
        System.out.println("A payment of 500 SEK was made");
    }
}