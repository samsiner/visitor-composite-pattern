package visitor;

import element.BadKid;
import element.GoodKid;

public interface Visitor {
    boolean visit(GoodKid kid);
    boolean visit(BadKid kid);
    String getName();
}
