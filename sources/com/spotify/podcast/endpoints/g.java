package com.spotify.podcast.endpoints;

/* access modifiers changed from: package-private */
public final class g extends r {
    private final int a;
    private final int b;

    g(int i, int i2) {
        this.a = i;
        this.b = i2;
    }

    @Override // com.spotify.podcast.endpoints.r
    public int b() {
        return this.b;
    }

    @Override // com.spotify.podcast.endpoints.r
    public int c() {
        return this.a;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof r)) {
            return false;
        }
        r rVar = (r) obj;
        if (this.a == rVar.c() && this.b == rVar.b()) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        return ((this.a ^ 1000003) * 1000003) ^ this.b;
    }

    public String toString() {
        StringBuilder V0 = je.V0("Range{start=");
        V0.append(this.a);
        V0.append(", length=");
        return je.B0(V0, this.b, "}");
    }
}
