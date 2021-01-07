package com.google.firebase.components;

public final class p {
    private final Class<?> a;
    private final int b;
    private final int c;

    private p(Class<?> cls, int i, int i2) {
        if (cls != null) {
            this.a = cls;
            this.b = i;
            this.c = i2;
            return;
        }
        throw new NullPointerException("Null dependency anInterface.");
    }

    public static p e(Class<?> cls) {
        return new p(cls, 0, 0);
    }

    public static p f(Class<?> cls) {
        return new p(cls, 1, 0);
    }

    public static p g(Class<?> cls) {
        return new p(cls, 2, 0);
    }

    public Class<?> a() {
        return this.a;
    }

    public boolean b() {
        return this.c == 0;
    }

    public boolean c() {
        return this.b == 1;
    }

    public boolean d() {
        return this.b == 2;
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof p)) {
            return false;
        }
        p pVar = (p) obj;
        if (this.a == pVar.a && this.b == pVar.b && this.c == pVar.c) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        return ((((this.a.hashCode() ^ 1000003) * 1000003) ^ this.b) * 1000003) ^ this.c;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("Dependency{anInterface=");
        sb.append(this.a);
        sb.append(", type=");
        int i = this.b;
        boolean z = true;
        sb.append(i == 1 ? "required" : i == 0 ? "optional" : "set");
        sb.append(", direct=");
        if (this.c != 0) {
            z = false;
        }
        return je.P0(sb, z, "}");
    }
}
