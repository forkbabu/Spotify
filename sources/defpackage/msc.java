package defpackage;

import kotlin.jvm.internal.h;

/* renamed from: msc  reason: default package */
public final class msc {
    private final String a;
    private final String b;
    private final String c;
    private final boolean d;
    private final int e;
    private final boolean f;

    public msc(String str, String str2, String str3, boolean z, int i, boolean z2) {
        je.x(str, "episodeName", str2, "episodeUri", str3, "sectionName");
        this.a = str;
        this.b = str2;
        this.c = str3;
        this.d = z;
        this.e = i;
        this.f = z2;
    }

    public final boolean a() {
        return this.d;
    }

    public final String b() {
        return this.a;
    }

    public final String c() {
        return this.b;
    }

    public final int d() {
        return this.e;
    }

    public final String e() {
        return this.c;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof msc)) {
            return false;
        }
        msc msc = (msc) obj;
        return h.a(this.a, msc.a) && h.a(this.b, msc.b) && h.a(this.c, msc.c) && this.d == msc.d && this.e == msc.e && this.f == msc.f;
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
        int i7 = (((i2 + i4) * 31) + this.e) * 31;
        boolean z2 = this.f;
        if (!z2) {
            i3 = z2 ? 1 : 0;
        }
        return i7 + i3;
    }

    public String toString() {
        StringBuilder V0 = je.V0("PodcastEpisodeContextMenuListenerModel(episodeName=");
        V0.append(this.a);
        V0.append(", episodeUri=");
        V0.append(this.b);
        V0.append(", sectionName=");
        V0.append(this.c);
        V0.append(", canDownloadEpisode=");
        V0.append(this.d);
        V0.append(", index=");
        V0.append(this.e);
        V0.append(", isVideo=");
        return je.P0(V0, this.f, ")");
    }
}
