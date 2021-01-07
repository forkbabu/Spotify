package com.google.common.escape;

public abstract class Escaper {
    protected Escaper() {
    }

    public abstract String escape(String str);
}
