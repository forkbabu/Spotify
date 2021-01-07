package org.slf4j.helpers;

public abstract class MarkerIgnoringBase extends NamedLoggerBase implements xpf {
    private static final long serialVersionUID = 9044267456635152283L;

    @Override // org.slf4j.helpers.NamedLoggerBase, defpackage.xpf
    public String getName() {
        return this.name;
    }

    @Override // java.lang.Object
    public String toString() {
        return getClass().getName() + "(" + getName() + ")";
    }
}
