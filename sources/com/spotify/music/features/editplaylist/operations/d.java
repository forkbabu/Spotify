package com.spotify.music.features.editplaylist.operations;

import com.spotify.music.features.editplaylist.operations.b0;

/* access modifiers changed from: package-private */
public abstract class d extends b0 {
    private final String a;
    private final String b;
    private final String c;

    static class a implements b0.a {
        private String a;
        private String b;
        private String c;

        a() {
        }

        public b0 a() {
            String str = this.a == null ? " playlistUri" : "";
            if (this.b == null) {
                str = je.x0(str, " rowId");
            }
            if (str.isEmpty()) {
                return new r(this.a, this.b, this.c);
            }
            throw new IllegalStateException(je.x0("Missing required properties:", str));
        }

        public b0.a b(String str) {
            this.c = str;
            return this;
        }

        public b0.a c(String str) {
            if (str != null) {
                this.a = str;
                return this;
            }
            throw new NullPointerException("Null playlistUri");
        }

        public b0.a d(String str) {
            if (str != null) {
                this.b = str;
                return this;
            }
            throw new NullPointerException("Null rowId");
        }
    }

    d(String str, String str2, String str3) {
        if (str != null) {
            this.a = str;
            if (str2 != null) {
                this.b = str2;
                this.c = str3;
                return;
            }
            throw new NullPointerException("Null rowId");
        }
        throw new NullPointerException("Null playlistUri");
    }

    /* access modifiers changed from: protected */
    @Override // com.spotify.music.features.editplaylist.operations.b0
    public String a() {
        return this.c;
    }

    /* access modifiers changed from: protected */
    @Override // com.spotify.music.features.editplaylist.operations.b0
    public String b() {
        return this.a;
    }

    /* access modifiers changed from: protected */
    @Override // com.spotify.music.features.editplaylist.operations.b0
    public String c() {
        return this.b;
    }

    @Override // java.lang.Object
    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof b0)) {
            return false;
        }
        b0 b0Var = (b0) obj;
        if (this.a.equals(b0Var.b()) && this.b.equals(b0Var.c())) {
            String str = this.c;
            if (str == null) {
                if (b0Var.a() == null) {
                    return true;
                }
            } else if (str.equals(b0Var.a())) {
                return true;
            }
        }
        return false;
    }

    @Override // java.lang.Object
    public int hashCode() {
        int hashCode = (((this.a.hashCode() ^ 1000003) * 1000003) ^ this.b.hashCode()) * 1000003;
        String str = this.c;
        return hashCode ^ (str == null ? 0 : str.hashCode());
    }

    @Override // java.lang.Object
    public String toString() {
        StringBuilder V0 = je.V0("MoveOperation{playlistUri=");
        V0.append(this.a);
        V0.append(", rowId=");
        V0.append(this.b);
        V0.append(", moveBeforeRowId=");
        return je.I0(V0, this.c, "}");
    }
}
