package com.spotify.mobile.android.video.tracking;

final class e extends j {
    private final long a;
    private final long b;

    e(long j, long j2) {
        this.a = j;
        this.b = j2;
    }

    @Override // com.spotify.mobile.android.video.tracking.j
    public long a() {
        return this.a;
    }

    @Override // com.spotify.mobile.android.video.tracking.j
    public long b() {
        return this.b;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof j)) {
            return false;
        }
        j jVar = (j) obj;
        if (this.a == jVar.a() && this.b == jVar.b()) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        long j = this.a;
        long j2 = this.b;
        return ((int) (j2 ^ (j2 >>> 32))) ^ ((((int) (j ^ (j >>> 32))) ^ 1000003) * 1000003);
    }

    public String toString() {
        StringBuilder V0 = je.V0("ObservedBitrate{bitrate=");
        V0.append(this.a);
        V0.append(", bytesTransferred=");
        return je.E0(V0, this.b, "}");
    }
}
