package com.spotify.music.nowplaying.podcast.mixedmedia.player;

import kotlin.jvm.internal.h;

public final class e {
    private final String a;
    private final boolean b;
    private final String c;
    private final Integer d;

    public e(String str, boolean z, String str2, Integer num) {
        h.e(str, "contextUri");
        this.a = str;
        this.b = z;
        this.c = str2;
        this.d = num;
    }

    public final boolean a() {
        return this.b;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof e)) {
            return false;
        }
        e eVar = (e) obj;
        return h.a(this.a, eVar.a) && this.b == eVar.b && h.a(this.c, eVar.c) && h.a(this.d, eVar.d);
    }

    public int hashCode() {
        String str = this.a;
        int i = 0;
        int hashCode = (str != null ? str.hashCode() : 0) * 31;
        boolean z = this.b;
        if (z) {
            z = true;
        }
        int i2 = z ? 1 : 0;
        int i3 = z ? 1 : 0;
        int i4 = z ? 1 : 0;
        int i5 = (hashCode + i2) * 31;
        String str2 = this.c;
        int hashCode2 = (i5 + (str2 != null ? str2.hashCode() : 0)) * 31;
        Integer num = this.d;
        if (num != null) {
            i = num.hashCode();
        }
        return hashCode2 + i;
    }

    public String toString() {
        StringBuilder V0 = je.V0("PodcastMixedMediaTrackListPlayerState(contextUri=");
        V0.append(this.a);
        V0.append(", isActuallyPlaying=");
        V0.append(this.b);
        V0.append(", trackUri=");
        V0.append(this.c);
        V0.append(", segmentIndex=");
        V0.append(this.d);
        V0.append(")");
        return V0.toString();
    }
}
