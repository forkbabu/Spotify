package defpackage;

import com.spotify.mobile.android.quotesharing.b;
import com.spotify.playlist.models.e;
import com.spotify.playlist.models.offline.a;
import java.util.List;

/* access modifiers changed from: package-private */
/* renamed from: f77  reason: default package */
public final class f77 extends g77 {
    private final String a;
    private final String b;
    private final String c;
    private final String d;
    private final String e;
    private final String f;
    private final int g;
    private final a h;
    private final String i;
    private final String j;
    private final String k;
    private final boolean l;
    private final long m;
    private final b91 n;
    private final k87 o;
    private final List<? extends s81> p;
    private final b91 q;
    private final List<b> r;
    private final boolean s;
    private final e t;

    f77(String str, String str2, String str3, String str4, String str5, String str6, int i2, a aVar, String str7, String str8, String str9, boolean z, long j2, b91 b91, k87 k87, List<? extends s81> list, b91 b912, List<b> list2, boolean z2, e eVar) {
        if (str != null) {
            this.a = str;
            this.b = str2;
            if (str3 != null) {
                this.c = str3;
                if (str4 != null) {
                    this.d = str4;
                    if (str5 != null) {
                        this.e = str5;
                        this.f = str6;
                        this.g = i2;
                        if (aVar != null) {
                            this.h = aVar;
                            if (str7 != null) {
                                this.i = str7;
                                if (str8 != null) {
                                    this.j = str8;
                                    if (str9 != null) {
                                        this.k = str9;
                                        this.l = z;
                                        this.m = j2;
                                        this.n = b91;
                                        this.o = k87;
                                        if (list != null) {
                                            this.p = list;
                                            this.q = b912;
                                            if (list2 != null) {
                                                this.r = list2;
                                                this.s = z2;
                                                this.t = eVar;
                                                return;
                                            }
                                            throw new NullPointerException("Null episodeQuotes");
                                        }
                                        throw new NullPointerException("Null recommendationsList");
                                    }
                                    throw new NullPointerException("Null shareCoverArtUri");
                                }
                                throw new NullPointerException("Null podcastName");
                            }
                            throw new NullPointerException("Null podcastUri");
                        }
                        throw new NullPointerException("Null offlineState");
                    }
                    throw new NullPointerException("Null metadata");
                }
                throw new NullPointerException("Null episodeName");
            }
            throw new NullPointerException("Null episodeUri");
        }
        throw new NullPointerException("Null description");
    }

    @Override // defpackage.g77
    public b91 a() {
        return this.q;
    }

    @Override // defpackage.g77
    public String b() {
        return this.f;
    }

    @Override // defpackage.g77
    public String d() {
        return this.a;
    }

    @Override // defpackage.g77
    public int e() {
        return this.g;
    }

