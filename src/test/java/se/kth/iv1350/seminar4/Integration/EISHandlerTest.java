package se.kth.iv1350.seminar4.Integration;

import org.junit.Before;
import org.junit.After;
import org.junit.Test;

import se.kth.iv1350.seminar4.DTO.*;
import se.kth.iv1350.seminar4.integration.EISHandler;

import static org.junit.Assert.assertEquals;

public class EISHandlerTest {
    private EISHandler instance;

    @Before
    public void setUp() {
        instance = new EISHandler();

    }

    @After
    public void tearDown() {
        instance = null;
    }

    @Test
    public void testFindItem() {
        ItemDTO itemWithIdentifierTwo = new ItemDTO(
            "Ingredienser\n\nINGREDIENSER: Ekologiska skalade och k rossade tomater 65% (Portugal), ekologisk tomatjuice (tomat: Portugal), surhetsreglerandemedel (E 330 citronsyra). *KRAV-ekologisk ingrediens. KRAV-märkningen verifieras av Kiwa.\nFörvaring\n\nFörvaras vid högst 40°C\nÖvrigt\n\nEAN kod: 7340011491996", 
            12, 
            13.50, 
            "Tomater Krossade EKO", 
            "identifier2"
        );
        ItemDTO foundItem = instance.findItem("identifier2");
        assertEquals("Find item did not find correct item", foundItem.getName(), itemWithIdentifierTwo.getName());
        assertEquals("Find item did not find correct item", foundItem.getVAT(), itemWithIdentifierTwo.getVAT(), .01);
        assertEquals("Find item did not find correct item", foundItem.getPrice(), itemWithIdentifierTwo.getPrice(), .01);
        assertEquals("Find item did not find correct item", foundItem.getDescription(), itemWithIdentifierTwo.getDescription());
        assertEquals("Find item did not find correct item", foundItem.getIdentifier(), itemWithIdentifierTwo.getIdentifier());
    }
}