package com.spotify.music.features.editplaylist.operations;

import com.spotify.music.features.editplaylist.operations.v;

/* access modifiers changed from: package-private */
public abstract class b extends v {
    private final String a;
    private final String b;

    static class a implements v.a {
        private String a;
        private String b;

        a() {
        }

        public v a() {
            String str = this.a == null ? " playlistUri" : "";
            if (this.b == null) {
                str = je.x0(str, " rowId");
            }
            if (str.isEmpty()) {
                return new p(this.a, this.b);
            }
            throw new IllegalStateException(je.x0("Missing required properties:", str));
        }

        public v.a b(String str) {
            if (str != null) {
                this.a = str;
                return this;
            }
            throw new NullPointerException("Null playlistUri");
        }

        public v.a c(String str) {
            if (str != null) {
                this.b = str;
                return this;
            }
            throw new NullPointerException("Null rowId");
        }
    }

    b(String str, String str2) {
        if (str != null) {
            this.a = str;
            if (str2 != null) {
                this.b = str2;
                return;
            }
            throw new NullPointerException("Null rowId");
        }
        throw new NullPointerException("Null playlistUri");
    }

    /* access modifiers changed from: protected */
    @Override // com.spotify.music.features.editplaylist.operations.v
    public String a() {
        return this.a;
    }

    /* access modifiers changed from: protected */
    @Override // com.spotify.music.features.editplaylist.operations.v
    public String b() {
        return this.b;
    }

    @Override // java.lang.Object
    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof v)) {
            return false;
        }
        v vVar = (v) obj;
        if (!this.a.equals(vVar.a()) || !this.b.equals(vVar.b())) {
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
        StringBuilder V0 = je.V0("DeleteOperation{playlistUri=");
        V0.append(this.a);
        V0.append(", rowId=");
        return je.I0(V0, this.b, "}");
    }
}
