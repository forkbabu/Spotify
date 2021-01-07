package com.spotify.mobile.android.video.tracking;

public class l {
    public static final /* synthetic */ int f = 0;
    private final long a;
    private final long b;
    private final VideoSurfaceState c;
    private final String d;
    private final float e;

    public l(long j, float f2, VideoSurfaceState videoSurfaceState, String str) {
        this.a = j;
        this.b = -1;
        this.e = f2;
        this.c = videoSurfaceState;
        this.d = str;
    }

    static /* synthetic */ int h(l lVar, l lVar2) {
        long j = lVar.a;
        long j2 = lVar2.a;
        if (j < j2) {
            return -1;
        }
        return j == j2 ? 0 : 1;
    }

    public String a() {
        return this.d;
    }

    public long b() {
        long j = this.b;
        if (j != -1) {
            return j - this.a;
        }
        return 0;
    }

    public float c() {
        return this.e;
    }

    public long d() {
        return this.a;
    }

    public VideoSurfaceState e() {
        return this.c;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof l)) {
            return false;
        }
        l lVar = (l) obj;
        return this.a == lVar.a && this.b == lVar.b && this.c == lVar.c;
    }

    public long f() {
        if (this.e > 0.0f) {
            return (long) (((float) b()) / this.e);
        }
        return 0;
    }

    public boolean g() {
        return this.b != -1;
    }

    public int hashCode() {
        long j = this.a;
        long j2 = this.b;
        int i = ((((int) (j ^ (j >>> 32))) * 31) + ((int) (j2 ^ (j2 >>> 32)))) * 31;
        VideoSurfaceState videoSurfaceState = this.c;
        return i + (videoSurfaceState != null ? videoSurfaceState.hashCode() : 0);
    }

    public l i(long j) {
        return new l(this.a, j, this.e, this.c, this.d);
    }

    public String toString() {
        StringBuilder V0 = je.V0("Range{mStart=");
        V0.append(this.a);
        V0.append(", mEnd=");
        V0.append(this.b);
        V0.append(", mSurfaceState=");
        V0.append(this.c);
        V0.append(", length=");
        V0.append(b());
        V0.append('}');
        return V0.toString();
    }

    l(long j, long j2, float f2, VideoSurfaceState videoSurfaceState, String str) {
        this.a = j;
        this.b = j2;
        this.e = f2;
        this.c = videoSurfaceState;
        this.d = str;
    }
}
