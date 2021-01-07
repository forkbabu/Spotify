package io.netty.util.internal.logging;

import io.netty.util.internal.r;
import java.io.Serializable;

public abstract class AbstractInternalLogger implements b, Serializable {
    private static final long serialVersionUID = -6382972526573193470L;
    private final String name;

    protected AbstractInternalLogger(String str) {
        if (str != null) {
            this.name = str;
            return;
        }
        throw new NullPointerException("name");
    }

    public String name() {
        return this.name;
    }

    /* access modifiers changed from: protected */
    public Object readResolve() {
        return c.b(this.name);
    }

    @Override // java.lang.Object
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(r.f(this));
        sb.append('(');
        return je.H0(sb, this.name, ')');
    }

    public boolean x(InternalLogLevel internalLogLevel) {
        int ordinal = internalLogLevel.ordinal();
        if (ordinal == 0) {
            return h();
        }
        if (ordinal == 1) {
            return c();
        }
        if (ordinal == 2) {
            return f();
        }
        if (ordinal == 3) {
            return a();
        }
        if (ordinal == 4) {
            return o();
        }
        throw new Error();
    }

    public void y(InternalLogLevel internalLogLevel, String str) {
        int ordinal = internalLogLevel.ordinal();
        if (ordinal == 0) {
            w(str);
        } else if (ordinal == 1) {
            p(str);
        } else if (ordinal == 2) {
            u(str);
        } else if (ordinal == 3) {
            v(str);
        } else if (ordinal == 4) {
            d(str);
        } else {
            throw new Error();
        }
    }
}
