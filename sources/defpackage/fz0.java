package defpackage;

import java.util.Map;
import kotlin.jvm.internal.h;

/* renamed from: fz0  reason: default package */
public final class fz0 extends gz0 {
    private final Map<String, Boolean> a;

    public fz0(Map<String, Boolean> map) {
        super(null);
        this.a = map;
    }

    public final Map<String, Boolean> a() {
        return this.a;
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            return (obj instanceof fz0) && h.a(this.a, ((fz0) obj).a);
        }
        return true;
    }

    public int hashCode() {
        Map<String, Boolean> map = this.a;
        if (map != null) {
            return map.hashCode();
        }
        return 0;
    }

    public String toString() {
        return je.M0(je.V0("FeatureFlagFallback(flags="), this.a, ")");
    }
}
