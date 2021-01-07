package defpackage;

import kotlin.jvm.internal.h;

/* renamed from: o37  reason: default package */
public final class o37 {
    private final qyd a;
    private final onc b;
    private final boolean c;

    public o37(qyd qyd, onc onc, boolean z) {
        h.e(qyd, "showEntity");
        h.e(onc, "playerState");
        this.a = qyd;
        this.b = onc;
        this.c = z;
    }

    public final qyd a() {
        return this.a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof o37)) {
            return false;
        }
        o37 o37 = (o37) obj;
        return h.a(this.a, o37.a) && h.a(this.b, o37.b) && this.c == o37.c;
    }

    public int hashCode() {
        qyd qyd = this.a;
        int i = 0;
        int hashCode = (qyd != null ? qyd.hashCode() : 0) * 31;
        onc onc = this.b;
        if (onc != null) {
            i = onc.hashCode();
        }
        int i2 = (hashCode + i) * 31;
        boolean z = this.c;
        if (z) {
            z = true;
        }
        int i3 = z ? 1 : 0;
        int i4 = z ? 1 : 0;
        int i5 = z ? 1 : 0;
        return i2 + i3;
    }

    public String toString() {
        StringBuilder V0 = je.V0("FindInShowDataModel(showEntity=");
        V0.append(this.a);
        V0.append(", playerState=");
        V0.append(this.b);
        V0.append(", isOfflineEnabled=");
        return je.P0(V0, this.c, ")");
    }
}
