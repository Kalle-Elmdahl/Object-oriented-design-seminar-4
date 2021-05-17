package se.kth.iv1350.seminar4.integration;

import java.util.ArrayList;
import java.util.List;

import se.kth.iv1350.seminar4.DTO.*;
import se.kth.iv1350.seminar4.discount.DiscountFinder;


/**
 * DCHandler
 */
public class DCHandler {
    ArrayList<DiscountDTO> discounts = new ArrayList<DiscountDTO>();
    
    public DCHandler() {
        discounts.add(
            new DiscountDTO(.2, 200)
        );
        discounts.add(
            new DiscountDTO("identifier1", 10)
        );
        discounts.add(
            new DiscountDTO("identifier3", .1)
        );
    }
    
    public List<DiscountDTO> findDiscounts(SaleDTO saleDTO, DiscountFinder finder) {
        return finder.findDiscount(saleDTO, discounts);
    }    
}