package com.spotify.intentrouter;

import io.reactivex.a;

/* access modifiers changed from: package-private */
public final class e<T> extends g<T> {
    private final a a;
    private final T b;
    private final String c;
    private final String d;

    e(a aVar, T t, String str, String str2) {
        if (aVar != null) {
            this.a = aVar;
            if (t != null) {
                this.b = t;
                if (str != null) {
                    this.c = str;
                    if (str2 != null) {
                        this.d = str2;
                        return;
                    }
                    throw new NullPointerException("Null factoryDescription");
                }
                throw new NullPointerException("Null description");
            }
            throw new NullPointerException("Null input");
        }
        throw new NullPointerException("Null asCompletable");
    }

    @Override // com.spotify.intentrouter.g
    public a a() {
        return this.a;
    }

    @Override // com.spotify.intentrouter.g
    public String b() {
        return this.c;
    }

    @Override // com.spotify.intentrouter.g
    public String c() {
        return this.d;
    }

    @Override // com.spotify.intentrouter.g
    public T d() {
        return this.b;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof g)) {
            return false;
        }
        g gVar = (g) obj;
        if (!this.a.equals(gVar.a()) || !this.b.equals(gVar.d()) || !this.c.equals(gVar.b()) || !this.d.equals(gVar.c())) {
            return false;
        }
        return true;
    }

    public int hashCode() {
        return ((((((this.a.hashCode() ^ 1000003) * 1000003) ^ this.b.hashCode()) * 1000003) ^ this.c.hashCode()) * 1000003) ^ this.d.hashCode();
    }

    public String toString() {
        StringBuilder V0 = je.V0("Command{asCompletable=");
        V0.append(this.a);
        V0.append(", input=");
        V0.append((Object) this.b);
        V0.append(", description=");
        V0.append(this.c);
        V0.append(", factoryDescription=");
        return je.I0(V0, this.d, "}");
    }
}
