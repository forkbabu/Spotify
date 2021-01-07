package com.spotify.music.yourlibrary.filterchips;

import com.spotify.music.yourlibrary.filterchips.l;

final class i extends l {
    private final String a;
    private final String b;
    private final Boolean c;

    /* access modifiers changed from: package-private */
    public static final class b extends l.a {
        private String a;
        private String b;
        private Boolean c;

        b() {
        }

        @Override // com.spotify.music.yourlibrary.filterchips.l.a
        public l a() {
            String str = this.a == null ? " id" : "";
            if (this.b == null) {
                str = je.x0(str, " title");
            }
            if (this.c == null) {
                str = je.x0(str, " isActive");
            }
            if (str.isEmpty()) {
                return new i(this.a, this.b, this.c, null);
            }
            throw new IllegalStateException(je.x0("Missing required properties:", str));
        }

        @Override // com.spotify.music.yourlibrary.filterchips.l.a
        public l.a b(String str) {
            if (str != null) {
                this.a = str;
                return this;
            }
            throw new NullPointerException("Null id");
        }

        @Override // com.spotify.music.yourlibrary.filterchips.l.a
        public l.a c(Boolean bool) {
            if (bool != null) {
                this.c = bool;
                return this;
            }
            throw new NullPointerException("Null isActive");
        }

        @Override // com.spotify.music.yourlibrary.filterchips.l.a
        public l.a d(String str) {
            if (str != null) {
                this.b = str;
                return this;
            }
            throw new NullPointerException("Null title");
        }
    }

    i(String str, String str2, Boolean bool, a aVar) {
        this.a = str;
        this.b = str2;
        this.c = bool;
    }

    @Override // com.spotify.music.yourlibrary.filterchips.l
    public String b() {
        return this.a;
    }

    @Override // com.spotify.music.yourlibrary.filterchips.l
    public Boolean c() {
        return this.c;
    }

    @Override // com.spotify.music.yourlibrary.filterchips.l
    public String d() {
        return this.b;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof l)) {
            return false;
        }
        l lVar = (l) obj;
        if (!this.a.equals(lVar.b()) || !this.b.equals(lVar.d()) || !this.c.equals(lVar.c())) {
            return false;
        }
        return true;
    }

    public int hashCode() {
        return ((((this.a.hashCode() ^ 1000003) * 1000003) ^ this.b.hashCode()) * 1000003) ^ this.c.hashCode();
    }

    public String toString() {
        StringBuilder V0 = je.V0("FilterChipsModelItem{id=");
        V0.append(this.a);
        V0.append(", title=");
        V0.append(this.b);
        V0.append(", isActive=");
        V0.append(this.c);
        V0.append("}");
        return V0.toString();
    }
}
