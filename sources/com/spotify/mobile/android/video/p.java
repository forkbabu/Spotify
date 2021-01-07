package com.spotify.mobile.android.video;

import com.spotify.mobile.android.video.g0;

final class p extends g0 {
    private final boolean a;

    /* access modifiers changed from: package-private */
    public static final class b extends g0.a {
        private Boolean a;

        b() {
        }

        @Override // com.spotify.mobile.android.video.g0.a
        public g0 a() {
            String str = this.a == null ? " preventDisplaySleepDuringVideoPlayback" : "";
            if (str.isEmpty()) {
                return new p(this.a.booleanValue(), null);
            }
            throw new IllegalStateException(je.x0("Missing required properties:", str));
        }

        @Override // com.spotify.mobile.android.video.g0.a
        public g0.a b(boolean z) {
            this.a = Boolean.valueOf(z);
            return this;
        }

        b(g0 g0Var, a aVar) {
            this.a = Boolean.valueOf(g0Var.b());
        }
    }

    p(boolean z, a aVar) {
        this.a = z;
    }

    @Override // com.spotify.mobile.android.video.g0
    public boolean b() {
        return this.a;
    }

    @Override // com.spotify.mobile.android.video.g0
    public g0.a c() {
        return new b(this, null);
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof g0) || this.a != ((g0) obj).b()) {
            return false;
        }
        return true;
    }

    public int hashCode() {
        return (this.a ? 1231 : 1237) ^ 1000003;
    }

    public String toString() {
        return je.P0(je.V0("PlayerConfiguration{preventDisplaySleepDuringVideoPlayback="), this.a, "}");
    }
}
