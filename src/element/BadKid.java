package element;

import visitor.Visitor;

public class BadKid implements Kid{

    private final String name;
    private String presentDescription;
    private boolean hasPresent;

    public BadKid(String name){
        this.name = name;
    }

    @Override
    public boolean accept(Visitor v) {
        return v.visit(this);
    }

    @Override
    public String getPresentDescription() {
        return presentDescription;
    }

    @Override
    public void setPresentDescription(String presentDescription) {
        this.presentDescription = presentDescription;
    }

    @Override
    public boolean hasPresent() {
        return hasPresent;
    }

    @Override
    public void setHasPresent(boolean gotPresent) {
        this.hasPresent = gotPresent;
    }

    @Override
    public String getName() {
        return name;
    }
}
