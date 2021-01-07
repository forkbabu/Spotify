package defpackage;

import kotlin.jvm.internal.h;

/* renamed from: mpe  reason: default package */
public final class mpe {
    private long a;
    private final String b;
    private final lpe c;

    public mpe(String str, lpe lpe) {
        h.e(str, "serial");
        h.e(lpe, "event");
        this.b = str;
        this.c = lpe;
    }

    public final lpe a() {
        return this.c;
    }

    public final long b() {
        return this.a;
    }

    public final String c() {
        return this.b;
    }

    public final void d(long j) {
        this.a = j;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof mpe)) {
            return false;
        }
        mpe mpe = (mpe) obj;
        return h.a(this.b, mpe.b) && h.a(this.c, mpe.c);
    }

    public int hashCode() {
        String str = this.b;
        int i = 0;
        int hashCode = (str != null ? str.hashCode() : 0) * 31;
        lpe lpe = this.c;
        if (lpe != null) {
            i = lpe.hashCode();
        }
        return hashCode + i;
    }

    public String toString() {
        StringBuilder V0 = je.V0("RoomPitstopEvent(serial=");
        V0.append(this.b);
        V0.append(", event=");
        V0.append(this.c);
        V0.append(")");
        return V0.toString();
    }
}
