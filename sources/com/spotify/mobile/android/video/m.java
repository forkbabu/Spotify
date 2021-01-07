package com.spotify.mobile.android.video;

import com.google.common.base.Optional;
import com.spotify.mobile.android.video.a0;

final class m extends a0 {
    private final Optional<Long> a;
    private final boolean b;

    /* access modifiers changed from: package-private */
    public static final class b extends a0.a {
        private Optional<Long> a = Optional.absent();
        private Boolean b;

        b() {
        }

        /* access modifiers changed from: package-private */
        @Override // com.spotify.mobile.android.video.a0.a
        public a0 a() {
            String str = this.b == null ? " playWhenReady" : "";
            if (str.isEmpty()) {
                return new m(this.a, this.b.booleanValue(), null);
            }
            throw new IllegalStateException(je.x0("Missing required properties:", str));
        }

        /* access modifiers changed from: package-private */
        @Override // com.spotify.mobile.android.video.a0.a
        public Optional<Long> c() {
            return this.a;
        }

        @Override // com.spotify.mobile.android.video.a0.a
        public a0.a d(Long l) {
            this.a = Optional.of(l);
            return this;
        }

        @Override // com.spotify.mobile.android.video.a0.a
        public a0.a e(boolean z) {
            this.b = Boolean.valueOf(z);
            return this;
        }
    }

    m(Optional optional, boolean z, a aVar) {
        this.a = optional;
        this.b = z;
    }

    @Override // com.spotify.mobile.android.video.a0
    public Optional<Long> b() {
        return this.a;
    }

    @Override // com.spotify.mobile.android.video.a0
    public boolean c() {
        return this.b;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof a0)) {
            return false;
        }
        a0 a0Var = (a0) obj;
        if (!this.a.equals(a0Var.b()) || this.b != a0Var.c()) {
            return false;
        }
        return true;
    }

    public int hashCode() {
        return ((this.a.hashCode() ^ 1000003) * 1000003) ^ (this.b ? 1231 : 1237);
    }

    public String toString() {
        StringBuilder V0 = je.V0("PlayOptions{initialPosition=");
        V0.append(this.a);
        V0.append(", playWhenReady=");
        return je.P0(V0, this.b, "}");
    }
}
