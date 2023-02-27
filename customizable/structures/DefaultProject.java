package customizable.structures;

import java.util.ArrayList;

public class DefaultProject {
    ArrayList<DefaultSection> sections = new ArrayList<>();
    String name;

    public DefaultProject(String name) {
        this.name = name;
    }

    public DefaultSection addSection (String name) {
        sections.add(new DefaultSection(name));
        return sections.get(sections.size() - 1);
    }

    public DefaultSection removeSection(int index) {
        return sections.remove(index);
    }

    public void addItem(int sectionIndex, String name, boolean priority) {
        sections.get(sectionIndex).addTask(name, priority);
    }

    public Item removeItem(int sectionIndex, int itemIndex) {
        return sections.get(sectionIndex).removeTask(itemIndex);
    }

    public ArrayList<DefaultSection> getSections() {
        return sections;
    }

    public void setSections(ArrayList<DefaultSection> sections) {
        this.sections = sections;
    }
}
