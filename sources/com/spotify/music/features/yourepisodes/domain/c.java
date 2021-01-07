package com.spotify.music.features.yourepisodes.domain;

import kotlin.jvm.internal.h;

public final class c {
    private final onc a;
    private final boolean b;

    public c(onc onc, boolean z) {
        h.e(onc, "podcastPlayerState");
        this.a = onc;
        this.b = z;
    }

    public final onc a() {
        return this.a;
    }

    public final boolean b() {
        return this.b;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof c)) {
            return false;
        }
        c cVar = (c) obj;
        return h.a(this.a, cVar.a) && this.b == cVar.b;
    }

    public int hashCode() {
        onc onc = this.a;
        int hashCode = (onc != null ? onc.hashCode() : 0) * 31;
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
        StringBuilder V0 = je.V0("PlayerStateModel(podcastPlayerState=");
        V0.append(this.a);
        V0.append(", isPlayingYourEpisodes=");
        return je.P0(V0, this.b, ")");
    }
}
