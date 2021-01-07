package com.spotify.music.features.queue.v2;

public final class a {
    private final long a;
    private final long b;
    private final float c;

    public a(long j, long j2, float f) {
        this.a = j;
        this.b = j2;
        this.c = f;
    }

    public final long a() {
        return this.b;
    }

    public final long b() {
        return this.a;
    }

    public final float c() {
        return this.c;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a)) {
            return false;
        }
        a aVar = (a) obj;
        return this.a == aVar.a && this.b == aVar.b && Float.compare(this.c, aVar.c) == 0;
    }

    public int hashCode() {
        return Float.floatToIntBits(this.c) + (((e.a(this.a) * 31) + e.a(this.b)) * 31);
    }

    public String toString() {
        StringBuilder V0 = je.V0("PlaybackState(position=");
        V0.append(this.a);
        V0.append(", duration=");
        V0.append(this.b);
        V0.append(", speed=");
        V0.append(this.c);
        V0.append(")");
        return V0.toString();
    }
}
