package com.spotify.music.behindthelyrics.model.business;

/* access modifiers changed from: package-private */
public final class a extends b {
    private final long a;
    private final double b;
    private final boolean c;
    private final boolean d;
    private final long e;

    a(long j, double d2, boolean z, boolean z2, long j2) {
        this.a = j;
        this.b = d2;
        this.c = z;
        this.d = z2;
        this.e = j2;
    }

    @Override // defpackage.cq1
    public boolean a() {
        return this.c;
    }

    @Override // defpackage.cq1
    public double b() {
        return this.b;
    }

    @Override // defpackage.cq1
    public boolean c() {
        return this.d;
    }

    @Override // defpackage.cq1
    public long d() {
        return this.e;
    }

    @Override // defpackage.cq1
    public long e() {
        return this.a;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof b)) {
            return false;
        }
        b bVar = (b) obj;
        if (this.a == ((a) bVar).a) {
            a aVar = (a) bVar;
            if (Double.doubleToLongBits(this.b) == Double.doubleToLongBits(aVar.b) && this.c == aVar.c && this.d == aVar.d && this.e == aVar.e) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        long j = this.a;
        int i = 1231;
        int doubleToLongBits = (((((((int) (j ^ (j >>> 32))) ^ 1000003) * 1000003) ^ ((int) ((Double.doubleToLongBits(this.b) >>> 32) ^ Double.doubleToLongBits(this.b)))) * 1000003) ^ (this.c ? 1231 : 1237)) * 1000003;
        if (!this.d) {
            i = 1237;
        }
        long j2 = this.e;
        return ((int) (j2 ^ (j2 >>> 32))) ^ ((doubleToLongBits ^ i) * 1000003);
    }

    public String toString() {
        StringBuilder V0 = je.V0("ContextPlayerPlaybackState{currentPosition=");
        V0.append(this.a);
        V0.append(", playbackSpeed=");
        V0.append(this.b);
        V0.append(", isPlaying=");
        V0.append(this.c);
        V0.append(", isPaused=");
        V0.append(this.d);
        V0.append(", duration=");
        return je.E0(V0, this.e, "}");
    }
}
