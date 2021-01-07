package com.spotify.music.features.nowplayingbar.domain;

public final class g {
    private final boolean a;
    private final long b;
    private final long c;
    private final float d;

    public g(boolean z, long j, long j2, float f) {
        this.a = z;
        this.b = j;
        this.c = j2;
        this.d = f;
    }

    public final long a() {
        return this.b;
    }

    public final float b() {
        return this.d;
    }

    public final long c() {
        return this.c;
    }

    public final boolean d() {
        return this.a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof g)) {
            return false;
        }
        g gVar = (g) obj;
        return this.a == gVar.a && this.b == gVar.b && this.c == gVar.c && Float.compare(this.d, gVar.d) == 0;
    }

    public int hashCode() {
        boolean z = this.a;
        if (z) {
            z = true;
        }
        int i = z ? 1 : 0;
        int i2 = z ? 1 : 0;
        int i3 = z ? 1 : 0;
        return Float.floatToIntBits(this.d) + (((((i * 31) + e.a(this.b)) * 31) + e.a(this.c)) * 31);
    }

    public String toString() {
        StringBuilder V0 = je.V0("PlaybackState(isPlaying=");
        V0.append(this.a);
        V0.append(", duration=");
        V0.append(this.b);
        V0.append(", position=");
        V0.append(this.c);
        V0.append(", playbackSpeed=");
        V0.append(this.d);
        V0.append(")");
        return V0.toString();
    }
}
