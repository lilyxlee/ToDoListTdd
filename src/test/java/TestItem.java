import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

/**
 * Created by Sarah on 16/12/2017.
 */
public class TestItem {
    private String desc = "item description";

    @Test
    public void testSetAndGetItemDescription(){
        Item item = new Item();
        item.setDescription(desc);
        assertEquals("Incorrect Description", desc, item.getDescription());
    }

    @Test
    public void testItemEquals(){
        Item item1 = new Item();
        item1.setDescription(desc);

        Item item2 = new Item();
        item2.setDescription(desc);

        assertTrue(item1.equals(item2));
        assertTrue(item1.hashCode() == item2.hashCode());
    }

    @Test
    public void testTtemMarkedAsDone(){
        Item item = new Item();
        item.setDescription(desc);
        item.setDone();
        assertTrue(item.isDone());
    }

}
