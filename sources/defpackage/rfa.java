package defpackage;

import kotlin.jvm.internal.h;

/* renamed from: rfa  reason: default package */
public final class rfa {
    private final String a;
    private final String b;
    private final String c;
    private final boolean d;
    private final boolean e;
    private final boolean f;

    public rfa(String str, String str2, String str3, boolean z, boolean z2, boolean z3) {
        je.x(str, "trackUri", str2, "trackName", str3, "previewId");
        this.a = str;
        this.b = str2;
        this.c = str3;
        this.d = z;
        this.e = z2;
        this.f = z3;
    }

    public final String a() {
        return this.c;
    }

    public final String b() {
        return this.b;
    }

    public final String c() {
        return this.a;
    }

    public final boolean d() {
        return this.e;
    }

    public final boolean e() {
        return this.d;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof rfa)) {
            return false;
        }
        rfa rfa = (rfa) obj;
        return h.a(this.a, rfa.a) && h.a(this.b, rfa.b) && h.a(this.c, rfa.c) && this.d == rfa.d && this.e == rfa.e && this.f == rfa.f;
    }

    public final boolean f() {
        return this.f;
    }

    public int hashCode() {
        String str = this.a;
        int i = 0;
        int hashCode = (str != null ? str.hashCode() : 0) * 31;
        String str2 = this.b;
        int hashCode2 = (hashCode + (str2 != null ? str2.hashCode() : 0)) * 31;
        String str3 = this.c;
        if (str3 != null) {
            i = str3.hashCode();
        }
        int i2 = (hashCode2 + i) * 31;
        boolean z = this.d;
        int i3 = 1;
        if (z) {
            z = true;
        }
        int i4 = z ? 1 : 0;
        int i5 = z ? 1 : 0;
        int i6 = z ? 1 : 0;
        int i7 = (i2 + i4) * 31;
        boolean z2 = this.e;
        if (z2) {
            z2 = true;
        }
        int i8 = z2 ? 1 : 0;
        int i9 = z2 ? 1 : 0;
        int i10 = z2 ? 1 : 0;
        int i11 = (i7 + i8) * 31;
        boolean z3 = this.f;
        if (!z3) {
            i3 = z3 ? 1 : 0;
        }
        return i11 + i3;
    }

    public String toString() {
        StringBuilder V0 = je.V0("TrackItem(trackUri=");
        V0.append(this.a);
        V0.append(", trackName=");
        V0.append(this.b);
        V0.append(", previewId=");
        V0.append(this.c);
        V0.append(", isExplicit=");
        V0.append(this.d);
        V0.append(", isBanned=");
        V0.append(this.e);
        V0.append(", isHearted=");
        return je.P0(V0, this.f, ")");
    }
}
