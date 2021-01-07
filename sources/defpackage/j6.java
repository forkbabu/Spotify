package defpackage;

import android.os.Bundle;

/* renamed from: j6  reason: default package */
public final class j6 {
    private final Bundle a;
    private m6 b;

    public j6(m6 m6Var, boolean z) {
        if (m6Var != null) {
            Bundle bundle = new Bundle();
            this.a = bundle;
            this.b = m6Var;
            bundle.putBundle("selector", m6Var.a());
            bundle.putBoolean("activeScan", z);
            return;
        }
        throw new IllegalArgumentException("selector must not be null");
    }

    private void b() {
        if (this.b == null) {
            m6 c = m6.c(this.a.getBundle("selector"));
            this.b = c;
            if (c == null) {
                this.b = m6.c;
            }
        }
    }

    public Bundle a() {
        return this.a;
    }

    public m6 c() {
        b();
        return this.b;
    }

    public boolean d() {
        return this.a.getBoolean("activeScan");
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof j6)) {
            return false;
        }
        j6 j6Var = (j6) obj;
        b();
        m6 m6Var = this.b;
        j6Var.b();
        if (!m6Var.equals(j6Var.b) || d() != j6Var.d()) {
            return false;
        }
        return true;
    }

    public int hashCode() {
        b();
        return this.b.hashCode() ^ d();
    }

    public String toString() {
        StringBuilder V0 = je.V0("DiscoveryRequest{ selector=");
        b();
        V0.append(this.b);
        V0.append(", activeScan=");
        V0.append(d());
        V0.append(", isValid=");
        b();
        m6 m6Var = this.b;
        m6Var.b();
        return je.P0(V0, !m6Var.b.contains(null), " }");
    }
}
