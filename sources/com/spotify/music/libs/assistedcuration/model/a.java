package com.spotify.music.libs.assistedcuration.model;

import com.spotify.playlist.models.PlayabilityRestriction;
import java.util.List;

abstract class a extends e {
    private final String b;
    private final String c;
    private final String f;
    private final boolean n;
    private final boolean o;
    private final boolean p;
    private final PlayabilityRestriction q;
    private final String r;
    private final String s;
    private final List<String> t;
    private final String u;

    a(String str, String str2, String str3, boolean z, boolean z2, boolean z3, PlayabilityRestriction playabilityRestriction, String str4, String str5, List<String> list, String str6) {
        if (str != null) {
            this.b = str;
            if (str2 != null) {
                this.c = str2;
                this.f = str3;
                this.n = z;
                this.o = z2;
                this.p = z3;
                if (playabilityRestriction != null) {
                    this.q = playabilityRestriction;
                    if (str4 != null) {
                        this.r = str4;
                        if (str5 != null) {
                            this.s = str5;
                            if (list != null) {
                                this.t = list;
                                if (str6 != null) {
                                    this.u = str6;
                                    return;
                                }
                                throw new NullPointerException("Null getImageUri");
                            }
                            throw new NullPointerException("Null getArtistNames");
                        }
                        throw new NullPointerException("Null getArtistName");
                    }
                    throw new NullPointerException("Null getAlbumName");
                }
                throw new NullPointerException("Null playabilityRestriction");
            }
            throw new NullPointerException("Null getName");
        }
        throw new NullPointerException("Null getUri");
    }

    @Override // java.lang.Object
    public boolean equals(Object obj) {
        String str;
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof e)) {
            return false;
        }
        e eVar = (e) obj;
        if (!this.b.equals(eVar.getUri()) || !this.c.equals(eVar.getName()) || ((str = this.f) != null ? !str.equals(eVar.getPreviewId()) : eVar.getPreviewId() != null) || this.n != eVar.isExplicit() || this.o != eVar.h() || this.p != eVar.i() || !this.q.equals(eVar.j()) || !this.r.equals(eVar.f()) || !this.s.equals(eVar.g()) || !this.t.equals(eVar.x1()) || !this.u.equals(eVar.getImageUri())) {
            return false;
        }
        return true;
    }

    @Override // com.spotify.music.libs.assistedcuration.model.e
    public String f() {
        return this.r;
    }

    @Override // com.spotify.music.libs.assistedcuration.model.e
    public String g() {
        return this.s;
    }

    @Override // com.spotify.music.libs.assistedcuration.model.e
    public String getImageUri() {
        return this.u;
    }

    @Override // com.spotify.music.libs.assistedcuration.model.e
    public String getName() {
        return this.c;
    }

    @Override // com.spotify.music.libs.assistedcuration.model.e
    public String getPreviewId() {
        return this.f;
    }

    @Override // com.spotify.music.libs.assistedcuration.model.e
    public String getUri() {
        return this.b;
    }

    @Override // com.spotify.music.libs.assistedcuration.model.e
    public boolean h() {
        return this.o;
    }

    @Override // java.lang.Object
    public int hashCode() {
        int hashCode = (((this.b.hashCode() ^ 1000003) * 1000003) ^ this.c.hashCode()) * 1000003;
        String str = this.f;
        int i = 1231;
        int hashCode2 = (((((hashCode ^ (str == null ? 0 : str.hashCode())) * 1000003) ^ (this.n ? 1231 : 1237)) * 1000003) ^ (this.o ? 1231 : 1237)) * 1000003;
        if (!this.p) {
            i = 1237;
        }
        return ((((((((((hashCode2 ^ i) * 1000003) ^ this.q.hashCode()) * 1000003) ^ this.r.hashCode()) * 1000003) ^ this.s.hashCode()) * 1000003) ^ this.t.hashCode()) * 1000003) ^ this.u.hashCode();
    }

    @Override // com.spotify.music.libs.assistedcuration.model.e
    public boolean i() {
        return this.p;
    }

    @Override // com.spotify.music.libs.assistedcuration.model.e
    public boolean isExplicit() {
        return this.n;
    }

    @Override // com.spotify.music.libs.assistedcuration.model.e
    public PlayabilityRestriction j() {
        return this.q;
    }

    @Override // java.lang.Object
    public String toString() {
        StringBuilder V0 = je.V0("ACTrack{getUri=");
        V0.append(this.b);
        V0.append(", getName=");
        V0.append(this.c);
        V0.append(", getPreviewId=");
        V0.append(this.f);
        V0.append(", isExplicit=");
        V0.append(this.n);
        V0.append(", isNineteenPlusOnly=");
        V0.append(this.o);
        V0.append(", isPlayable=");
        V0.append(this.p);
        V0.append(", playabilityRestriction=");
        V0.append(this.q);
        V0.append(", getAlbumName=");
        V0.append(this.r);
        V0.append(", getArtistName=");
        V0.append(this.s);
        V0.append(", getArtistNames=");
        V0.append(this.t);
        V0.append(", getImageUri=");
        return je.I0(V0, this.u, "}");
    }

    @Override // com.spotify.music.libs.assistedcuration.model.e
    public List<String> x1() {
        return this.t;
    }
}
