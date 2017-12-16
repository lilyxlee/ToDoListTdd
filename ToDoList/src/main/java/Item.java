/**
 * Created by Sarah on 16/12/2017.
 */
public class Item {
    private String description;

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == this)
            return true;
        if (!(obj instanceof Item))
            return false;
        return  (((Item) obj).getDescription().equals(description)) ? true : false ;
    }

    @Override
    public int hashCode() {
        return super.hashCode() + description.hashCode();
    }
}
