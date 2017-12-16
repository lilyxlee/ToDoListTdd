import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Created by Sarah on 16/12/2017.
 */
public class TestItem {
    private String desc = "item description";

    @Test
    public void testGetItemDescription(){
        Item item = new Item();
        item.setDescription(desc);
        assertEquals("Incorrect Description", desc, item.getDescription());
    }

}
