package com.spotify.remoteconfig;

import com.spotify.remoteconfig.w7;

final class bf extends w7 {
    private final boolean a;
    private final boolean b;

    static final class b extends w7.a {
        private Boolean a;
        private Boolean b;

        b() {
        }

        public w7 a() {
            String str = this.a == null ? " enableCanvasCtaMargin" : "";
            if (this.b == null) {
                str = je.x0(str, " enableCanvasSharingInNpv");
            }
            if (str.isEmpty()) {
                return new bf(this.a.booleanValue(), this.b.booleanValue(), null);
            }
            throw new IllegalStateException(je.x0("Missing required properties:", str));
        }

        public w7.a b(boolean z) {
            this.a = Boolean.valueOf(z);
            return this;
        }

        public w7.a c(boolean z) {
            this.b = Boolean.valueOf(z);
            return this;
        }
    }

    bf(boolean z, boolean z2, a aVar) {
        this.a = z;
        this.b = z2;
    }

    @Override // com.spotify.remoteconfig.w7
    public boolean a() {
        return this.a;
    }

    @Override // com.spotify.remoteconfig.w7
    public boolean b() {
        return this.b;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof w7)) {
            return false;
        }
        w7 w7Var = (w7) obj;
        if (this.a == w7Var.a() && this.b == w7Var.b()) {
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
        StringBuilder V0 = je.V0("AndroidLibsCanvasShareProperties{enableCanvasCtaMargin=");
        V0.append(this.a);
        V0.append(", enableCanvasSharingInNpv=");
        return je.P0(V0, this.b, "}");
    }
}
