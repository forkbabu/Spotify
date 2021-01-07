package com.google.android.gms.internal.cast;

public class e6 {
    private volatile z6 a;
    private volatile zzlb b;

    static {
        j5.a();
    }

    private final z6 a(z6 z6Var) {
        if (this.a == null) {
            synchronized (this) {
                if (this.a == null) {
                    try {
                        this.a = z6Var;
                        this.b = zzlb.a;
                    } catch (zzmo unused) {
                        this.a = z6Var;
                        this.b = zzlb.a;
                    }
                }
            }
        }
        return this.a;
    }

    public final z6 b(z6 z6Var) {
        z6 z6Var2 = this.a;
        this.b = null;
        this.a = z6Var;
        return z6Var2;
    }

    public final zzlb c() {
        if (this.b != null) {
            return this.b;
        }
        synchronized (this) {
            if (this.b != null) {
                return this.b;
            }
            if (this.a == null) {
                this.b = zzlb.a;
            } else {
                this.b = this.a.f();
            }
            return this.b;
        }
    }

    public final int d() {
        if (this.b != null) {
            return this.b.size();
        }
        if (this.a != null) {
            return this.a.e();
        }
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof e6)) {
            return false;
        }
        e6 e6Var = (e6) obj;
        z6 z6Var = this.a;
        z6 z6Var2 = e6Var.a;
        if (z6Var == null && z6Var2 == null) {
            return c().equals(e6Var.c());
        }
        if (z6Var != null && z6Var2 != null) {
            return z6Var.equals(z6Var2);
        }
        if (z6Var != null) {
            return z6Var.equals(e6Var.a(z6Var.c()));
        }
        return a(z6Var2.c()).equals(z6Var2);
    }

    public int hashCode() {
        return 1;
    }
}
