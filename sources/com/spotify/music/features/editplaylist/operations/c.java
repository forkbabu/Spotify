package com.spotify.music.features.editplaylist.operations;

import com.spotify.music.features.editplaylist.operations.y;

/* access modifiers changed from: package-private */
public abstract class c extends y {
    private final String a;
    private final String b;

    static class a implements y.a {
        private String a;
        private String b;

        a() {
        }

        public y a() {
            String str = this.a == null ? " playlistUri" : "";
            if (this.b == null) {
                str = je.x0(str, " playlistDescription");
            }
            if (str.isEmpty()) {
                return new q(this.a, this.b);
            }
            throw new IllegalStateException(je.x0("Missing required properties:", str));
        }

        public y.a b(String str) {
            if (str != null) {
                this.b = str;
                return this;
            }
            throw new NullPointerException("Null playlistDescription");
        }

        public y.a c(String str) {
            if (str != null) {
                this.a = str;
                return this;
            }
            throw new NullPointerException("Null playlistUri");
        }
    }

    c(String str, String str2) {
        if (str != null) {
            this.a = str;
            if (str2 != null) {
                this.b = str2;
                return;
            }
            throw new NullPointerException("Null playlistDescription");
        }
        throw new NullPointerException("Null playlistUri");
    }

    /* access modifiers changed from: protected */
    @Override // com.spotify.music.features.editplaylist.operations.y
    public String a() {
        return this.b;
    }

    /* access modifiers changed from: protected */
    @Override // com.spotify.music.features.editplaylist.operations.y
    public String b() {
        return this.a;
    }

    @Override // java.lang.Object
    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof y)) {
            return false;
        }
        y yVar = (y) obj;
        if (!this.a.equals(yVar.b()) || !this.b.equals(yVar.a())) {
            return false;
        }
        return true;
    }

    @Override // java.lang.Object
    public int hashCode() {
        return ((this.a.hashCode() ^ 1000003) * 1000003) ^ this.b.hashCode();
    }

    @Override // java.lang.Object
    public String toString() {
        StringBuilder V0 = je.V0("DescribeOperation{playlistUri=");
        V0.append(this.a);
        V0.append(", playlistDescription=");
        return je.I0(V0, this.b, "}");
    }
}
