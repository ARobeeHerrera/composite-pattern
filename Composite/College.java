package Composite;

import Interface.EducationalComponent;
import java.util.ArrayList;
import java.util.List;

public class College implements EducationalComponent {
    private String name;
    private List<EducationalComponent> components = new ArrayList<>();

    public College(String name) {
        this.name = name;
    }

    public void add(EducationalComponent component) {
        components.add(component);
    }

    public void remove(EducationalComponent component) {
        components.remove(component);
    }

    @Override
    public int getNumberOfStudents() {
        int total = 0;
        for (EducationalComponent component : components) {
            total += component.getNumberOfStudents();
        }
        return total;
    }

    @Override
    public double getBudget() {
        double total = 0;
        for (EducationalComponent component : components) {
            total += component.getBudget();
        }
        return total;
    }

    @Override
    public void displayDetails() {
        System.out.println("College: " + name);
        for (EducationalComponent component : components) {
            component.displayDetails();
        }
    }
}
