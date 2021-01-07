package com.spotify.libs.album;

import com.fasterxml.jackson.annotation.JsonGetter;
import java.util.List;

final class d extends c {
    private final String a;
    private final String b;
    private final boolean c;
    private final boolean d;
    private final List<AlbumArtist> e;
    private final long f;

    d(String str, String str2, boolean z, boolean z2, List<AlbumArtist> list, long j) {
        if (str != null) {
            this.a = str;
            if (str2 != null) {
                this.b = str2;
                this.c = z;
                this.d = z2;
                if (list != null) {
                    this.e = list;
                    this.f = j;
                    return;
                }
                throw new NullPointerException("Null artists");
            }
            throw new NullPointerException("Null name");
        }
        throw new NullPointerException("Null uri");
    }

    @Override // com.spotify.libs.album.c
    @JsonGetter("artists")
    public List<AlbumArtist> a() {
        return this.e;
    }

    @Override // com.spotify.libs.album.c
    @JsonGetter("duration")
    public long b() {
        return this.f;
    }

    @Override // com.spotify.libs.album.c
    @JsonGetter("name")
    public String c() {
        return this.b;
    }

    @Override // com.spotify.libs.album.c
    @JsonGetter("uri")
    public String d() {
        return this.a;
    }

    @Override // com.spotify.libs.album.c
    @JsonGetter("explicit")
    public boolean e() {
        return this.c;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof c)) {
            return false;
        }
        c cVar = (c) obj;
        if (!this.a.equals(cVar.d()) || !this.b.equals(cVar.c()) || this.c != cVar.e() || this.d != cVar.f() || !this.e.equals(cVar.a()) || this.f != cVar.b()) {
            return false;
        }
        return true;
    }

    @Override // com.spotify.libs.album.c
    @JsonGetter("playable")
    public boolean f() {
        return this.d;
    }

    public int hashCode() {
        int i = 1231;
        int hashCode = (((((this.a.hashCode() ^ 1000003) * 1000003) ^ this.b.hashCode()) * 1000003) ^ (this.c ? 1231 : 1237)) * 1000003;
        if (!this.d) {
            i = 1237;
        }
        long j = this.f;
        return ((((hashCode ^ i) * 1000003) ^ this.e.hashCode()) * 1000003) ^ ((int) (j ^ (j >>> 32)));
    }

    public String toString() {
        StringBuilder V0 = je.V0("AlbumTrack{uri=");
        V0.append(this.a);
        V0.append(", name=");
        V0.append(this.b);
        V0.append(", explicit=");
        V0.append(this.c);
        V0.append(", playable=");
        V0.append(this.d);
        V0.append(", artists=");
        V0.append(this.e);
        V0.append(", duration=");
        return je.E0(V0, this.f, "}");
    }
}
