package defpackage;

import java.util.List;
import kotlin.jvm.internal.h;

/* renamed from: i45  reason: default package */
public final class i45 {
    private final boolean a;
    private final boolean b;
    private final boolean c;
    private final String d;
    private final String e;
    private final List<String> f;

    public i45(boolean z, boolean z2, boolean z3, String str, String str2, List<String> list) {
        h.e(str, "title");
        h.e(str2, "trackUri");
        h.e(list, "artistNames");
        this.a = z;
        this.b = z2;
        this.c = z3;
        this.d = str;
        this.e = str2;
        this.f = list;
    }

    public final boolean a() {
        return this.c;
    }

    public final List<String> b() {
        return this.f;
    }

    public final String c() {
        return this.d;
    }

    public final String d() {
        return this.e;
    }

    public final boolean e() {
        return this.b;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof i45)) {
            return false;
        }
        i45 i45 = (i45) obj;
        return this.a == i45.a && this.b == i45.b && this.c == i45.c && h.a(this.d, i45.d) && h.a(this.e, i45.e) && h.a(this.f, i45.f);
    }

    public final boolean f() {
        return this.a;
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
        if (z2) {
            z2 = true;
        }
        int i6 = z2 ? 1 : 0;
        int i7 = z2 ? 1 : 0;
        int i8 = z2 ? 1 : 0;
        int i9 = (i5 + i6) * 31;
        boolean z3 = this.c;
        if (!z3) {
            i = z3 ? 1 : 0;
        }
        int i10 = (i9 + i) * 31;
        String str = this.d;
        int i11 = 0;
        int hashCode = (i10 + (str != null ? str.hashCode() : 0)) * 31;
        String str2 = this.e;
        int hashCode2 = (hashCode + (str2 != null ? str2.hashCode() : 0)) * 31;
        List<String> list = this.f;
        if (list != null) {
            i11 = list.hashCode();
        }
        return hashCode2 + i11;
    }

    public String toString() {
        StringBuilder V0 = je.V0("CardTrackRow(isPlaying=");
        V0.append(this.a);
        V0.append(", isExplicit=");
        V0.append(this.b);
        V0.append(", appearsDisabled=");
        V0.append(this.c);
        V0.append(", title=");
        V0.append(this.d);
        V0.append(", trackUri=");
        V0.append(this.e);
        V0.append(", artistNames=");
        return je.L0(V0, this.f, ")");
    }
}
