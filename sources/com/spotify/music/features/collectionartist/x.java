package com.spotify.music.features.collectionartist;

import com.spotify.music.features.collectionartist.CollectionArtistFragment;

/* access modifiers changed from: package-private */
public final class x extends CollectionArtistFragment.h {
    private final li0 a;
    private final boolean b;

    static final class b implements CollectionArtistFragment.h.a {
        private li0 a;
        private Boolean b;

        b() {
        }

        public CollectionArtistFragment.h.a a(li0 li0) {
            if (li0 != null) {
                this.a = li0;
                return this;
            }
            throw new NullPointerException("Null artistEntity");
        }

        public CollectionArtistFragment.h b() {
            String str = this.a == null ? " artistEntity" : "";
            if (this.b == null) {
                str = je.x0(str, " isOnline");
            }
            if (str.isEmpty()) {
                return new x(this.a, this.b.booleanValue(), null);
            }
            throw new IllegalStateException(je.x0("Missing required properties:", str));
        }

        public CollectionArtistFragment.h.a c(boolean z) {
            this.b = Boolean.valueOf(z);
            return this;
        }
    }

    x(li0 li0, boolean z, a aVar) {
        this.a = li0;
        this.b = z;
    }

    @Override // com.spotify.music.features.collectionartist.CollectionArtistFragment.h
    public li0 a() {
        return this.a;
    }

    @Override // com.spotify.music.features.collectionartist.CollectionArtistFragment.h
    public boolean b() {
        return this.b;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof CollectionArtistFragment.h)) {
            return false;
        }
        CollectionArtistFragment.h hVar = (CollectionArtistFragment.h) obj;
        if (!this.a.equals(hVar.a()) || this.b != hVar.b()) {
            return false;
        }
        return true;
    }

    public int hashCode() {
        return ((this.a.hashCode() ^ 1000003) * 1000003) ^ (this.b ? 1231 : 1237);
    }

    public String toString() {
        StringBuilder V0 = je.V0("Data{artistEntity=");
        V0.append(this.a);
        V0.append(", isOnline=");
        return je.P0(V0, this.b, "}");
    }
}
