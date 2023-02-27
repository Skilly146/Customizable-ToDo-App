package customizable.structures;

public class Demo {
    public static void main(String[] args) {
        DefaultProject obj = new DefaultProject("Essay");
        obj.addSection("Research");
        obj.addItem(0, "Decide Topic", true);
        Item task = obj.getSections().get(0).getItems().get(0);
        task.displayItem();
    }
}
