package com.spotify.voice.api.model;

import com.spotify.voice.api.model.j;

final class d extends j {
    private final String a;
    private final String b;
    private final int c;

    /* access modifiers changed from: package-private */
    public static final class b implements j.a {
        private String a;
        private String b;
        private Integer c;

        b() {
        }

        @Override // com.spotify.voice.api.model.j.a
        public j.a a(String str) {
            this.b = str;
            return this;
        }

        @Override // com.spotify.voice.api.model.j.a
        public j.a b(String str) {
            if (str != null) {
                this.a = str;
                return this;
            }
            throw new NullPointerException("Null host");
        }

        @Override // com.spotify.voice.api.model.j.a
        public j build() {
            String str = this.a == null ? " host" : "";
            if (this.b == null) {
                str = je.x0(str, " path");
            }
            if (this.c == null) {
                str = je.x0(str, " port");
            }
            if (str.isEmpty()) {
                return new d(this.a, this.b, this.c.intValue(), null);
            }
            throw new IllegalStateException(je.x0("Missing required properties:", str));
        }

        public j.a c(int i) {
            this.c = Integer.valueOf(i);
            return this;
        }
    }

    d(String str, String str2, int i, a aVar) {
        this.a = str;
        this.b = str2;
        this.c = i;
    }

    @Override // com.spotify.voice.api.model.j
    public String b() {
        return this.a;
    }

    @Override // com.spotify.voice.api.model.j
    public String d() {
        return this.b;
    }

    @Override // com.spotify.voice.api.model.j
    public int e() {
        return this.c;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof j)) {
            return false;
        }
        j jVar = (j) obj;
        if (!this.a.equals(jVar.b()) || !this.b.equals(jVar.d()) || this.c != jVar.e()) {
            return false;
        }
        return true;
    }

    public int hashCode() {
        return ((((this.a.hashCode() ^ 1000003) * 1000003) ^ this.b.hashCode()) * 1000003) ^ this.c;
    }

    public String toString() {
        StringBuilder V0 = je.V0("SpeechProxyBackend{host=");
        V0.append(this.a);
        V0.append(", path=");
        V0.append(this.b);
        V0.append(", port=");
        return je.B0(V0, this.c, "}");
    }
}
