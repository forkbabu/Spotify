package com.spotify.music.features.languagepicker.model;

abstract class a extends g {
    private final String b;
    private final String c;
    private final String f;
    private final boolean n;

    a(String str, String str2, String str3, boolean z) {
        if (str != null) {
            this.b = str;
            if (str2 != null) {
                this.c = str2;
                if (str3 != null) {
                    this.f = str3;
                    this.n = z;
                    return;
                }
                throw new NullPointerException("Null bcp47");
            }
            throw new NullPointerException("Null imageUri");
        }
        throw new NullPointerException("Null name");
    }

    @Override // com.spotify.music.features.languagepicker.model.g
    public String a() {
        return this.f;
    }

    @Override // com.spotify.music.features.languagepicker.model.g
    public String c() {
        return this.c;
    }

    @Override // com.spotify.music.features.languagepicker.model.g
    public String e() {
        return this.b;
    }

    @Override // java.lang.Object
    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof g)) {
            return false;
        }
        g gVar = (g) obj;
        if (!this.b.equals(gVar.e()) || !this.c.equals(gVar.c()) || !this.f.equals(gVar.a()) || this.n != gVar.f()) {
            return false;
        }
        return true;
    }

    @Override // com.spotify.music.features.languagepicker.model.g
    public boolean f() {
        return this.n;
    }

    @Override // java.lang.Object
    public int hashCode() {
        return ((((((this.b.hashCode() ^ 1000003) * 1000003) ^ this.c.hashCode()) * 1000003) ^ this.f.hashCode()) * 1000003) ^ (this.n ? 1231 : 1237);
    }

    @Override // java.lang.Object
    public String toString() {
        StringBuilder V0 = je.V0("UserLanguage{name=");
        V0.append(this.b);
        V0.append(", imageUri=");
        V0.append(this.c);
        V0.append(", bcp47=");
        V0.append(this.f);
        V0.append(", selected=");
        return je.P0(V0, this.n, "}");
    }
}
