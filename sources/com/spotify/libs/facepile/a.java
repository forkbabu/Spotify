package com.spotify.libs.facepile;

/* access modifiers changed from: package-private */
public final class a extends c {
    private final String b;
    private final String c;
    private final int d;

    a(String str, String str2, int i) {
        this.b = str;
        if (str2 != null) {
            this.c = str2;
            this.d = i;
            return;
        }
        throw new NullPointerException("Null initials");
    }

    @Override // com.spotify.libs.facepile.c
    public int b() {
        return this.d;
    }

    @Override // com.spotify.libs.facepile.c
    public String c() {
        return this.b;
    }

    @Override // com.spotify.libs.facepile.c
    public String d() {
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
        String str = this.b;
        if (str != null ? str.equals(cVar.c()) : cVar.c() == null) {
            if (this.c.equals(cVar.d()) && this.d == cVar.b()) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        String str = this.b;
        return (((((str == null ? 0 : str.hashCode()) ^ 1000003) * 1000003) ^ this.c.hashCode()) * 1000003) ^ this.d;
    }

    public String toString() {
        StringBuilder V0 = je.V0("Face{faceImageUri=");
        V0.append(this.b);
        V0.append(", initials=");
        V0.append(this.c);
        V0.append(", color=");
        return je.B0(V0, this.d, "}");
    }
}
