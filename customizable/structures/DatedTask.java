package customizable.structures;

import java.util.Date;

public class DatedTask extends DefaultTask implements Item {
    protected Date date;

    public DatedTask(String name, boolean priority, Date date) {
        super(name, priority);
        this.date = date;
    }

    @Override
    public void displayItem() {
        super.displayItem();
        System.out.println("Due Date: " + date);
    }
}
