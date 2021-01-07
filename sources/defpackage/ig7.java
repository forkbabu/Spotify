package defpackage;

import kotlin.jvm.internal.h;

/* renamed from: ig7  reason: default package */
public final class ig7 {
    private final boolean a;
    private final boolean b;
    private final eg7 c;
    private final rg7 d;

    public ig7() {
        this(false, false, null, null, 15);
    }

    public ig7(boolean z, boolean z2, eg7 eg7, rg7 rg7) {
        h.e(eg7, "notificationOptInState");
        h.e(rg7, "showMetadata");
        this.a = z;
        this.b = z2;
        this.c = eg7;
        this.d = rg7;
    }

    public static ig7 a(ig7 ig7, boolean z, boolean z2, eg7 eg7, rg7 rg7, int i) {
        if ((i & 1) != 0) {
            z = ig7.a;
        }
        if ((i & 2) != 0) {
            z2 = ig7.b;
        }
        if ((i & 4) != 0) {
            eg7 = ig7.c;
        }
        rg7 rg72 = (i & 8) != 0 ? ig7.d : null;
        ig7.getClass();
        h.e(eg7, "notificationOptInState");
        h.e(rg72, "showMetadata");
        return new ig7(z, z2, eg7, rg72);
    }

    public final eg7 b() {
        return this.c;
    }

    public final rg7 c() {
        return this.d;
    }

    public final boolean d() {
        return this.a;
    }

    public final boolean e() {
        return this.b;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ig7)) {
            return false;
        }
        ig7 ig7 = (ig7) obj;
        return this.a == ig7.a && this.b == ig7.b && h.a(this.c, ig7.c) && h.a(this.d, ig7.d);
    }

    public int hashCode() {
        boolean z = this.a;
        int i = 1;
        if (z) {
            z = true;
        }
        int i2 = z ? 1 : 0;
        int i3 = z ? 1 : 0;
        int i4 = z ? 1 : 0;
        int i5 = i2 * 31;
        boolean z2 = this.b;
        if (!z2) {
            i = z2 ? 1 : 0;
        }
        int i6 = (i5 + i) * 31;
        eg7 eg7 = this.c;
        int i7 = 0;
        int hashCode = (i6 + (eg7 != null ? eg7.hashCode() : 0)) * 31;
        rg7 rg7 = this.d;
        if (rg7 != null) {
            i7 = rg7.hashCode();
        }
        return hashCode + i7;
    }

    public String toString() {
        StringBuilder V0 = je.V0("NotificationsBottomDrawerModel(systemPermissionEnabled=");
        V0.append(this.a);
        V0.append(", isOnline=");
        V0.append(this.b);
        V0.append(", notificationOptInState=");
        V0.append(this.c);
        V0.append(", showMetadata=");
        V0.append(this.d);
        V0.append(")");
        return V0.toString();
    }

    public ig7(boolean z, boolean z2, eg7 eg7, rg7 rg7, int i) {
        z = (i & 1) != 0 ? true : z;
        z2 = (i & 2) != 0 ? true : z2;
        bg7 bg7 = (i & 4) != 0 ? bg7.a : null;
        rg7 = (i & 8) != 0 ? new rg7("", "") : rg7;
        h.e(bg7, "notificationOptInState");
        h.e(rg7, "showMetadata");
        this.a = z;
        this.b = z2;
        this.c = bg7;
        this.d = rg7;
    }
}
