package defpackage;

import kotlin.jvm.internal.h;

/* renamed from: kz0  reason: default package */
public final class kz0 extends gz0 {
    private final String a;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public kz0(String str) {
        super(null);
        h.e(str, "name");
        this.a = str;
    }

    public final String a() {
        return this.a;
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            return (obj instanceof kz0) && h.a(this.a, ((kz0) obj).a);
        }
        return true;
    }

    public int hashCode() {
        String str = this.a;
        if (str != null) {
            return str.hashCode();
        }
        return 0;
    }

    public String toString() {
        return je.I0(je.V0("SicComponentExposure(name="), this.a, ")");
    }
}
