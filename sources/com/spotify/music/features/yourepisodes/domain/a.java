package com.spotify.music.features.yourepisodes.domain;

import com.spotify.playlist.models.Episode;
import kotlin.jvm.internal.h;

public final class a {
    private final Episode a;
    private final boolean b;

    public a(Episode episode, boolean z) {
        h.e(episode, "episode");
        this.a = episode;
        this.b = z;
    }

    public final boolean a() {
        return this.b;
    }

    public final Episode b() {
        return this.a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a)) {
            return false;
        }
        a aVar = (a) obj;
        return h.a(this.a, aVar.a) && this.b == aVar.b;
    }

    public int hashCode() {
        Episode episode = this.a;
        int hashCode = (episode != null ? episode.hashCode() : 0) * 31;
        boolean z = this.b;
        if (z) {
            z = true;
        }
        int i = z ? 1 : 0;
        int i2 = z ? 1 : 0;
        int i3 = z ? 1 : 0;
        return hashCode + i;
    }

    public String toString() {
        StringBuilder V0 = je.V0("EpisodeModel(episode=");
        V0.append(this.a);
        V0.append(", canDownload=");
        return je.P0(V0, this.b, ")");
    }
}
