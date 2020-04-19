package component;

public class Faculty implements CollegeComponent {

    private final String name;

    public Faculty(String name){
        this.name = name;
    }

    @Override
    public String getName() {
        return name;
    }
}
