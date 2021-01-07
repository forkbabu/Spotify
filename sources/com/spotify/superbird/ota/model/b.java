package com.spotify.superbird.ota.model;

/* access modifiers changed from: package-private */
public final class b extends f {
    private final String a;
    private final String b;
    private final String c;
    private final String d;
    private final long e;

    b(String str, String str2, String str3, String str4, long j) {
        if (str != null) {
            this.a = str;
            if (str2 != null) {
                this.b = str2;
                if (str3 != null) {
                    this.c = str3;
                    if (str4 != null) {
                        this.d = str4;
                        this.e = j;
                        return;
                    }
                    throw new NullPointerException("Null hash");
                }
                throw new NullPointerException("Null version");
            }
            throw new NullPointerException("Null packageName");
        }
        throw new NullPointerException("Null state");
    }

    @Override // com.spotify.superbird.ota.model.f
    public String b() {
        return this.d;
    }

    @Override // com.spotify.superbird.ota.model.f
    public String c() {
        return this.b;
    }

    @Override // com.spotify.superbird.ota.model.f
    public long d() {
        return this.e;
    }

    @Override // com.spotify.superbird.ota.model.f
    public String e() {
        return this.a;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof f)) {
            return false;
        }
        f fVar = (f) obj;
        if (!this.a.equals(fVar.e()) || !this.b.equals(fVar.c()) || !this.c.equals(fVar.f()) || !this.d.equals(fVar.b()) || this.e != fVar.d()) {
            return false;
        }
        return true;
    }

    @Override // com.spotify.superbird.ota.model.f
    public String f() {
        return this.c;
    }

    public int hashCode() {
        long j = this.e;
        return ((((((((this.a.hashCode() ^ 1000003) * 1000003) ^ this.b.hashCode()) * 1000003) ^ this.c.hashCode()) * 1000003) ^ this.d.hashCode()) * 1000003) ^ ((int) (j ^ (j >>> 32)));
    }

    public String toString() {
        StringBuilder V0 = je.V0("PackageState{state=");
        V0.append(this.a);
        V0.append(", packageName=");
        V0.append(this.b);
        V0.append(", version=");
        V0.append(this.c);
        V0.append(", hash=");
        V0.append(this.d);
        V0.append(", size=");
        return je.E0(V0, this.e, "}");
    }
}
