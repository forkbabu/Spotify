package com.spotify.music.libs.collection.model;

import com.spotify.mobile.android.spotlets.collection.util.CollectionStateProvider;
import com.spotify.music.libs.collection.model.a;
import java.util.Map;

final class g extends a {
    private final com.spotify.playlist.models.a a;
    private final Map<String, CollectionStateProvider.a> b;

    static final class b implements a.AbstractC0282a {
        private com.spotify.playlist.models.a a;
        private Map<String, CollectionStateProvider.a> b;

        b() {
        }

        @Override // com.spotify.music.libs.collection.model.a.AbstractC0282a
        public a build() {
            String str = this.a == null ? " album" : "";
            if (this.b == null) {
                str = je.x0(str, " albumTracksCollectionState");
            }
            if (str.isEmpty()) {
                return new g(this.a, this.b, null);
            }
            throw new IllegalStateException(je.x0("Missing required properties:", str));
        }

        @Override // com.spotify.music.libs.collection.model.a.AbstractC0282a
        public a.AbstractC0282a g(com.spotify.playlist.models.a aVar) {
            if (aVar != null) {
                this.a = aVar;
                return this;
            }
            throw new NullPointerException("Null album");
        }

        @Override // com.spotify.music.libs.collection.model.a.AbstractC0282a
        public a.AbstractC0282a h(Map<String, CollectionStateProvider.a> map) {
            if (map != null) {
                this.b = map;
                return this;
            }
            throw new NullPointerException("Null albumTracksCollectionState");
        }
    }

    g(com.spotify.playlist.models.a aVar, Map map, a aVar2) {
        this.a = aVar;
        this.b = map;
    }

    @Override // com.spotify.music.libs.collection.model.a
    public com.spotify.playlist.models.a b() {
        return this.a;
    }

    @Override // com.spotify.music.libs.collection.model.a
    public Map<String, CollectionStateProvider.a> c() {
        return this.b;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof a)) {
            return false;
        }
        a aVar = (a) obj;
        if (!this.a.equals(aVar.b()) || !this.b.equals(aVar.c())) {
            return false;
        }
        return true;
    }

    public int hashCode() {
        return ((this.a.hashCode() ^ 1000003) * 1000003) ^ this.b.hashCode();
    }

    public String toString() {
        StringBuilder V0 = je.V0("AlbumContextMenuModel{album=");
        V0.append(this.a);
        V0.append(", albumTracksCollectionState=");
        return je.M0(V0, this.b, "}");
    }
}
