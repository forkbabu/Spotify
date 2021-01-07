package org.slf4j.helpers;

import java.io.Serializable;

/* access modifiers changed from: package-private */
public abstract class NamedLoggerBase implements xpf, Serializable {
    private static final long serialVersionUID = 7535258609338176893L;
    protected String name;

    NamedLoggerBase() {
    }

    @Override // defpackage.xpf
    public String getName() {
        return this.name;
    }

    /* access modifiers changed from: protected */
    public Object readResolve() {
        return ypf.e(getName());
    }
}
