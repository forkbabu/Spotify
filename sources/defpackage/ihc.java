package defpackage;

import com.spotify.playlist.models.offline.a;
import kotlin.jvm.internal.h;

/* renamed from: ihc  reason: default package */
public final class ihc {
    private final String a;
    private final a b;
    private final int c;

    public ihc(String str, a aVar, int i) {
        h.e(str, "episodeUri");
        h.e(aVar, "offlineState");
        this.a = str;
        this.b = aVar;
        this.c = i;
    }

    public final String a() {
        return this.a;
    }

    public final int b() {
        return this.c;
    }

    public final a c() {
        return this.b;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ihc)) {
            return false;
        }
        ihc ihc = (ihc) obj;
        return h.a(this.a, ihc.a) && h.a(this.b, ihc.b) && this.c == ihc.c;
    }

    public int hashCode() {
        String str = this.a;
        int i = 0;
        int hashCode = (str != null ? str.hashCode() : 0) * 31;
        a aVar = this.b;
        if (aVar != null) {
            i = aVar.hashCode();
        }
        return ((hashCode + i) * 31) + this.c;
    }

    public String toString() {
        StringBuilder V0 = je.V0("DownloadClickModel(episodeUri=");
        V0.append(this.a);
        V0.append(", offlineState=");
        V0.append(this.b);
        V0.append(", index=");
        return je.B0(V0, this.c, ")");
    }
}
