package defpackage;

import kotlin.jvm.internal.h;

/* renamed from: wg7  reason: default package */
public final class wg7 extends fg7 {
    private final String a;
    private final boolean b;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public wg7(String str, boolean z) {
        super(null);
        h.e(str, "showUri");
        this.a = str;
        this.b = z;
    }

    public final boolean a() {
        return this.b;
    }

    public final String b() {
        return this.a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof wg7)) {
            return false;
        }
        wg7 wg7 = (wg7) obj;
        return h.a(this.a, wg7.a) && this.b == wg7.b;
    }

    public int hashCode() {
        String str = this.a;
        int hashCode = (str != null ? str.hashCode() : 0) * 31;
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
        StringBuilder V0 = je.V0("UpdateOptInState(showUri=");
        V0.append(this.a);
        V0.append(", optingIn=");
        return je.P0(V0, this.b, ")");
    }
}
