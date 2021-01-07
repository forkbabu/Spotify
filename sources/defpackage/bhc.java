package defpackage;

import kotlin.jvm.internal.h;

/* renamed from: bhc  reason: default package */
public final class bhc {
    private final String a;
    private final boolean b;
    private final int c;

    public bhc(String str, boolean z, int i) {
        h.e(str, "episodeUri");
        this.a = str;
        this.b = z;
        this.c = i;
    }

    public final String a() {
        return this.a;
    }

    public final int b() {
        return this.c;
    }

    public final boolean c() {
        return this.b;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof bhc)) {
            return false;
        }
        bhc bhc = (bhc) obj;
        return h.a(this.a, bhc.a) && this.b == bhc.b && this.c == bhc.c;
    }

    public int hashCode() {
        String str = this.a;
        int hashCode = (str != null ? str.hashCode() : 0) * 31;
        boolean z = this.b;
        if (z) {
            z = true;
        }
        int i = z ? 1 : 0;
        int i2 = z ? 1 : 0;
        int i3 = z ? 1 : 0;
        return ((hashCode + i) * 31) + this.c;
    }

    public String toString() {
        StringBuilder V0 = je.V0("AddToYourEpisodeClickModel(episodeUri=");
        V0.append(this.a);
        V0.append(", isEpisodeAddedtoYourEpisodes=");
        V0.append(this.b);
        V0.append(", index=");
        return je.B0(V0, this.c, ")");
    }
}
