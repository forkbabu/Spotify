package defpackage;

import kotlin.jvm.internal.h;

/* renamed from: c35  reason: default package */
public final class c35 {
    private final String a;
    private final String b;
    private final boolean c;

    public c35() {
        this.a = null;
        this.b = null;
        this.c = false;
    }

    public final String a() {
        return this.b;
    }

    public final boolean b() {
        return this.c;
    }

    public final String c() {
        return this.a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof c35)) {
            return false;
        }
        c35 c35 = (c35) obj;
        return h.a(this.a, c35.a) && h.a(this.b, c35.b) && this.c == c35.c;
    }

    public int hashCode() {
        String str = this.a;
        int i = 0;
        int hashCode = (str != null ? str.hashCode() : 0) * 31;
        String str2 = this.b;
        if (str2 != null) {
            i = str2.hashCode();
        }
        int i2 = (hashCode + i) * 31;
        boolean z = this.c;
        if (z) {
            z = true;
        }
        int i3 = z ? 1 : 0;
        int i4 = z ? 1 : 0;
        int i5 = z ? 1 : 0;
        return i2 + i3;
    }

    public String toString() {
        StringBuilder V0 = je.V0("TrackPlaybackState(trackUri=");
        V0.append(this.a);
        V0.append(", albumUri=");
        V0.append(this.b);
        V0.append(", playing=");
        return je.P0(V0, this.c, ")");
    }

    public c35(String str, String str2, boolean z) {
        this.a = str;
        this.b = str2;
        this.c = z;
    }
}
