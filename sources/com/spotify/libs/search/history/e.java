package com.spotify.libs.search.history;

import com.spotify.libs.search.history.m;

/* access modifiers changed from: package-private */
public final class e extends m.a {
    private final String a;
    private final String b;

    e(String str, String str2) {
        if (str != null) {
            this.a = str;
            if (str2 != null) {
                this.b = str2;
                return;
            }
            throw new NullPointerException("Null tag");
        }
        throw new NullPointerException("Null username");
    }

    @Override // com.spotify.libs.search.history.m.a
    public String a() {
        return this.b;
    }

    @Override // com.spotify.libs.search.history.m.a
    public String b() {
        return this.a;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof m.a)) {
            return false;
        }
        m.a aVar = (m.a) obj;
        if (!this.a.equals(aVar.b()) || !this.b.equals(aVar.a())) {
            return false;
        }
        return true;
    }

    public int hashCode() {
        return ((this.a.hashCode() ^ 1000003) * 1000003) ^ this.b.hashCode();
    }

    public String toString() {
        StringBuilder V0 = je.V0("UsernameTagPair{username=");
        V0.append(this.a);
        V0.append(", tag=");
        return je.I0(V0, this.b, "}");
    }
}
