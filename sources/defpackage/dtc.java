package defpackage;

import kotlin.jvm.internal.h;

/* renamed from: dtc  reason: default package */
public final class dtc {
    private final String a;
    private final String b;
    private final String c;
    private final String d;
    private final boolean e;
    private final long f;

    public dtc() {
        this(null, null, null, null, false, 0, 63);
    }

    public dtc(String str, String str2, String str3, String str4, boolean z, long j) {
        h.e(str, "episodeUri");
        h.e(str2, "episodeContextUri");
        h.e(str3, "episodeProvider");
        h.e(str4, "contextUri");
        this.a = str;
        this.b = str2;
        this.c = str3;
        this.d = str4;
        this.e = z;
        this.f = j;
    }

    public final String a() {
        return this.d;
    }

    public final String b() {
        return this.b;
    }

    public final String c() {
        return this.c;
    }

    public final String d() {
        return this.a;
    }

    public final long e() {
        return this.f;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof dtc)) {
            return false;
        }
        dtc dtc = (dtc) obj;
        return h.a(this.a, dtc.a) && h.a(this.b, dtc.b) && h.a(this.c, dtc.c) && h.a(this.d, dtc.d) && this.e == dtc.e && this.f == dtc.f;
    }

    public final boolean f() {
        return this.e;
    }

    public int hashCode() {
        String str = this.a;
        int i = 0;
        int hashCode = (str != null ? str.hashCode() : 0) * 31;
        String str2 = this.b;
        int hashCode2 = (hashCode + (str2 != null ? str2.hashCode() : 0)) * 31;
        String str3 = this.c;
        int hashCode3 = (hashCode2 + (str3 != null ? str3.hashCode() : 0)) * 31;
        String str4 = this.d;
        if (str4 != null) {
            i = str4.hashCode();
        }
        int i2 = (hashCode3 + i) * 31;
        boolean z = this.e;
        if (z) {
            z = true;
        }
        int i3 = z ? 1 : 0;
        int i4 = z ? 1 : 0;
        int i5 = z ? 1 : 0;
        return ((i2 + i3) * 31) + e.a(this.f);
    }

    public String toString() {
        StringBuilder V0 = je.V0("EpisodeCardState(episodeUri=");
        V0.append(this.a);
        V0.append(", episodeContextUri=");
        V0.append(this.b);
        V0.append(", episodeProvider=");
        V0.append(this.c);
        V0.append(", contextUri=");
        V0.append(this.d);
        V0.append(", isPlaying=");
        V0.append(this.e);
        V0.append(", progress=");
        return je.E0(V0, this.f, ")");
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ dtc(String str, String str2, String str3, String str4, boolean z, long j, int i) {
        this((i & 1) != 0 ? "" : null, (i & 2) != 0 ? "" : null, (i & 4) != 0 ? "" : null, (i & 8) != 0 ? "" : null, (i & 16) != 0 ? false : z, (i & 32) != 0 ? 0 : j);
    }
}
