package com.spotify.music.libs.assistedcuration;

import com.google.common.base.Optional;
import com.spotify.android.paste.graphics.SpotifyIconV2;
import com.spotify.music.libs.assistedcuration.b;

/* access modifiers changed from: package-private */
public abstract class a extends b {
    private final int c;
    private final int f;
    private final int n;
    private final boolean o;
    private final SpotifyIconV2 p;
    private final Optional<String> q;

    a(int i, int i2, int i3, boolean z, SpotifyIconV2 spotifyIconV2, Optional<String> optional) {
        this.c = i;
        this.f = i2;
        this.n = i3;
        this.o = z;
        if (spotifyIconV2 != null) {
            this.p = spotifyIconV2;
            if (optional != null) {
                this.q = optional;
                return;
            }
            throw new NullPointerException("Null description");
        }
        throw new NullPointerException("Null trackAccessoryIcon");
    }

    @Override // com.spotify.music.libs.assistedcuration.b
    public Optional<String> b() {
        return this.q;
    }

    @Override // com.spotify.music.libs.assistedcuration.b
    public boolean c() {
        return this.o;
    }

    @Override // com.spotify.music.libs.assistedcuration.b
    public int e() {
        return this.c;
    }

    @Override // java.lang.Object
    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof b)) {
            return false;
        }
        b bVar = (b) obj;
        if (this.c == bVar.e() && this.f == bVar.f() && this.n == bVar.g() && this.o == bVar.c() && this.p.equals(bVar.i()) && this.q.equals(bVar.b())) {
            return true;
        }
        return false;
    }

    @Override // com.spotify.music.libs.assistedcuration.b
    public int f() {
        return this.f;
    }

    @Override // com.spotify.music.libs.assistedcuration.b
    public int g() {
        return this.n;
    }

    @Override // com.spotify.music.libs.assistedcuration.b
    public b.AbstractC0281b h() {
        return new b(this, null);
    }

    @Override // java.lang.Object
    public int hashCode() {
        return ((((((((((this.c ^ 1000003) * 1000003) ^ this.f) * 1000003) ^ this.n) * 1000003) ^ (this.o ? 1231 : 1237)) * 1000003) ^ this.p.hashCode()) * 1000003) ^ this.q.hashCode();
    }

    @Override // com.spotify.music.libs.assistedcuration.b
    public SpotifyIconV2 i() {
        return this.p;
    }

    @Override // java.lang.Object
    public String toString() {
        StringBuilder V0 = je.V0("AssistedCurationConfiguration{numberOfTracksPerCardInitially=");
        V0.append(this.c);
        V0.append(", numberOfTracksToExpandACardWith=");
        V0.append(this.f);
        V0.append(", numberOfTracksToExpandATrackWith=");
        V0.append(this.n);
        V0.append(", hideLoadMoreButton=");
        V0.append(this.o);
        V0.append(", trackAccessoryIcon=");
        V0.append(this.p);
        V0.append(", description=");
        return je.F0(V0, this.q, "}");
    }

    /* access modifiers changed from: package-private */
    public static class b implements b.AbstractC0281b {
        private Integer a;
        private Integer b;
        private Integer c;
        private Boolean d;
        private SpotifyIconV2 e;
        private Optional<String> f = Optional.absent();

        b() {
        }

        @Override // com.spotify.music.libs.assistedcuration.b.AbstractC0281b
        public b.AbstractC0281b a(int i) {
            this.c = Integer.valueOf(i);
            return this;
        }

        @Override // com.spotify.music.libs.assistedcuration.b.AbstractC0281b
        public b.AbstractC0281b b(boolean z) {
            this.d = Boolean.valueOf(z);
            return this;
        }

        @Override // com.spotify.music.libs.assistedcuration.b.AbstractC0281b
        public b build() {
            String str = this.a == null ? " numberOfTracksPerCardInitially" : "";
            if (this.b == null) {
                str = je.x0(str, " numberOfTracksToExpandACardWith");
            }
            if (this.c == null) {
                str = je.x0(str, " numberOfTracksToExpandATrackWith");
            }
            if (this.d == null) {
                str = je.x0(str, " hideLoadMoreButton");
            }
            if (this.e == null) {
                str = je.x0(str, " trackAccessoryIcon");
            }
            if (str.isEmpty()) {
                return new e(this.a.intValue(), this.b.intValue(), this.c.intValue(), this.d.booleanValue(), this.e, this.f);
            }
            throw new IllegalStateException(je.x0("Missing required properties:", str));
        }

        @Override // com.spotify.music.libs.assistedcuration.b.AbstractC0281b
        public b.AbstractC0281b c(SpotifyIconV2 spotifyIconV2) {
            if (spotifyIconV2 != null) {
                this.e = spotifyIconV2;
                return this;
            }
            throw new NullPointerException("Null trackAccessoryIcon");
        }

        @Override // com.spotify.music.libs.assistedcuration.b.AbstractC0281b
        public b.AbstractC0281b d(Optional<String> optional) {
            this.f = optional;
            return this;
        }

        @Override // com.spotify.music.libs.assistedcuration.b.AbstractC0281b
        public b.AbstractC0281b e(int i) {
            this.a = Integer.valueOf(i);
            return this;
        }

        public b.AbstractC0281b f(int i) {
            this.b = Integer.valueOf(i);
            return this;
        }

        b(b bVar, C0279a aVar) {
            this.a = Integer.valueOf(bVar.e());
            this.b = Integer.valueOf(bVar.f());
            this.c = Integer.valueOf(bVar.g());
            this.d = Boolean.valueOf(bVar.c());
            this.e = bVar.i();
            this.f = bVar.b();
        }
    }
}
