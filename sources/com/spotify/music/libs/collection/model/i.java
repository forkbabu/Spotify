package com.spotify.music.libs.collection.model;

import com.spotify.music.libs.collection.model.d;
import java.util.List;

final class i extends d {
    private final List<com.spotify.playlist.models.a> a;
    private final boolean b;
    private final int c;
    private final int f;

    /* access modifiers changed from: package-private */
    public static final class b implements d.a {
        private List<com.spotify.playlist.models.a> a;
        private Boolean b;
        private Integer c;
        private Integer d;

        b() {
        }

        @Override // com.spotify.music.libs.collection.model.d.a
        public d.a a(List<com.spotify.playlist.models.a> list) {
            if (list != null) {
                this.a = list;
                return this;
            }
            throw new NullPointerException("Null items");
        }

        @Override // com.spotify.music.libs.collection.model.d.a
        public d.a b(int i) {
            this.d = Integer.valueOf(i);
            return this;
        }

        @Override // com.spotify.music.libs.collection.model.d.a
        public d build() {
            String str = this.a == null ? " items" : "";
            if (this.b == null) {
                str = je.x0(str, " loading");
            }
            if (this.c == null) {
                str = je.x0(str, " unfilteredLength");
            }
            if (this.d == null) {
                str = je.x0(str, " unrangedLength");
            }
            if (str.isEmpty()) {
                return new i(this.a, this.b.booleanValue(), this.c.intValue(), this.d.intValue(), null);
            }
            throw new IllegalStateException(je.x0("Missing required properties:", str));
        }

        @Override // com.spotify.music.libs.collection.model.d.a
        public d.a c(boolean z) {
            this.b = Boolean.valueOf(z);
            return this;
        }

        @Override // com.spotify.music.libs.collection.model.d.a
        public d.a d(int i) {
            this.c = Integer.valueOf(i);
            return this;
        }
    }

    i(List list, boolean z, int i, int i2, a aVar) {
        this.a = list;
        this.b = z;
        this.c = i;
        this.f = i2;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof d)) {
            return false;
        }
        d dVar = (d) obj;
        if (this.a.equals(((i) dVar).a)) {
            i iVar = (i) dVar;
            if (this.b == iVar.b && this.c == iVar.c && this.f == iVar.f) {
                return true;
            }
        }
        return false;
    }

    @Override // com.spotify.playlist.models.i
    public List<com.spotify.playlist.models.a> getItems() {
        return this.a;
    }

    @Override // com.spotify.playlist.models.i
    public int getUnfilteredLength() {
        return this.c;
    }

    @Override // com.spotify.playlist.models.i
    public int getUnrangedLength() {
        return this.f;
    }

    public int hashCode() {
        return ((((((this.a.hashCode() ^ 1000003) * 1000003) ^ (this.b ? 1231 : 1237)) * 1000003) ^ this.c) * 1000003) ^ this.f;
    }

    @Override // com.spotify.playlist.models.i
    public boolean isLoading() {
        return this.b;
    }

    public String toString() {
        StringBuilder V0 = je.V0("Albums{items=");
        V0.append(this.a);
        V0.append(", loading=");
        V0.append(this.b);
        V0.append(", unfilteredLength=");
        V0.append(this.c);
        V0.append(", unrangedLength=");
        return je.B0(V0, this.f, "}");
    }
}
