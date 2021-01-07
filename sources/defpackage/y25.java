package defpackage;

import java.util.List;
import kotlin.jvm.internal.h;

/* access modifiers changed from: package-private */
/* renamed from: y25  reason: default package */
public final class y25 {
    private final int a;
    private final int b;
    private final List<p25> c;

    /* JADX DEBUG: Multi-variable search result rejected for r4v0, resolved type: java.util.List<? extends p25> */
    /* JADX WARN: Multi-variable type inference failed */
    public y25(int i, int i2, List<? extends p25> list) {
        h.e(list, "updatedItems");
        this.a = i;
        this.b = i2;
        this.c = list;
    }

    public final int a() {
        return this.a;
    }

    public final int b() {
        return this.b;
    }

    public final List<p25> c() {
        return this.c;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof y25)) {
            return false;
        }
        y25 y25 = (y25) obj;
        return this.a == y25.a && this.b == y25.b && h.a(this.c, y25.c);
    }

    public int hashCode() {
        int i = ((this.a * 31) + this.b) * 31;
        List<p25> list = this.c;
        return i + (list != null ? list.hashCode() : 0);
    }

    public String toString() {
        StringBuilder V0 = je.V0("RemoveArtistRecResult(followRecsItemPosition=");
        V0.append(this.a);
        V0.append(", removedArtistPosition=");
        V0.append(this.b);
        V0.append(", updatedItems=");
        return je.L0(V0, this.c, ")");
    }
}
