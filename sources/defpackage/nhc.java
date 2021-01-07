package defpackage;

import kotlin.jvm.internal.h;

/* renamed from: nhc  reason: default package */
public final class nhc {
    private final String a;
    private final String b;
    private final boolean c;
    private final int d;
    private final boolean e;

    public nhc(String str, String str2, boolean z, int i, boolean z2) {
        h.e(str, "episodeName");
        h.e(str2, "episodeUri");
        this.a = str;
        this.b = str2;
        this.c = z;
        this.d = i;
        this.e = z2;
    }

    public final boolean a() {
        return this.c;
    }

    public final String b() {
        return this.a;
    }

    public final String c() {
        return this.b;
    }

    public final int d() {
        return this.d;
    }

    public final boolean e() {
        return this.e;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof nhc)) {
            return false;
        }
        nhc nhc = (nhc) obj;
        return h.a(this.a, nhc.a) && h.a(this.b, nhc.b) && this.c == nhc.c && this.d == nhc.d && this.e == nhc.e;
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
        int i3 = 1;
        if (z) {
            z = true;
        }
        int i4 = z ? 1 : 0;
        int i5 = z ? 1 : 0;
        int i6 = z ? 1 : 0;
        int i7 = (((i2 + i4) * 31) + this.d) * 31;
        boolean z2 = this.e;
        if (!z2) {
            i3 = z2 ? 1 : 0;
        }
        return i7 + i3;
    }

    public String toString() {
        StringBuilder V0 = je.V0("RowLongClickModel(episodeName=");
        V0.append(this.a);
        V0.append(", episodeUri=");
        V0.append(this.b);
        V0.append(", canDownloadEpisode=");
        V0.append(this.c);
        V0.append(", index=");
        V0.append(this.d);
        V0.append(", isVideo=");
        return je.P0(V0, this.e, ")");
    }
}
