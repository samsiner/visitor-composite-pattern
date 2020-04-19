package element;

import visitor.Visitor;

public interface Kid {
    boolean accept(Visitor v);
    String getName();
    void setPresentDescription(String description);
    String getPresentDescription();
    boolean hasPresent();
    void setHasPresent(boolean b);
}
