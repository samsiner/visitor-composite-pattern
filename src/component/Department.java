package component;

import java.util.ArrayList;

public class Department implements CollegeComponent {

    private final String name;
    private final ArrayList<CollegeComponent> collegeComponents;

    public Department(String name){
        this.name = name;
        collegeComponents = new ArrayList<>();
    }

    @Override
    public String getName() {
        return name;
    }

    public void addCollegeComponent(CollegeComponent c){
        collegeComponents.add(c);
    }

    public boolean removeCollegeComponent(String name){
        for (CollegeComponent c: collegeComponents){
            if (c.getName().equals(name)){
                collegeComponents.remove(c);
                return true;
            }
        }
        return false;
    }

    public ArrayList<CollegeComponent> getCollegeComponents(){
        return collegeComponents;
    }
}
