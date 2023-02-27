package customizable.structures;

import java.util.ArrayList;
import java.util.Date;

public class DefaultSection implements Item {
    protected String name;
    protected ArrayList<Item> items = new ArrayList<>();

    public DefaultSection(String name) {
        this.name = name;
    }

    public void addTask(String name, boolean priority) {
        items.add(new DefaultTask(name, priority));
    }

    public void addTask(String name, boolean priority, Date date) {
        items.add(new DatedTask(name, priority, date));
    }

    public Item removeTask(int index) {
        return items.remove(index);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public ArrayList<Item> getItems() {
        return items;
    }

    public void setItems(ArrayList<Item> tasks) {
        this.items = tasks;
    }

    @Override
    public void displayItem() {

    }
}
