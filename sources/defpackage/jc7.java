package defpackage;

import java.util.Map;

/* access modifiers changed from: package-private */
/* renamed from: jc7  reason: default package */
public final class jc7 extends rc7 {
    private final int a;
    private final String b;
    private final String c;
    private final int d;
    private final int e;
    private final String f;
    private final String g;
    private final String h;
    private final String i;
    private final String j;
    private final boolean k;
    private final String l;
    private final Map<String, String> m;
    private final int n;
    private final boolean o;
    private final boolean p;
    private final boolean q;

    jc7(int i2, String str, String str2, int i3, int i4, String str3, String str4, String str5, String str6, String str7, boolean z, String str8, Map<String, String> map, int i5, boolean z2, boolean z3, boolean z4) {
        this.a = i2;
        if (str != null) {
            this.b = str;
            if (str2 != null) {
                this.c = str2;
                this.d = i3;
                this.e = i4;
                if (str3 != null) {
                    this.f = str3;
                    if (str4 != null) {
                        this.g = str4;
                        this.h = str5;
                        if (str6 != null) {
                            this.i = str6;
                            if (str7 != null) {
                                this.j = str7;
                                this.k = z;
                                if (str8 != null) {
                                    this.l = str8;
                                    if (map != null) {
                                        this.m = map;
                                        this.n = i5;
                                        this.o = z2;
                                        this.p = z3;
                                        this.q = z4;
                                        return;
                                    }
                                    throw new NullPointerException("Null episodeMetadata");
                                }
                                throw new NullPointerException("Null shareCoverArtUri");
                            }
                            throw new NullPointerException("Null episodeUri");
                        }
                        throw new NullPointerException("Null podcastUri");
                    }
                    throw new NullPointerException("Null episodeName");
                }
                throw new NullPointerException("Null podcastName");
            }
            throw new NullPointerException("Null subtitle");
        }
        throw new NullPointerException("Null title");
    }

    @Override // defpackage.rc7
    public boolean a() {
        return this.k;
    }

    @Override // defpackage.rc7
    public int c() {
        return this.n;
    }

    @Override // defpackage.rc7
    public Map<String, String> d() {
        return this.m;
    }

    @Override // defpackage.rc7
    public String e() {
        return this.g;
    }

    public boolean equals(Object obj) {
        String str;
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof rc7)) {
            return false;
        }
        rc7 rc7 = (rc7) obj;
        if (this.a != rc7.p() || !this.b.equals(rc7.r()) || !this.c.equals(rc7.q()) || this.d != rc7.n() || this.e != rc7.j() || !this.f.equals(rc7.l()) || !this.g.equals(rc7.e()) || ((str = this.h) != null ? !str.equals(rc7.k()) : rc7.k() != null) || !this.i.equals(rc7.m()) || !this.j.equals(rc7.f()) || this.k != rc7.a() || !this.l.equals(rc7.o()) || !this.m.equals(rc7.d()) || this.n != rc7.c() || this.o != rc7.h() || this.p != rc7.g() || this.q != rc7.i()) {
            return false;
        }
        return true;
    }

    @Override // defpackage.rc7
    public String f() {
        return this.j;
    }

    @Override // defpackage.rc7
    public boolean g() {
        return this.p;
    }

    @Override // defpackage.rc7
    public boolean h() {
        return this.o;
    }

    public int hashCode() {
        int hashCode = (((((((((((((this.a ^ 1000003) * 1000003) ^ this.b.hashCode()) * 1000003) ^ this.c.hashCode()) * 1000003) ^ this.d) * 1000003) ^ this.e) * 1000003) ^ this.f.hashCode()) * 1000003) ^ this.g.hashCode()) * 1000003;
        String str = this.h;
        int i2 = 1231;
        int hashCode2 = (((((((((((((((((hashCode ^ (str == null ? 0 : str.hashCode())) * 1000003) ^ this.i.hashCode()) * 1000003) ^ this.j.hashCode()) * 1000003) ^ (this.k ? 1231 : 1237)) * 1000003) ^ this.l.hashCode()) * 1000003) ^ this.m.hashCode()) * 1000003) ^ this.n) * 1000003) ^ (this.o ? 1231 : 1237)) * 1000003) ^ (this.p ? 1231 : 1237)) * 1000003;
        if (!this.q) {
            i2 = 1237;
        }
        return hashCode2 ^ i2;
    }

    @Override // defpackage.rc7
    public boolean i() {
        return this.q;
    }

    @Override // defpackage.rc7
    public int j() {
        return this.e;
    }

    @Override // defpackage.rc7
    public String k() {
        return this.h;
    }

    @Override // defpackage.rc7
    public String l() {
        return this.f;
    }

    @Override // defpackage.rc7
    public String m() {
        return this.i;
    }

    @Override // defpackage.rc7
    public int n() {
        return this.d;
    }

    @Override // defpackage.rc7
    public String o() {
        return this.l;
    }

    @Override // defpackage.rc7
    public int p() {
        return this.a;
    }

    @Override // defpackage.rc7
    public String q() {
        return this.c;
    }

    @Override // defpackage.rc7
    public String r() {
        return this.b;
    }

    public String toString() {
        StringBuilder V0 = je.V0("HeaderViewModel{status=");
        V0.append(this.a);
        V0.append(", title=");
        V0.append(this.b);
        V0.append(", subtitle=");
        V0.append(this.c);
        V0.append(", progress=");
        V0.append(this.d);
        V0.append(", length=");
        V0.append(this.e);
        V0.append(", podcastName=");
        V0.append(this.f);
        V0.append(", episodeName=");
        V0.append(this.g);
        V0.append(", podcastCoverArtUri=");
        V0.append(this.h);
        V0.append(", podcastUri=");
        V0.append(this.i);
        V0.append(", episodeUri=");
        V0.append(this.j);
        V0.append(", canAddToQueue=");
        V0.append(this.k);
        V0.append(", shareCoverArtUri=");
        V0.append(this.l);
        V0.append(", episodeMetadata=");
        V0.append(this.m);
        V0.append(", downloadState=");
        V0.append(this.n);
        V0.append(", isExplicit=");
        V0.append(this.o);
        V0.append(", isDownloadButtonHidden=");
        V0.append(this.p);
        V0.append(", isMusicAndTalk=");
        return je.P0(V0, this.q, "}");
    }
}
