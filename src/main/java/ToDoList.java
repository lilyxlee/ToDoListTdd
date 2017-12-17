import java.util.ArrayList;
import java.util.List;

/**
 * Created by Sarah on 16/12/2017.
 */
public class ToDoList {

    private String title;
    private List<Item> listOfItems = new ArrayList<>();

    public void addTitle(String title) {
        this.title = title;
    }

    public String getTitle() {
        return title;
    }

    public void addItem(Item item) {
        listOfItems.add(item);
    }

    public Item getItem(int index) {
        return listOfItems.get(index);
    }

    public int getSize() {
        return listOfItems.size();
    }

    public void deleteItem(int index) {
        if (listOfItems.isEmpty())
            throw new CannotDeleteFromEmptyList();
        listOfItems.remove(index);
    }


}

