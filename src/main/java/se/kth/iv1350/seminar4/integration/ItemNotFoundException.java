package se.kth.iv1350.seminar4.integration;

/**
 * ItemNotFoundException This exception is called when the external inventory system can not find the sent identifier
 */
public class ItemNotFoundException extends Exception {
    public ItemNotFoundException(String message) {
        super(message);
    }
}