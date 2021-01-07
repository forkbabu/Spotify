package defpackage;

import java.util.Map;
import kotlin.jvm.internal.h;

/* renamed from: ez0  reason: default package */
public final class ez0 extends gz0 {
    private final Map<String, Boolean> a;
    private final boolean b;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public ez0(Map<String, Boolean> map, boolean z) {
        super(null);
        h.e(map, "flags");
        this.a = map;
        this.b = z;
    }

    public final Map<String, Boolean> a() {
        return this.a;
    }

    public final boolean b() {
        return this.b;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ez0)) {
            return false;
        }
        ez0 ez0 = (ez0) obj;
        return h.a(this.a, ez0.a) && this.b == ez0.b;
    }

    public int hashCode() {
        Map<String, Boolean> map = this.a;
        int hashCode = (map != null ? map.hashCode() : 0) * 31;
        boolean z = this.b;
        if (z) {
            z = true;
        }
        int i = z ? 1 : 0;
        int i2 = z ? 1 : 0;
        int i3 = z ? 1 : 0;
        return hashCode + i;
    }

    public String toString() {
        StringBuilder V0 = je.V0("FeatureFlagExposure(flags=");
        V0.append(this.a);
        V0.append(", fromCache=");
        return je.P0(V0, this.b, ")");
    }
}