    public boolean equals(Object obj) {
        String str;
        String str2;
        b91 b91;
        k87 k87;
        b91 b912;
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof g77)) {
            return false;
        }
        g77 g77 = (g77) obj;
        if (this.a.equals(g77.d()) && ((str = this.b) != null ? str.equals(g77.k()) : g77.k() == null) && this.c.equals(g77.i()) && this.d.equals(g77.f()) && this.e.equals(g77.n()) && ((str2 = this.f) != null ? str2.equals(g77.b()) : g77.b() == null) && this.g == g77.e() && this.h.equals(g77.o()) && this.i.equals(g77.r()) && this.j.equals(g77.q()) && this.k.equals(g77.t()) && this.l == g77.l() && this.m == g77.p() && ((b91 = this.n) != null ? b91.equals(g77.j()) : g77.j() == null) && ((k87 = this.o) != null ? k87.equals(g77.u()) : g77.u() == null) && this.p.equals(g77.s()) && ((b912 = this.q) != null ? b912.equals(g77.a()) : g77.a() == null) && this.r.equals(g77.g()) && this.s == g77.m()) {
            e eVar = this.t;
            if (eVar == null) {
                if (g77.h() == null) {
                    return true;
                }
            } else if (eVar.equals(g77.h())) {
                return true;
            }
        }
        return false;
    }

    @Override // defpackage.g77
    public String f() {
        return this.d;
    }

    @Override // defpackage.g77
    public List<b> g() {
        return this.r;
    }

    @Override // defpackage.g77
    public e h() {
        return this.t;
    }

    public int hashCode() {
        int hashCode = (this.a.hashCode() ^ 1000003) * 1000003;
        String str = this.b;
        int i2 = 0;
        int hashCode2 = (((((((hashCode ^ (str == null ? 0 : str.hashCode())) * 1000003) ^ this.c.hashCode()) * 1000003) ^ this.d.hashCode()) * 1000003) ^ this.e.hashCode()) * 1000003;
        String str2 = this.f;
        int hashCode3 = (((((((((((hashCode2 ^ (str2 == null ? 0 : str2.hashCode())) * 1000003) ^ this.g) * 1000003) ^ this.h.hashCode()) * 1000003) ^ this.i.hashCode()) * 1000003) ^ this.j.hashCode()) * 1000003) ^ this.k.hashCode()) * 1000003;
        int i3 = 1231;
        int i4 = this.l ? 1231 : 1237;
        long j2 = this.m;
        int i5 = (((hashCode3 ^ i4) * 1000003) ^ ((int) (j2 ^ (j2 >>> 32)))) * 1000003;
        b91 b91 = this.n;
        int hashCode4 = (i5 ^ (b91 == null ? 0 : b91.hashCode())) * 1000003;
        k87 k87 = this.o;
        int hashCode5 = (((hashCode4 ^ (k87 == null ? 0 : k87.hashCode())) * 1000003) ^ this.p.hashCode()) * 1000003;
        b91 b912 = this.q;
        int hashCode6 = (((hashCode5 ^ (b912 == null ? 0 : b912.hashCode())) * 1000003) ^ this.r.hashCode()) * 1000003;
        if (!this.s) {
            i3 = 1237;
        }
        int i6 = (hashCode6 ^ i3) * 1000003;
        e eVar = this.t;
        if (eVar != null) {
            i2 = eVar.hashCode();
        }
        return i6 ^ i2;
    }

    @Override // defpackage.g77
    public String i() {
        return this.c;
    }

    @Override // defpackage.g77
    public b91 j() {
        return this.n;
    }

    @Override // defpackage.g77
    public String k() {
        return this.b;
    }

    @Override // defpackage.g77
    public boolean l() {
        return this.l;
    }

    @Override // defpackage.g77
    public boolean m() {
        return this.s;
    }

    @Override // defpackage.g77
    public String n() {
        return this.e;
    }

    @Override // defpackage.g77
    public a o() {
        return this.h;
    }

    @Override // defpackage.g77
    public long p() {
        return this.m;
    }

    @Override // defpackage.g77
    public String q() {
        return this.j;
    }

    @Override // defpackage.g77
    public String r() {
        return this.i;
    }

    @Override // defpackage.g77
    public List<? extends s81> s() {
        return this.p;
    }

    @Override // defpackage.g77
    public String t() {
        return this.k;
    }

    public String toString() {
        StringBuilder V0 = je.V0("BodyViewModel{description=");
        V0.append(this.a);
        V0.append(", htmlDescription=");
        V0.append(this.b);
        V0.append(", episodeUri=");
        V0.append(this.c);
        V0.append(", episodeName=");
        V0.append(this.d);
        V0.append(", metadata=");
        V0.append(this.e);
        V0.append(", coverArtUri=");
        V0.append(this.f);
        V0.append(", downloadState=");
        V0.append(this.g);
        V0.append(", offlineState=");
        V0.append(this.h);
        V0.append(", podcastUri=");
        V0.append(this.i);
        V0.append(", podcastName=");
        V0.append(this.j);
        V0.append(", shareCoverArtUri=");
        V0.append(this.k);
        V0.append(", isExplicit=");
        V0.append(this.l);
        V0.append(", podcastLengthInMillis=");
        V0.append(this.m);
        V0.append(", featuredContent=");
        V0.append(this.n);
        V0.append(", trackListViewModel=");
        V0.append(this.o);
        V0.append(", recommendationsList=");
        V0.append(this.p);
        V0.append(", audioPlusContent=");
        V0.append(this.q);
        V0.append(", episodeQuotes=");
        V0.append(this.r);
        V0.append(", isInYourEpisodes=");
        V0.append(this.s);
        V0.append(", episodeTranscripts=");
        V0.append(this.t);
        V0.append("}");
        return V0.toString();
    }

    @Override // defpackage.g77
    public k87 u() {
        return this.o;
    }
}
