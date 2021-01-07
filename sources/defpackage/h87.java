package defpackage;

import com.spotify.music.features.podcast.episode.inspector.tracklist.model.TrackListItemType;

/* access modifiers changed from: package-private */
/* renamed from: h87  reason: default package */
public final class h87 extends j87 {
    private final String a;
    private final String b;
    private final String c;
    private final String d;
    private final long e;
    private final String f;
    private final boolean g;
    private final boolean h;
    private final boolean i;
    private final boolean j;
    private final TrackListItemType k;
    private final boolean l;

    h87(String str, String str2, String str3, String str4, long j2, String str5, boolean z, boolean z2, boolean z3, boolean z4, TrackListItemType trackListItemType, boolean z5) {
        if (str != null) {
            this.a = str;
            if (str2 != null) {
                this.b = str2;
                if (str3 != null) {
                    this.c = str3;
                    if (str4 != null) {
                        this.d = str4;
                        this.e = j2;
                        if (str5 != null) {
                            this.f = str5;
                            this.g = z;
                            this.h = z2;
                            this.i = z3;
                            this.j = z4;
                            if (trackListItemType != null) {
                                this.k = trackListItemType;
                                this.l = z5;
                                return;
                            }
                            throw new NullPointerException("Null trackListItemType");
                        }
                        throw new NullPointerException("Null imageUri");
                    }
                    throw new NullPointerException("Null subtitle");
                }
                throw new NullPointerException("Null title");
            }
            throw new NullPointerException("Null trackUri");
        }
        throw new NullPointerException("Null episodeUri");
    }

    @Override // defpackage.j87
    public String b() {
        return this.a;
    }

    @Override // defpackage.j87
    public boolean c() {
        return this.j;
    }

    @Override // defpackage.j87
    public boolean d() {
        return this.l;
    }

    @Override // defpackage.j87
    public String e() {
        return this.f;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof j87)) {
            return false;
        }
        j87 j87 = (j87) obj;
        if (!this.a.equals(j87.b()) || !this.b.equals(j87.m()) || !this.c.equals(j87.k()) || !this.d.equals(j87.j()) || this.e != j87.i() || !this.f.equals(j87.e()) || this.g != j87.f() || this.h != j87.g() || this.i != j87.h() || this.j != j87.c() || !this.k.equals(j87.l()) || this.l != j87.d()) {
            return false;
        }
        return true;
    }

    @Override // defpackage.j87
    public boolean f() {
        return this.g;
    }

    @Override // defpackage.j87
    public boolean g() {
        return this.h;
    }

    @Override // defpackage.j87
    public boolean h() {
        return this.i;
    }

    public int hashCode() {
        long j2 = this.e;
        int i2 = 1231;
        int hashCode = (((((((((((((((((((((this.a.hashCode() ^ 1000003) * 1000003) ^ this.b.hashCode()) * 1000003) ^ this.c.hashCode()) * 1000003) ^ this.d.hashCode()) * 1000003) ^ ((int) (j2 ^ (j2 >>> 32)))) * 1000003) ^ this.f.hashCode()) * 1000003) ^ (this.g ? 1231 : 1237)) * 1000003) ^ (this.h ? 1231 : 1237)) * 1000003) ^ (this.i ? 1231 : 1237)) * 1000003) ^ (this.j ? 1231 : 1237)) * 1000003) ^ this.k.hashCode()) * 1000003;
        if (!this.l) {
            i2 = 1237;
        }
        return hashCode ^ i2;
    }

    @Override // defpackage.j87
    public long i() {
        return this.e;
    }

    @Override // defpackage.j87
    public String j() {
        return this.d;
    }

    @Override // defpackage.j87
    public String k() {
        return this.c;
    }

    @Override // defpackage.j87
    public TrackListItemType l() {
        return this.k;
    }

    @Override // defpackage.j87
    public String m() {
        return this.b;
    }

    public String toString() {
        StringBuilder V0 = je.V0("TrackListItemViewModel{episodeUri=");
        V0.append(this.a);
        V0.append(", trackUri=");
        V0.append(this.b);
        V0.append(", title=");
        V0.append(this.c);
        V0.append(", subtitle=");
        V0.append(this.d);
        V0.append(", startTimeInMillis=");
        V0.append(this.e);
        V0.append(", imageUri=");
        V0.append(this.f);
        V0.append(", isFirst=");
        V0.append(this.g);
        V0.append(", isLast=");
        V0.append(this.h);
        V0.append(", selected=");
        V0.append(this.i);
        V0.append(", hasContextMenu=");
        V0.append(this.j);
        V0.append(", trackListItemType=");
        V0.append(this.k);
        V0.append(", hasPreviewLabel=");
        return je.P0(V0, this.l, "}");
    }
}
