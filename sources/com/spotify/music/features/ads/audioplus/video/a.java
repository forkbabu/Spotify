package com.spotify.music.features.ads.audioplus.video;

abstract class a extends f {
    private final String a;
    private final String b;
    private final int c;

    a(String str, String str2, int i) {
        if (str != null) {
            this.a = str;
            if (str2 != null) {
                this.b = str2;
                this.c = i;
                return;
            }
            throw new NullPointerException("Null licenseUrl");
        }
        throw new NullPointerException("Null manifestUrlTemplate");
    }

    @Override // com.spotify.music.features.ads.audioplus.video.f
    public String b() {
        return this.b;
    }

    @Override // com.spotify.music.features.ads.audioplus.video.f
    public String c() {
        return this.a;
    }

    @Override // com.spotify.music.features.ads.audioplus.video.f
    public int e() {
        return this.c;
    }

    @Override // java.lang.Object
    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof f)) {
            return false;
        }
        f fVar = (f) obj;
        if (!this.a.equals(fVar.c()) || !this.b.equals(fVar.b()) || this.c != fVar.e()) {
            return false;
        }
        return true;
    }

    @Override // java.lang.Object
    public int hashCode() {
        return ((((this.a.hashCode() ^ 1000003) * 1000003) ^ this.b.hashCode()) * 1000003) ^ this.c;
    }

    @Override // java.lang.Object
    public String toString() {
        StringBuilder V0 = je.V0("VideoConfiguration{manifestUrlTemplate=");
        V0.append(this.a);
        V0.append(", licenseUrl=");
        V0.append(this.b);
        V0.append(", videoCdnSampling=");
        return je.B0(V0, this.c, "}");
    }
}
