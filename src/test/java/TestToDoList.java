import com.applicationLogic.CannotDeleteFromEmptyList;
import com.applicationLogic.Item;
import com.applicationLogic.ToDoList;
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
    public void testGetListSize(){
        Item item1 = new Item();
        list.addItem(item1);
        assertEquals(1, list.getSize());
    }


    @Test
    public void testAddAndGetItem(){
        Item item1 = new Item();
        list.addItem(item1);
        assertTrue(item1.equals(list.getItem(0)));

        Item item2 = new Item();
        list.addItem(item2);
        assertTrue(item2.equals(list.getItem(1)));
    }

    @Test
    public void testDeleteByIndex(){
        Item item1 = new Item();
        list.addItem(item1);
        list.deleteItem(0);
        assertEquals(0, list.getSize());
    }

    @Test(expected = CannotDeleteFromEmptyList.class)
    public void testCannotDeleteFromEmptyList(){
        list.deleteItem(0);
    }

}
