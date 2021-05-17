package se.kth.iv1350.seminar4.DTO;

/**
 * DiscountDTO
 */
public class DiscountDTO {
    private final String type;
    private String idOfDiscountedItem;
    private double amount;
    private double minRequiredPrice;

    public DiscountDTO(String idOfDiscountedItem, double amount) {
        type = "item";
        this.idOfDiscountedItem = idOfDiscountedItem;
        this.amount = amount;
    }

    public DiscountDTO(double amount, double minRequiredPrice) {
        type = "sale";
        this.amount = amount;
        this.minRequiredPrice = minRequiredPrice;
    }

    public String getType() {
        return this.type;
    }

    public String getIdOfDiscountedItem() {
        return this.idOfDiscountedItem;
    }

    public double getAmount() {
        return this.amount;
    }

    public double getMinRequiredPrice() {
        return this.minRequiredPrice;
    }
}