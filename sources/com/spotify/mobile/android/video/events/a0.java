package com.spotify.mobile.android.video.events;

import com.spotify.mobile.android.video.d0;
import com.spotify.mobile.android.video.events.g0;

final class a0 extends g0 {
    private final d0 a;
    private final long b;
    private final Long c;
    private final Long d;
    private final boolean e;
    private final float f;
    private final boolean g;

    /* access modifiers changed from: package-private */
    public static final class b extends g0.a {
        private d0 a;
        private Long b;
        private Long c;
        private Long d;
        private Boolean e;
        private Float f;
        private Boolean g;

        b() {
        }

        @Override // com.spotify.mobile.android.video.events.g0.a
        public g0 a() {
            String str = this.a == null ? " playbackIdentity" : "";
            if (this.b == null) {
                str = je.x0(str, " timestampMs");
            }
            if (this.e == null) {
                str = je.x0(str, " isBuffering");
            }
            if (this.f == null) {
                str = je.x0(str, " playbackSpeed");
            }
            if (this.g == null) {
                str = je.x0(str, " isPaused");
            }
            if (str.isEmpty()) {
                return new a0(this.a, this.b.longValue(), this.c, this.d, this.e.booleanValue(), this.f.floatValue(), this.g.booleanValue(), null);
            }
            throw new IllegalStateException(je.x0("Missing required properties:", str));
        }

        @Override // com.spotify.mobile.android.video.events.g0.a
        public g0.a b(Long l) {
            this.d = l;
            return this;
        }

        @Override // com.spotify.mobile.android.video.events.g0.a
        public g0.a c(boolean z) {
            this.e = Boolean.valueOf(z);
            return this;
        }

        @Override // com.spotify.mobile.android.video.events.g0.a
        public g0.a d(boolean z) {
            this.g = Boolean.valueOf(z);
            return this;
        }

        @Override // com.spotify.mobile.android.video.events.g0.a
        public g0.a e(float f2) {
            this.f = Float.valueOf(f2);
            return this;
        }

        @Override // com.spotify.mobile.android.video.events.g0.a
        public g0.a f(Long l) {
            this.c = l;
            return this;
        }

        @Override // com.spotify.mobile.android.video.events.g0.a
        public g0.a g(long j) {
            this.b = Long.valueOf(j);
            return this;
        }

        public g0.a h(d0 d0Var) {
            if (d0Var != null) {
                this.a = d0Var;
                return this;
            }
            throw new NullPointerException("Null playbackIdentity");
        }
    }

    a0(d0 d0Var, long j, Long l, Long l2, boolean z, float f2, boolean z2, a aVar) {
        this.a = d0Var;
        this.b = j;
        this.c = l;
        this.d = l2;
        this.e = z;
        this.f = f2;
        this.g = z2;
    }

    @Override // com.spotify.mobile.android.video.events.g0
    public Long a() {
        return this.d;
    }

    @Override // com.spotify.mobile.android.video.events.g0
    public boolean b() {
        return this.e;
    }

    @Override // com.spotify.mobile.android.video.events.g0
    public boolean c() {
        return this.g;
    }

    @Override // com.spotify.mobile.android.video.events.g0
    public d0 d() {
        return this.a;
    }

    @Override // com.spotify.mobile.android.video.events.g0
    public float e() {
        return this.f;
    }

    public boolean equals(Object obj) {
        Long l;
        Long l2;
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof g0)) {
            return false;
        }
        g0 g0Var = (g0) obj;
        if (this.a.equals(g0Var.d()) && this.b == g0Var.g() && ((l = this.c) != null ? l.equals(g0Var.f()) : g0Var.f() == null) && ((l2 = this.d) != null ? l2.equals(g0Var.a()) : g0Var.a() == null) && this.e == g0Var.b() && Float.floatToIntBits(this.f) == Float.floatToIntBits(g0Var.e()) && this.g == g0Var.c()) {
            return true;
        }
        return false;
    }

    @Override // com.spotify.mobile.android.video.events.g0
    public Long f() {
        return this.c;
    }

    @Override // com.spotify.mobile.android.video.events.g0
    public long g() {
        return this.b;
    }

    public int hashCode() {
        long j = this.b;
        int hashCode = (((this.a.hashCode() ^ 1000003) * 1000003) ^ ((int) (j ^ (j >>> 32)))) * 1000003;
        Long l = this.c;
        int i = 0;
        int hashCode2 = (hashCode ^ (l == null ? 0 : l.hashCode())) * 1000003;
        Long l2 = this.d;
        if (l2 != null) {
            i = l2.hashCode();
        }
        int i2 = (hashCode2 ^ i) * 1000003;
        int i3 = 1231;
        int floatToIntBits = (((i2 ^ (this.e ? 1231 : 1237)) * 1000003) ^ Float.floatToIntBits(this.f)) * 1000003;
        if (!this.g) {
            i3 = 1237;
        }
        return floatToIntBits ^ i3;
    }

    public String toString() {
        StringBuilder V0 = je.V0("PlaybackState{playbackIdentity=");
        V0.append(this.a);
        V0.append(", timestampMs=");
        V0.append(this.b);
        V0.append(", positionAsOfTimestamp=");
        V0.append(this.c);
        V0.append(", durationMs=");
        V0.append(this.d);
        V0.append(", isBuffering=");
        V0.append(this.e);
        V0.append(", playbackSpeed=");
        V0.append(this.f);
        V0.append(", isPaused=");
        return je.P0(V0, this.g, "}");
    }
}
