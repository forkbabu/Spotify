package defpackage;

import kotlin.jvm.internal.h;

/* renamed from: i44  reason: default package */
public final class i44 extends v34 {
    private final h44 a;

    public i44(h44 h44) {
        super(null);
        this.a = h44;
    }

    public final h44 a() {
        return this.a;
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            return (obj instanceof i44) && h.a(this.a, ((i44) obj).a);
        }
        return true;
    }

    public int hashCode() {
        h44 h44 = this.a;
        if (h44 != null) {
            return h44.hashCode();
        }
        return 0;
    }

    public String toString() {
        StringBuilder V0 = je.V0("UserInfoReceived(user=");
        V0.append(this.a);
        V0.append(")");
        return V0.toString();
    }
}
