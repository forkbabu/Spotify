package com.google.firebase.components;

public class o {
    private final Class<?> a;
    private final boolean b;

    o(Class cls, boolean z, m mVar) {
        this.a = cls;
        this.b = z;
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof o)) {
            return false;
        }
        o oVar = (o) obj;
        if (!oVar.a.equals(this.a) || oVar.b != this.b) {
            return false;
        }
        return true;
    }

    public int hashCode() {
        return ((this.a.hashCode() ^ 1000003) * 1000003) ^ Boolean.valueOf(this.b).hashCode();
    }
}
