package defpackage;

import defpackage.ej9;

/* access modifiers changed from: package-private */
/* renamed from: xi9  reason: default package */
public final class xi9 extends ej9.a {
    private final String a;

    xi9(String str) {
        if (str != null) {
            this.a = str;
            return;
        }
        throw new NullPointerException("Null pageUri");
    }

    @Override // defpackage.ej9.a
    public String b() {
        return this.a;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof ej9.a) {
            return this.a.equals(((ej9.a) obj).b());
        }
        return false;
    }

    public int hashCode() {
        return this.a.hashCode() ^ 1000003;
    }

    public String toString() {
        return je.I0(je.V0("LoadingStarted{pageUri="), this.a, "}");
    }
}
