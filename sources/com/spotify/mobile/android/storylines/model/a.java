package com.spotify.mobile.android.storylines.model;

import com.spotify.mobile.android.storylines.model.b;

final class a extends b {
    private final String a;
    private final String b;
    private final String c;
    private final String d;

    /* access modifiers changed from: package-private */
    public static final class b extends b.a {
        private String a;
        private String b;
        private String c;
        private String d;

        b() {
        }

        @Override // com.spotify.mobile.android.storylines.model.b.a
        public b.a a(String str) {
            if (str != null) {
                this.d = str;
                return this;
            }
            throw new NullPointerException("Null assetId");
        }

        @Override // com.spotify.mobile.android.storylines.model.b.a
        public b b() {
            String str = this.a == null ? " entityUri" : "";
            if (this.b == null) {
                str = je.x0(str, " storylineGid");
            }
            if (this.c == null) {
                str = je.x0(str, " playbackId");
            }
            if (this.d == null) {
                str = je.x0(str, " assetId");
            }
            if (str.isEmpty()) {
                return new a(this.a, this.b, this.c, this.d, null);
            }
            throw new IllegalStateException(je.x0("Missing required properties:", str));
        }

        @Override // com.spotify.mobile.android.storylines.model.b.a
        public b.a c(String str) {
            if (str != null) {
                this.a = str;
                return this;
            }
            throw new NullPointerException("Null entityUri");
        }

        @Override // com.spotify.mobile.android.storylines.model.b.a
        public b.a d(String str) {
            if (str != null) {
                this.c = str;
                return this;
            }
            throw new NullPointerException("Null playbackId");
        }

        @Override // com.spotify.mobile.android.storylines.model.b.a
        public b.a e(String str) {
            if (str != null) {
                this.b = str;
                return this;
            }
            throw new NullPointerException("Null storylineGid");
        }

        b(b bVar, C0195a aVar) {
            this.a = bVar.c();
            this.b = bVar.e();
            this.c = bVar.d();
            this.d = bVar.b();
        }
    }

    a(String str, String str2, String str3, String str4, C0195a aVar) {
        this.a = str;
        this.b = str2;
        this.c = str3;
        this.d = str4;
    }

    @Override // com.spotify.mobile.android.storylines.model.b
    public String b() {
        return this.d;
    }

    @Override // com.spotify.mobile.android.storylines.model.b
    public String c() {
        return this.a;
    }

    @Override // com.spotify.mobile.android.storylines.model.b
    public String d() {
        return this.c;
    }

    @Override // com.spotify.mobile.android.storylines.model.b
    public String e() {
        return this.b;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof b)) {
            return false;
        }
        b bVar = (b) obj;
        if (!this.a.equals(bVar.c()) || !this.b.equals(bVar.e()) || !this.c.equals(bVar.d()) || !this.d.equals(bVar.b())) {
            return false;
        }
        return true;
    }

    @Override // com.spotify.mobile.android.storylines.model.b
    public b.a f() {
        return new b(this, null);
    }

    public int hashCode() {
        return ((((((this.a.hashCode() ^ 1000003) * 1000003) ^ this.b.hashCode()) * 1000003) ^ this.c.hashCode()) * 1000003) ^ this.d.hashCode();
    }

    public String toString() {
        StringBuilder V0 = je.V0("StorylinesLoggingData{entityUri=");
        V0.append(this.a);
        V0.append(", storylineGid=");
        V0.append(this.b);
        V0.append(", playbackId=");
        V0.append(this.c);
        V0.append(", assetId=");
        return je.I0(V0, this.d, "}");
    }
}
