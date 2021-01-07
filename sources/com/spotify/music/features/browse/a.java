package com.spotify.music.features.browse;

final class a extends b {
    private final String a;
    private final boolean b;

    a(String str, boolean z) {
        if (str != null) {
            this.a = str;
            this.b = z;
            return;
        }
        throw new NullPointerException("Null uri");
    }

    @Override // com.spotify.music.features.browse.b
    public boolean a() {
        return this.b;
    }

    @Override // com.spotify.music.features.browse.b
    public String b() {
        return this.a;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof b)) {
            return false;
        }
        b bVar = (b) obj;
        if (!this.a.equals(bVar.b()) || this.b != bVar.a()) {
            return false;
        }
        return true;
    }

    public int hashCode() {
        return ((this.a.hashCode() ^ 1000003) * 1000003) ^ (this.b ? 1231 : 1237);
    }

    public String toString() {
        StringBuilder V0 = je.V0("BrowseDrillDownConfig{uri=");
        V0.append(this.a);
        V0.append(", isNft=");
        return je.P0(V0, this.b, "}");
    }
}
