package com.spotify.music.features.ads.audioplus;

abstract class a extends d {
    private final String a;
    private final String b;
    private final String c;
    private final String f;
    private final String n;
    private final String o;
    private final String p;
    private final String q;
    private final String r;
    private final boolean s;
    private final boolean t;

    a(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, boolean z, boolean z2) {
        if (str != null) {
            this.a = str;
            if (str2 != null) {
                this.b = str2;
                if (str3 != null) {
                    this.c = str3;
                    if (str4 != null) {
                        this.f = str4;
                        if (str5 != null) {
                            this.n = str5;
                            if (str6 != null) {
                                this.o = str6;
                                if (str7 != null) {
                                    this.p = str7;
                                    if (str8 != null) {
                                        this.q = str8;
                                        if (str9 != null) {
                                            this.r = str9;
                                            this.s = z;
                                            this.t = z2;
                                            return;
                                        }
                                        throw new NullPointerException("Null promoType");
                                    }
                                    throw new NullPointerException("Null promoDetails");
                                }
                                throw new NullPointerException("Null promoEntity");
                            }
                            throw new NullPointerException("Null promoName");
                        }
                        throw new NullPointerException("Null clickUrl");
                    }
                    throw new NullPointerException("Null callToActionText");
                }
                throw new NullPointerException("Null advertiserName");
            }
            throw new NullPointerException("Null imageUri");
        }
        throw new NullPointerException("Null id");
    }

    @Override // com.spotify.music.features.ads.audioplus.d
    public String a() {
        return this.c;
    }

    @Override // com.spotify.music.features.ads.audioplus.d
    public String b() {
        return this.f;
    }

    @Override // com.spotify.music.features.ads.audioplus.d
    public String c() {
        return this.n;
    }

    @Override // com.spotify.music.features.ads.audioplus.d
    public String e() {
        return this.a;
    }

    @Override // java.lang.Object
    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof d)) {
            return false;
        }
        d dVar = (d) obj;
        if (!this.a.equals(dVar.e()) || !this.b.equals(dVar.f()) || !this.c.equals(dVar.a()) || !this.f.equals(dVar.b()) || !this.n.equals(dVar.c()) || !this.o.equals(dVar.k()) || !this.p.equals(dVar.j()) || !this.q.equals(dVar.i()) || !this.r.equals(dVar.l()) || this.s != dVar.g() || this.t != dVar.h()) {
            return false;
        }
        return true;
    }

    @Override // com.spotify.music.features.ads.audioplus.d
    public String f() {
        return this.b;
    }

    @Override // com.spotify.music.features.ads.audioplus.d
    public boolean g() {
        return this.s;
    }

    @Override // com.spotify.music.features.ads.audioplus.d
    public boolean h() {
        return this.t;
    }

    @Override // java.lang.Object
    public int hashCode() {
        int i = 1231;
        int hashCode = (((((((((((((((((((this.a.hashCode() ^ 1000003) * 1000003) ^ this.b.hashCode()) * 1000003) ^ this.c.hashCode()) * 1000003) ^ this.f.hashCode()) * 1000003) ^ this.n.hashCode()) * 1000003) ^ this.o.hashCode()) * 1000003) ^ this.p.hashCode()) * 1000003) ^ this.q.hashCode()) * 1000003) ^ this.r.hashCode()) * 1000003) ^ (this.s ? 1231 : 1237)) * 1000003;
        if (!this.t) {
            i = 1237;
        }
        return hashCode ^ i;
    }

    @Override // com.spotify.music.features.ads.audioplus.d
    public String i() {
        return this.q;
    }

    @Override // com.spotify.music.features.ads.audioplus.d
    public String j() {
        return this.p;
    }

    @Override // com.spotify.music.features.ads.audioplus.d
    public String k() {
        return this.o;
    }

    @Override // com.spotify.music.features.ads.audioplus.d
    public String l() {
        return this.r;
    }

    @Override // java.lang.Object
    public String toString() {
        StringBuilder V0 = je.V0("LeaveBehindAd{id=");
        V0.append(this.a);
        V0.append(", imageUri=");
        V0.append(this.b);
        V0.append(", advertiserName=");
        V0.append(this.c);
        V0.append(", callToActionText=");
        V0.append(this.f);
        V0.append(", clickUrl=");
        V0.append(this.n);
        V0.append(", promoName=");
        V0.append(this.o);
        V0.append(", promoEntity=");
        V0.append(this.p);
        V0.append(", promoDetails=");
        V0.append(this.q);
        V0.append(", promoType=");
        V0.append(this.r);
        V0.append(", isBookmarkable=");
        V0.append(this.s);
        V0.append(", isBookmarked=");
        return je.P0(V0, this.t, "}");
    }
}
