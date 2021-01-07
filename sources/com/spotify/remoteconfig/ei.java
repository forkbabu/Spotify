package com.spotify.remoteconfig;

import com.spotify.remoteconfig.yc;

final class ei extends yc {
    private final boolean a;

    static final class b extends yc.a {
        private Boolean a;

        b() {
        }

        public yc a() {
            String str = this.a == null ? " canvasEnabled" : "";
            if (str.isEmpty()) {
                return new ei(this.a.booleanValue(), null);
            }
            throw new IllegalStateException(je.x0("Missing required properties:", str));
        }

        public yc.a b(boolean z) {
            this.a = Boolean.valueOf(z);
            return this;
        }
    }

    ei(boolean z, a aVar) {
        this.a = z;
    }

    @Override // com.spotify.remoteconfig.yc
    public boolean a() {
        return this.a;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof yc) || this.a != ((yc) obj).a()) {
            return false;
        }
        return true;
    }

    public int hashCode() {
        return (this.a ? 1231 : 1237) ^ 1000003;
    }

    public String toString() {
        return je.P0(je.V0("AppsMusicLibsCanvasProperties{canvasEnabled="), this.a, "}");
    }
}
