package defpackage;

import java.util.Map;
import kotlin.jvm.internal.h;

/* renamed from: gh0  reason: default package */
public final class gh0 {
    private final int a;
    private final int b;

    public gh0(int i, int i2) {
        this.a = i;
        this.b = i2;
    }

    public final void a(Map<String, String> map) {
        h.e(map, "map");
        map.put("start", String.valueOf(this.a));
        map.put("length", String.valueOf(this.b));
    }

    public final int b() {
        return this.a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof gh0)) {
            return false;
        }
        gh0 gh0 = (gh0) obj;
        return this.a == gh0.a && this.b == gh0.b;
    }

    public int hashCode() {
        return (this.a * 31) + this.b;
    }

    public String toString() {
        StringBuilder V0 = je.V0("Range(start=");
        V0.append(this.a);
        V0.append(", length=");
        return je.B0(V0, this.b, ")");
    }
}
