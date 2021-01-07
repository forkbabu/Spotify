package com.google.android.gms.internal.measurement;

public class r4 {
    private volatile l5 a;
    private volatile zzgm b;

    static {
        u3.a();
    }

    private final l5 c(l5 l5Var) {
        if (this.a == null) {
            synchronized (this) {
                if (this.a == null) {
                    try {
                        this.a = l5Var;
                        this.b = zzgm.a;
                    } catch (zzig unused) {
                        this.a = l5Var;
                        this.b = zzgm.a;
                    }
                }
            }
        }
        return this.a;
    }

    public final l5 a(l5 l5Var) {
        l5 l5Var2 = this.a;
        this.b = null;
        this.a = l5Var;
        return l5Var2;
    }

    public final int b() {
        if (this.b != null) {
            return this.b.d();
        }
        if (this.a != null) {
            return this.a.c();
        }
        return 0;
    }

    public final zzgm d() {
        if (this.b != null) {
            return this.b;
        }
        synchronized (this) {
            if (this.b != null) {
                return this.b;
            }
            if (this.a == null) {
                this.b = zzgm.a;
            } else {
                this.b = this.a.b();
            }
            return this.b;
        }
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof r4)) {
            return false;
        }
        r4 r4Var = (r4) obj;
        l5 l5Var = this.a;
        l5 l5Var2 = r4Var.a;
        if (l5Var == null && l5Var2 == null) {
            return d().equals(r4Var.d());
        }
        if (l5Var != null && l5Var2 != null) {
            return l5Var.equals(l5Var2);
        }
        if (l5Var != null) {
            return l5Var.equals(r4Var.c(l5Var.j()));
        }
        return c(l5Var2.j()).equals(l5Var2);
    }

    public int hashCode() {
        return 1;
    }
}
