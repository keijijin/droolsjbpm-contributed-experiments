package org.drools.clips.functions;

public class MoreThanFunction  extends BaseInfixFunction  {
    private static final String name = ">";
    private static final String mappedSymbol = ">";

    public String getName() {
        return name;
    }
    
    public String getMappedSymbol() {
        return mappedSymbol;
    }    
}
