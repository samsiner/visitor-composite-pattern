package visitor;

import element.BadKid;
import element.GoodKid;

public class SantaClaus implements Visitor {

    private final String name;

    public SantaClaus(){
        name = "Santa Claus";
    }

    @Override
    public boolean visit(GoodKid kid) {
        kid.setPresentDescription("Star Wars Lego Set");
        kid.setHasPresent(true);
        return kid.hasPresent();
    }

    @Override
    public boolean visit(BadKid kid) {
        kid.setPresentDescription("coal");
        kid.setHasPresent(false);
        return kid.hasPresent();
    }

    @Override
    public String getName() {
        return name;
    }
}


