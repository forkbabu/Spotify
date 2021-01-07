package defpackage;

import com.spotify.music.podcastentityrow.playback.b;
import java.util.List;
import kotlin.jvm.internal.h;

/* renamed from: lhc  reason: default package */
public final class lhc {
    private final String a;
    private final List<b.C0333b> b;
    private final boolean c;
    private final int d;

    public lhc(String str, List<b.C0333b> list, boolean z, int i) {
        h.e(str, "episodeUri");
        h.e(list, "trackData");
        this.a = str;
        this.b = list;
        this.c = z;
        this.d = i;
    }

    public final String a() {
        return this.a;
    }

    public final int b() {
        return this.d;
    }

    public final List<b.C0333b> c() {
        return this.b;
    }

    public final boolean d() {
        return this.c;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof lhc)) {
            return false;
        }
        lhc lhc = (lhc) obj;
        return h.a(this.a, lhc.a) && h.a(this.b, lhc.b) && this.c == lhc.c && this.d == lhc.d;
    }

    public int hashCode() {
        String str = this.a;
        int i = 0;
        int hashCode = (str != null ? str.hashCode() : 0) * 31;
        List<b.C0333b> list = this.b;
        if (list != null) {
            i = list.hashCode();
        }
        int i2 = (hashCode + i) * 31;
        boolean z = this.c;
        if (z) {
            z = true;
        }
        int i3 = z ? 1 : 0;
        int i4 = z ? 1 : 0;
        int i5 = z ? 1 : 0;
        return ((i2 + i3) * 31) + this.d;
    }

    public String toString() {
        StringBuilder V0 = je.V0("PlayClickModel(episodeUri=");
        V0.append(this.a);
        V0.append(", trackData=");
        V0.append(this.b);
        V0.append(", isExplicit=");
        V0.append(this.c);
        V0.append(", index=");
        return je.B0(V0, this.d, ")");
    }
}
