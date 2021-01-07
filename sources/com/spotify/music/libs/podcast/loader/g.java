package com.spotify.music.libs.podcast.loader;

import com.google.common.base.Optional;
import com.spotify.playlist.models.Episode;
import com.spotify.playlist.models.Show;

final class g extends r {
    private final Show a;
    private final Optional<Episode> b;

    g(Show show, Optional<Episode> optional) {
        if (show != null) {
            this.a = show;
            this.b = optional;
            return;
        }
        throw new NullPointerException("Null show");
    }

    @Override // com.spotify.music.libs.podcast.loader.r
    public Optional<Episode> a() {
        return this.b;
    }

    @Override // com.spotify.music.libs.podcast.loader.r
    public Show b() {
        return this.a;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof r)) {
            return false;
        }
        r rVar = (r) obj;
        if (!this.a.equals(rVar.b()) || !this.b.equals(rVar.a())) {
            return false;
        }
        return true;
    }

    public int hashCode() {
        return ((this.a.hashCode() ^ 1000003) * 1000003) ^ this.b.hashCode();
    }

    public String toString() {
        StringBuilder V0 = je.V0("ShowEntityResponse{show=");
        V0.append(this.a);
        V0.append(", episode=");
        return je.F0(V0, this.b, "}");
    }
}
