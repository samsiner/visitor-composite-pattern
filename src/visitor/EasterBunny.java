package visitor;

import element.BadKid;
import element.GoodKid;

public class EasterBunny implements Visitor {

    private final String name;

    public EasterBunny(){
        name = "Easter Bunny";
    }

    @Override
    public boolean visit(GoodKid kid) {
        kid.setPresentDescription("Really Nice Easter Egg");
        kid.setHasPresent(true);
        return kid.hasPresent();
    }

    @Override
    public boolean visit(BadKid kid) {
        kid.setPresentDescription("Crappy Easter Egg");
        kid.setHasPresent(true);
        return kid.hasPresent();
    }

    @Override
    public String getName() {
        return name;
    }
}

