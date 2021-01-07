package com.spotify.music.podcast.ui.trailer;

import com.spotify.music.podcast.ui.trailer.e;

/* access modifiers changed from: package-private */
public final class c extends e {
    private final Long a;
    private final Long b;
    private final Long c;

    /* access modifiers changed from: package-private */
    public static final class b implements e.a {
        private Long a;
        private Long b;
        private Long c;

        b() {
        }

        @Override // com.spotify.music.podcast.ui.trailer.e.a
        public e.a a(Long l) {
            if (l != null) {
                this.c = l;
                return this;
            }
            throw new NullPointerException("Null timestamp");
        }

        @Override // com.spotify.music.podcast.ui.trailer.e.a
        public e.a b(Long l) {
            if (l != null) {
                this.b = l;
                return this;
            }
            throw new NullPointerException("Null duration");
        }

        @Override // com.spotify.music.podcast.ui.trailer.e.a
        public e build() {
            String str = this.a == null ? " position" : "";
            if (this.b == null) {
                str = je.x0(str, " duration");
            }
            if (this.c == null) {
                str = je.x0(str, " timestamp");
            }
            if (str.isEmpty()) {
                return new c(this.a, this.b, this.c, null);
            }
            throw new IllegalStateException(je.x0("Missing required properties:", str));
        }

        @Override // com.spotify.music.podcast.ui.trailer.e.a
        public e.a position(Long l) {
            if (l != null) {
                this.a = l;
                return this;
            }
            throw new NullPointerException("Null position");
        }
    }

    c(Long l, Long l2, Long l3, a aVar) {
        this.a = l;
        this.b = l2;
        this.c = l3;
    }

    @Override // com.spotify.music.podcast.ui.trailer.e
    public Long b() {
        return this.b;
    }

    @Override // com.spotify.music.podcast.ui.trailer.e
    public Long c() {
        return this.a;
    }

    @Override // com.spotify.music.podcast.ui.trailer.e
    public Long d() {
        return this.c;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof e)) {
            return false;
        }
        e eVar = (e) obj;
        if (!this.a.equals(eVar.c()) || !this.b.equals(eVar.b()) || !this.c.equals(eVar.d())) {
            return false;
        }
        return true;
    }

    public int hashCode() {
        return ((((this.a.hashCode() ^ 1000003) * 1000003) ^ this.b.hashCode()) * 1000003) ^ this.c.hashCode();
    }

    public String toString() {
        StringBuilder V0 = je.V0("PodcastTrailerOverlayState{position=");
        V0.append(this.a);
        V0.append(", duration=");
        V0.append(this.b);
        V0.append(", timestamp=");
        V0.append(this.c);
        V0.append("}");
        return V0.toString();
    }
}
