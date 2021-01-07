package com.spotify.music.features.hiddencontent.model;

import com.spotify.music.features.hiddencontent.model.c;

final class a extends c {
    private final com.spotify.playlist.models.b a;
    private final int b;

    /* access modifiers changed from: package-private */
    public static final class b implements c.a {
        private com.spotify.playlist.models.b a;
        private Integer b;

        b() {
        }

        @Override // com.spotify.music.features.hiddencontent.model.c.a
        public c.a a(int i) {
            this.b = Integer.valueOf(i);
            return this;
        }

        @Override // com.spotify.music.features.hiddencontent.model.c.a
        public c.a b(com.spotify.playlist.models.b bVar) {
            this.a = bVar;
            return this;
        }

        @Override // com.spotify.music.features.hiddencontent.model.c.a
        public c build() {
            String str = this.a == null ? " artist" : "";
            if (this.b == null) {
                str = je.x0(str, " index");
            }
            if (str.isEmpty()) {
                return new a(this.a, this.b.intValue(), null);
            }
            throw new IllegalStateException(je.x0("Missing required properties:", str));
        }
    }

    a(com.spotify.playlist.models.b bVar, int i, C0233a aVar) {
        this.a = bVar;
        this.b = i;
    }

    @Override // com.spotify.music.features.hiddencontent.model.c
    public com.spotify.playlist.models.b b() {
        return this.a;
    }

    @Override // com.spotify.music.features.hiddencontent.model.c
    public int c() {
        return this.b;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof c)) {
            return false;
        }
        c cVar = (c) obj;
        if (!this.a.equals(cVar.b()) || this.b != cVar.c()) {
            return false;
        }
        return true;
    }

    public int hashCode() {
        return ((this.a.hashCode() ^ 1000003) * 1000003) ^ this.b;
    }

    public String toString() {
        StringBuilder V0 = je.V0("ContextMenuArtist{artist=");
        V0.append(this.a);
        V0.append(", index=");
        return je.B0(V0, this.b, "}");
    }
}
