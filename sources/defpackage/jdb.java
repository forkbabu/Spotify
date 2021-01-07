package defpackage;

import java.util.Set;
import kotlin.jvm.internal.h;

/* renamed from: jdb  reason: default package */
public final class jdb {
    private final Set<Integer> a;
    private final int b;

    public jdb(Set<Integer> set, int i) {
        h.e(set, "selectedLines");
        this.a = set;
        this.b = i;
    }

    public final int a() {
        return this.b;
    }

    public final Set<Integer> b() {
        return this.a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof jdb)) {
            return false;
        }
        jdb jdb = (jdb) obj;
        return h.a(this.a, jdb.a) && this.b == jdb.b;
    }

    public int hashCode() {
        Set<Integer> set = this.a;
        return ((set != null ? set.hashCode() : 0) * 31) + this.b;
    }

    public String toString() {
        StringBuilder V0 = je.V0("LineSelectionEvent(selectedLines=");
        V0.append(this.a);
        V0.append(", countMax=");
        return je.B0(V0, this.b, ")");
    }
}
