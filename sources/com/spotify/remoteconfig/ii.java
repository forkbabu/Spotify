package com.spotify.remoteconfig;

import com.spotify.remoteconfig.cj;

/* access modifiers changed from: package-private */
public final class ii extends cj {
    private final boolean a;
    private final boolean b;

    static final class b extends cj.a {
        private Boolean a;
        private Boolean b;

        b() {
        }

        public cj a() {
            String str = this.a == null ? " enableSilenceTrimmerAndroid" : "";
            if (this.b == null) {
                str = je.x0(str, " limitUpwardsNormalization");
            }
            if (str.isEmpty()) {
                return new ii(this.a.booleanValue(), this.b.booleanValue(), null);
            }
            throw new IllegalStateException(je.x0("Missing required properties:", str));
        }

        public cj.a b(boolean z) {
            this.a = Boolean.valueOf(z);
            return this;
        }

        public cj.a c(boolean z) {
            this.b = Boolean.valueOf(z);
            return this;
        }
    }

    ii(boolean z, boolean z2, a aVar) {
        this.a = z;
        this.b = z2;
    }

    @Override // com.spotify.remoteconfig.cj
    public boolean a() {
        return this.a;
    }

    @Override // com.spotify.remoteconfig.cj
    public boolean b() {
        return this.b;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof cj)) {
            return false;
        }
        cj cjVar = (cj) obj;
        if (this.a == cjVar.a() && this.b == cjVar.b()) {
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
        StringBuilder V0 = je.V0("BoomboxSettingsProperties{enableSilenceTrimmerAndroid=");
        V0.append(this.a);
        V0.append(", limitUpwardsNormalization=");
        return je.P0(V0, this.b, "}");
    }
}
