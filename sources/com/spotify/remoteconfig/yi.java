package com.spotify.remoteconfig;

import com.spotify.remoteconfig.ek;

/* access modifiers changed from: package-private */
public final class yi extends ek {
    private final boolean a;
    private final boolean b;

    static final class b extends ek.a {
        private Boolean a;
        private Boolean b;

        b() {
        }

        public ek a() {
            String str = this.a == null ? " enableBackgroundLogging" : "";
            if (this.b == null) {
                str = je.x0(str, " enableBackgroundNotification");
            }
            if (str.isEmpty()) {
                return new yi(this.a.booleanValue(), this.b.booleanValue(), null);
            }
            throw new IllegalStateException(je.x0("Missing required properties:", str));
        }

        public ek.a b(boolean z) {
            this.a = Boolean.valueOf(z);
            return this;
        }

        public ek.a c(boolean z) {
            this.b = Boolean.valueOf(z);
            return this;
        }
    }

    yi(boolean z, boolean z2, a aVar) {
        this.a = z;
        this.b = z2;
    }

    @Override // com.spotify.remoteconfig.ek
    public boolean a() {
        return this.a;
    }

    @Override // com.spotify.remoteconfig.ek
    public boolean b() {
        return this.b;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof ek)) {
            return false;
        }
        ek ekVar = (ek) obj;
        if (this.a == ekVar.a() && this.b == ekVar.b()) {
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
        StringBuilder V0 = je.V0("SkipLimitPivotToOndemandProperties{enableBackgroundLogging=");
        V0.append(this.a);
        V0.append(", enableBackgroundNotification=");
        return je.P0(V0, this.b, "}");
    }
}
