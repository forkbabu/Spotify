package com.spotify.music.builtinauth.cache;

/* access modifiers changed from: package-private */
public final class z extends a0 {
    private final String c;
    private final String d;
    private final String e;
    private final long f;
    private final String g;
    private final String h;
    private final long i;

    z(String str, String str2, String str3, long j, String str4, String str5, long j2) {
        if (str != null) {
            this.c = str;
            if (str2 != null) {
                this.d = str2;
                if (str3 != null) {
                    this.e = str3;
                    this.f = j;
                    if (str4 != null) {
                        this.g = str4;
                        if (str5 != null) {
                            this.h = str5;
                            this.i = j2;
                            return;
                        }
                        throw new NullPointerException("Null appSignature");
                    }
                    throw new NullPointerException("Null packageName");
                }
                throw new NullPointerException("Null scopes");
            }
            throw new NullPointerException("Null redirectUri");
        }
        throw new NullPointerException("Null clientId");
    }

    @Override // com.spotify.music.builtinauth.cache.a0
    public String b() {
        return this.h;
    }

    @Override // com.spotify.music.builtinauth.cache.a0
    public String c() {
        return this.c;
    }

    @Override // com.spotify.music.builtinauth.cache.a0
    public long d() {
        return this.i;
    }

    @Override // com.spotify.music.builtinauth.cache.a0
    public String e() {
        return this.g;
    }

    @Override // com.spotify.music.builtinauth.cache.a0
    public String f() {
        return this.d;
    }

    @Override // com.spotify.music.builtinauth.cache.a0
    public String g() {
        return this.e;
    }

    @Override // com.spotify.music.builtinauth.cache.a0
    public long i() {
        return this.f;
    }

    public String toString() {
        StringBuilder V0 = je.V0("CachedClientInfo{clientId=");
        V0.append(this.c);
        V0.append(", redirectUri=");
        V0.append(this.d);
        V0.append(", scopes=");
        V0.append(this.e);
        V0.append(", timestamp=");
        V0.append(this.f);
        V0.append(", packageName=");
        V0.append(this.g);
        V0.append(", appSignature=");
        V0.append(this.h);
        V0.append(", lastUsedTimestamp=");
        return je.E0(V0, this.i, "}");
    }
}
