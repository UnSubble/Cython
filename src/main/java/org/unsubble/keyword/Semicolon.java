package org.unsubble.keyword;

public class Semicolon implements Keyword{
    private String value;

    @Override
    public void setValue(String value) {
        this.value = value;
    }

    @Override
    public String getValue() {
        return value;
    }

    @Override
    public String getKeyword() {
        return ";";
    }
}
