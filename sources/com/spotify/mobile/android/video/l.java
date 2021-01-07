package com.spotify.mobile.android.video;

import com.spotify.mobile.android.video.y;

final class l extends y {
    private final boolean a;
    private final boolean b;

    static final class b extends y.a {
        private Boolean a;
        private Boolean b;

        b() {
        }

        public y a() {
            String str = this.a == null ? " spotifyVideoHlsEnabled" : "";
            if (this.b == null) {
                str = je.x0(str, " subtitlesEnabled");
            }
            if (str.isEmpty()) {
                return new l(this.a.booleanValue(), this.b.booleanValue(), null);
            }
            throw new IllegalStateException(je.x0("Missing required properties:", str));
        }

        public y.a b(boolean z) {
            this.a = Boolean.valueOf(z);
            return this;
        }

        public y.a c(boolean z) {
            this.b = Boolean.valueOf(z);
            return this;
        }
    }

    l(boolean z, boolean z2, a aVar) {
        this.a = z;
        this.b = z2;
    }

    @Override // com.spotify.mobile.android.video.y
    public boolean a() {
        return this.a;
    }

    @Override // com.spotify.mobile.android.video.y
    public boolean b() {
        return this.b;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof y)) {
            return false;
        }
        y yVar = (y) obj;
        if (this.a == yVar.a() && this.b == yVar.b()) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        int i = 1231;
        int i2 = ((this.a ? 1231 : 1237) ^ 1000003) * 1000003;
        if (!this.b) {
            i = 1237;
        }
        return i2 ^ i;
    }

    public String toString() {
        StringBuilder V0 = je.V0("MusicLibsVideoProperties{spotifyVideoHlsEnabled=");
        V0.append(this.a);
        V0.append(", subtitlesEnabled=");
        return je.P0(V0, this.b, "}");
    }
}
