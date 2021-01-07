package com.spotify.music.features.playlistentity.homemix.models;

final class a extends f {
    private final String a;
    private final String b;
    private final int c;

    a(String str, String str2, int i) {
        if (str != null) {
            this.a = str;
            this.b = str2;
            this.c = i;
            return;
        }
        throw new NullPointerException("Null username");
    }

    @Override // com.spotify.music.features.playlistentity.homemix.models.f
    public String a() {
        return this.b;
    }

    @Override // com.spotify.music.features.playlistentity.homemix.models.f
    public int b() {
        return this.c;
    }

    @Override // com.spotify.music.features.playlistentity.homemix.models.f
    public String c() {
        return this.a;
    }

    public boolean equals(Object obj) {
        String str;
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof f)) {
            return false;
        }
        f fVar = (f) obj;
        if (!this.a.equals(fVar.c()) || ((str = this.b) != null ? !str.equals(fVar.a()) : fVar.a() != null) || this.c != fVar.b()) {
            return false;
        }
        return true;
    }

    public int hashCode() {
        int hashCode = (this.a.hashCode() ^ 1000003) * 1000003;
        String str = this.b;
        return ((hashCode ^ (str == null ? 0 : str.hashCode())) * 1000003) ^ this.c;
    }

    public String toString() {
        StringBuilder V0 = je.V0("HomeMixAffinityUser{username=");
        V0.append(this.a);
        V0.append(", affinity=");
        V0.append(this.b);
        V0.append(", score=");
        return je.B0(V0, this.c, "}");
    }
}
