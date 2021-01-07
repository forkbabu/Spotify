package com.spotify.voice.results.model;

import com.spotify.voice.results.model.e;

abstract class b extends e.a {
    private final String a;
    private final String b;
    private final String c;
    private final String f;
    private final boolean n;
    private final String o;
    private final boolean p;
    private final boolean q;

    b(String str, String str2, String str3, String str4, boolean z, String str5, boolean z2, boolean z3) {
        if (str != null) {
            this.a = str;
            if (str2 != null) {
                this.b = str2;
                if (str3 != null) {
                    this.c = str3;
                    if (str4 != null) {
                        this.f = str4;
                        this.n = z;
                        if (str5 != null) {
                            this.o = str5;
                            this.p = z2;
                            this.q = z3;
                            return;
                        }
                        throw new NullPointerException("Null subtitle");
                    }
                    throw new NullPointerException("Null navigateUri");
                }
                throw new NullPointerException("Null playUri");
            }
            throw new NullPointerException("Null imageUri");
        }
        throw new NullPointerException("Null title");
    }

    @Override // com.spotify.voice.results.model.e.a
    public boolean a() {
        return this.n;
    }

    @Override // com.spotify.voice.results.model.e.a
    public boolean c() {
        return this.p;
    }

    @Override // com.spotify.voice.results.model.e.a
    public String e() {
        return this.b;
    }

    @Override // java.lang.Object
    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof e.a)) {
            return false;
        }
        e.a aVar = (e.a) obj;
        if (!this.a.equals(aVar.j()) || !this.b.equals(aVar.e()) || !this.c.equals(aVar.h()) || !this.f.equals(aVar.g()) || this.n != aVar.a() || !this.o.equals(aVar.i()) || this.p != aVar.c() || this.q != aVar.f()) {
            return false;
        }
        return true;
    }

    @Override // com.spotify.voice.results.model.e.a
    public boolean f() {
        return this.q;
    }

    @Override // com.spotify.voice.results.model.e.a
    public String g() {
        return this.f;
    }

    @Override // com.spotify.voice.results.model.e.a
    public String h() {
        return this.c;
    }

    @Override // java.lang.Object
    public int hashCode() {
        int i = 1231;
        int hashCode = (((((((((((((this.a.hashCode() ^ 1000003) * 1000003) ^ this.b.hashCode()) * 1000003) ^ this.c.hashCode()) * 1000003) ^ this.f.hashCode()) * 1000003) ^ (this.n ? 1231 : 1237)) * 1000003) ^ this.o.hashCode()) * 1000003) ^ (this.p ? 1231 : 1237)) * 1000003;
        if (!this.q) {
            i = 1237;
        }
        return hashCode ^ i;
    }

    @Override // com.spotify.voice.results.model.e.a
    public String i() {
        return this.o;
    }

    @Override // com.spotify.voice.results.model.e.a
    public String j() {
        return this.a;
    }

    @Override // java.lang.Object
    public String toString() {
        StringBuilder V0 = je.V0("Result{title=");
        V0.append(this.a);
        V0.append(", imageUri=");
        V0.append(this.b);
        V0.append(", playUri=");
        V0.append(this.c);
        V0.append(", navigateUri=");
        V0.append(this.f);
        V0.append(", active=");
        V0.append(this.n);
        V0.append(", subtitle=");
        V0.append(this.o);
        V0.append(", explicit=");
        V0.append(this.p);
        V0.append(", isContainerItem=");
        return je.P0(V0, this.q, "}");
    }
}
