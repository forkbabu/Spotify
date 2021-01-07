package defpackage;

import defpackage.hud;
import kotlin.jvm.internal.h;

/* renamed from: lud  reason: default package */
public final class lud<T> {
    private final hud a;
    private final boolean b;
    private final iud<T> c;

    public lud() {
        this(null, false, null, 7);
    }

    public lud(hud hud, boolean z, iud<T> iud) {
        h.e(hud, "state");
        this.a = hud;
        this.b = z;
        this.c = iud;
    }

    public static lud a(lud lud, hud hud, boolean z, iud iud, int i) {
        if ((i & 1) != 0) {
            hud = lud.a;
        }
        if ((i & 2) != 0) {
            z = lud.b;
        }
        if ((i & 4) != 0) {
            iud = lud.c;
        }
        lud.getClass();
        h.e(hud, "state");
        return new lud(hud, z, iud);
    }

    public final iud<T> b() {
        return this.c;
    }

    public final hud c() {
        return this.a;
    }

    public final boolean d() {
        return this.b;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof lud)) {
            return false;
        }
        lud lud = (lud) obj;
        return h.a(this.a, lud.a) && this.b == lud.b && h.a(this.c, lud.c);
    }

    public int hashCode() {
        hud hud = this.a;
        int i = 0;
        int hashCode = (hud != null ? hud.hashCode() : 0) * 31;
        boolean z = this.b;
        if (z) {
            z = true;
        }
        int i2 = z ? 1 : 0;
        int i3 = z ? 1 : 0;
        int i4 = z ? 1 : 0;
        int i5 = (hashCode + i2) * 31;
        iud<T> iud = this.c;
        if (iud != null) {
            i = iud.hashCode();
        }
        return i5 + i;
    }

    public String toString() {
        StringBuilder V0 = je.V0("ObservableLoadableModel(state=");
        V0.append(this.a);
        V0.append(", isSubscribed=");
        V0.append(this.b);
        V0.append(", mostRecentNotification=");
        V0.append(this.c);
        V0.append(")");
        return V0.toString();
    }

    public lud(hud hud, boolean z, iud iud, int i) {
        hud.c cVar = (i & 1) != 0 ? hud.c.a : null;
        z = (i & 2) != 0 ? false : z;
        int i2 = i & 4;
        h.e(cVar, "state");
        this.a = cVar;
        this.b = z;
        this.c = null;
    }
}
