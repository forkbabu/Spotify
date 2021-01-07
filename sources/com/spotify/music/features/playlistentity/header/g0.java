package com.spotify.music.features.playlistentity.header;

import com.google.common.base.Optional;
import com.spotify.libs.facepile.d;
import com.spotify.music.features.playlistentity.header.h0;

/* access modifiers changed from: package-private */
public final class g0 extends h0.a {
    private final Optional<d> a;
    private final Optional<Integer> b;

    /* access modifiers changed from: package-private */
    public static final class b implements h0.a.AbstractC0243a {
        private Optional<d> a = Optional.absent();
        private Optional<Integer> b = Optional.absent();

        b() {
        }

        public h0.a a() {
            return new g0(this.a, this.b, null);
        }

        public h0.a.AbstractC0243a b(int i) {
            this.b = Optional.of(Integer.valueOf(i));
            return this;
        }

        public h0.a.AbstractC0243a c(d dVar) {
            this.a = Optional.of(dVar);
            return this;
        }
    }

    g0(Optional optional, Optional optional2, a aVar) {
        this.a = optional;
        this.b = optional2;
    }

    @Override // com.spotify.music.features.playlistentity.header.h0.a
    public Optional<Integer> a() {
        return this.b;
    }

    @Override // com.spotify.music.features.playlistentity.header.h0.a
    public Optional<d> b() {
        return this.a;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof h0.a)) {
            return false;
        }
        h0.a aVar = (h0.a) obj;
        if (!this.a.equals(aVar.b()) || !this.b.equals(aVar.a())) {
            return false;
        }
        return true;
    }

    public int hashCode() {
        return ((this.a.hashCode() ^ 1000003) * 1000003) ^ this.b.hashCode();
    }

    public String toString() {
        StringBuilder V0 = je.V0("Response{facePile=");
        V0.append(this.a);
        V0.append(", collaboratorCount=");
        return je.F0(V0, this.b, "}");
    }
}
