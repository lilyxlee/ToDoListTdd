import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertTrue;

/**
 * Created by Sarah on 16/12/2017.
 */
public class TestToDoList {
    private ToDoList list;

    @Before
    public void setUp(){
        list = new  ToDoList();
    }

    @Test
    public void testAddToDoListTitle(){
        String title = "title";
        list.addTitle(title);
        assertNotNull("title is not set", list.getTitle());
        assertEquals("title is not set correctly", title, list.getTitle());
    }

    @Test
    public void testAddAndGetItem(){
        Item item = new Item();
        list.addItem(item);
        assertTrue(item.equals(list.getItem(0)));
    }

}
