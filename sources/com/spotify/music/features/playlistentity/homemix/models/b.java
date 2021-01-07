package com.spotify.music.features.playlistentity.homemix.models;

import com.spotify.music.features.playlistentity.homemix.models.g;
import com.spotify.playlist.models.l;
import java.util.List;

/* access modifiers changed from: package-private */
public final class b extends g {
    private final l a;
    private final List<f> b;

    /* access modifiers changed from: package-private */
    /* renamed from: com.spotify.music.features.playlistentity.homemix.models.b$b  reason: collision with other inner class name */
    public static final class C0244b implements g.a {
        private l a;
        private List<f> b;

        C0244b() {
        }

        public g.a a(List<f> list) {
            if (list != null) {
                this.b = list;
                return this;
            }
            throw new NullPointerException("Null affinityUsers");
        }

        public g b() {
            String str = this.a == null ? " playlistItem" : "";
            if (this.b == null) {
                str = je.x0(str, " affinityUsers");
            }
            if (str.isEmpty()) {
                return new b(this.a, this.b, null);
            }
            throw new IllegalStateException(je.x0("Missing required properties:", str));
        }

        public g.a c(l lVar) {
            if (lVar != null) {
                this.a = lVar;
                return this;
            }
            throw new NullPointerException("Null playlistItem");
        }
    }

    b(l lVar, List list, a aVar) {
        this.a = lVar;
        this.b = list;
    }

    @Override // com.spotify.music.features.playlistentity.homemix.models.g
    public List<f> a() {
        return this.b;
    }

    @Override // com.spotify.music.features.playlistentity.homemix.models.g
    public l c() {
        return this.a;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof g)) {
            return false;
        }
        g gVar = (g) obj;
        if (!this.a.equals(gVar.c()) || !this.b.equals(gVar.a())) {
            return false;
        }
        return true;
    }

    public int hashCode() {
        return ((this.a.hashCode() ^ 1000003) * 1000003) ^ this.b.hashCode();
    }

    public String toString() {
        StringBuilder V0 = je.V0("HomeMixPlaylistItem{playlistItem=");
        V0.append(this.a);
        V0.append(", affinityUsers=");
        return je.L0(V0, this.b, "}");
    }
}
