package com.spotify.remoteconfig;

import com.spotify.remoteconfig.e6;

/* access modifiers changed from: package-private */
public final class yd extends e6 {
    private final boolean a;
    private final boolean b;

    static final class b extends e6.a {
        private Boolean a;
        private Boolean b;

        b() {
        }

        public e6 a() {
            String str = this.a == null ? " enableColorExtraction" : "";
            if (this.b == null) {
                str = je.x0(str, " enableFloatingNpb");
            }
            if (str.isEmpty()) {
                return new yd(this.a.booleanValue(), this.b.booleanValue(), null);
            }
            throw new IllegalStateException(je.x0("Missing required properties:", str));
        }

        public e6.a b(boolean z) {
            this.a = Boolean.valueOf(z);
            return this;
        }

        public e6.a c(boolean z) {
            this.b = Boolean.valueOf(z);
            return this;
        }
    }

    yd(boolean z, boolean z2, a aVar) {
        this.a = z;
        this.b = z2;
    }

    @Override // com.spotify.remoteconfig.e6
    public boolean a() {
        return this.a;
    }

    @Override // com.spotify.remoteconfig.e6
    public boolean b() {
        return this.b;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof e6)) {
            return false;
        }
        e6 e6Var = (e6) obj;
        if (this.a == e6Var.a() && this.b == e6Var.b()) {
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
        StringBuilder V0 = je.V0("AndroidFeatureNowplayingbarProperties{enableColorExtraction=");
        V0.append(this.a);
        V0.append(", enableFloatingNpb=");
        return je.P0(V0, this.b, "}");
    }
}
