package defpackage;

import kotlin.jvm.internal.h;

/* renamed from: x34  reason: default package */
public final class x34 {
    private final h44 a;
    private final boolean b;

    public x34() {
        this.a = null;
        this.b = false;
    }

    public static x34 a(x34 x34, h44 h44, boolean z, int i) {
        if ((i & 1) != 0) {
            h44 = x34.a;
        }
        if ((i & 2) != 0) {
            z = x34.b;
        }
        return new x34(h44, z);
    }

    public final boolean b() {
        return this.b;
    }

    public final h44 c() {
        return this.a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof x34)) {
            return false;
        }
        x34 x34 = (x34) obj;
        return h.a(this.a, x34.a) && this.b == x34.b;
    }

    public int hashCode() {
        h44 h44 = this.a;
        int hashCode = (h44 != null ? h44.hashCode() : 0) * 31;
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
        StringBuilder V0 = je.V0("BlendInvitationModel(user=");
        V0.append(this.a);
        V0.append(", linkExpired=");
        return je.P0(V0, this.b, ")");
    }

    public x34(h44 h44, boolean z) {
        this.a = h44;
        this.b = z;
    }

    public x34(h44 h44, boolean z, int i) {
        int i2 = i & 1;
        z = (i & 2) != 0 ? false : z;
        this.a = null;
        this.b = z;
    }
}
