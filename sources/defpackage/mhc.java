package defpackage;

import kotlin.jvm.internal.h;

/* renamed from: mhc  reason: default package */
public final class mhc {
    private final String a;
    private final int b;

    public mhc(String str, int i) {
        h.e(str, "episodeUri");
        this.a = str;
        this.b = i;
    }

    public final String a() {
        return this.a;
    }

    public final int b() {
        return this.b;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof mhc)) {
            return false;
        }
        mhc mhc = (mhc) obj;
        return h.a(this.a, mhc.a) && this.b == mhc.b;
    }

    public int hashCode() {
        String str = this.a;
        return ((str != null ? str.hashCode() : 0) * 31) + this.b;
    }

    public String toString() {
        StringBuilder V0 = je.V0("RowClickModel(episodeUri=");
        V0.append(this.a);
        V0.append(", index=");
        return je.B0(V0, this.b, ")");
    }
}
