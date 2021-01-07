package com.spotify.music.features.editplaylist.operations;

import com.spotify.music.features.editplaylist.operations.l0;

/* access modifiers changed from: package-private */
public abstract class e extends l0 {
    private final String a;
    private final String b;

    static class a implements l0.a {
        private String a;
        private String b;

        a() {
        }

        public l0 a() {
            String str = this.a == null ? " playlistUri" : "";
            if (this.b == null) {
                str = je.x0(str, " playlistName");
            }
            if (str.isEmpty()) {
                return new s(this.a, this.b);
            }
            throw new IllegalStateException(je.x0("Missing required properties:", str));
        }

        public l0.a b(String str) {
            if (str != null) {
                this.b = str;
                return this;
            }
            throw new NullPointerException("Null playlistName");
        }

        public l0.a c(String str) {
            if (str != null) {
                this.a = str;
                return this;
            }
            throw new NullPointerException("Null playlistUri");
        }
    }

    e(String str, String str2) {
        if (str != null) {
            this.a = str;
            if (str2 != null) {
                this.b = str2;
                return;
            }
            throw new NullPointerException("Null playlistName");
        }
        throw new NullPointerException("Null playlistUri");
    }

    /* access modifiers changed from: protected */
    @Override // com.spotify.music.features.editplaylist.operations.l0
    public String a() {
        return this.b;
    }

    /* access modifiers changed from: protected */
    @Override // com.spotify.music.features.editplaylist.operations.l0
    public String b() {
        return this.a;
    }

    @Override // java.lang.Object
    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof l0)) {
            return false;
        }
        l0 l0Var = (l0) obj;
        if (!this.a.equals(l0Var.b()) || !this.b.equals(l0Var.a())) {
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
        StringBuilder V0 = je.V0("RenameOperation{playlistUri=");
        V0.append(this.a);
        V0.append(", playlistName=");
        return je.I0(V0, this.b, "}");
    }
}
