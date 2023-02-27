package customizable.structures;

public class DefaultTask implements Item {
    protected String name;
    protected boolean priority;

    public DefaultTask(String name, boolean priority) {
        this.name = name;
        this.priority = priority;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public boolean getPriority() {
        return priority;
    }

    public void setPriority(boolean priority) {
        this.priority = priority;
    }

    @Override
    public void displayItem() {
        System.out.println("Name: " + name);
        System.out.println("Priority: " + priority);
    }
}
