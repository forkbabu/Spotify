package defpackage;

import java.util.List;
import kotlin.jvm.internal.h;

/* renamed from: m25  reason: default package */
public final class m25 {
    private final boolean a;
    private final List<b35> b;

    public m25(boolean z, List<b35> list) {
        h.e(list, "tracks");
        this.a = z;
        this.b = list;
    }

    public final List<b35> a() {
        return this.b;
    }

    public final boolean b() {
        return this.a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof m25)) {
            return false;
        }
        m25 m25 = (m25) obj;
        return this.a == m25.a && h.a(this.b, m25.b);
    }

    public int hashCode() {
        boolean z = this.a;
        if (z) {
            z = true;
        }
        int i = z ? 1 : 0;
        int i2 = z ? 1 : 0;
        int i3 = z ? 1 : 0;
        int i4 = i * 31;
        List<b35> list = this.b;
        return i4 + (list != null ? list.hashCode() : 0);
    }

    public String toString() {
        StringBuilder V0 = je.V0("EntityHighlightState(isEntityLoadedInPlayer=");
        V0.append(this.a);
        V0.append(", tracks=");
        return je.L0(V0, this.b, ")");
    }
}
