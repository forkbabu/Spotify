package com.spotify.remoteconfig;

import com.spotify.remoteconfig.v5;

final class sd extends v5 {
    private final boolean a;
    private final boolean b;

    /* access modifiers changed from: package-private */
    public static final class b extends v5.a {
        private Boolean a;
        private Boolean b;

        b() {
        }

        @Override // com.spotify.remoteconfig.v5.a
        public v5 a() {
            String str = this.a == null ? " tasteOnboardingSkipWhenDeeplink" : "";
            if (this.b == null) {
                str = je.x0(str, " toExtendedSearch");
            }
            if (str.isEmpty()) {
                return new sd(this.a.booleanValue(), this.b.booleanValue(), null);
            }
            throw new IllegalStateException(je.x0("Missing required properties:", str));
        }

        @Override // com.spotify.remoteconfig.v5.a
        public v5.a b(boolean z) {
            this.b = Boolean.valueOf(z);
            return this;
        }

        public v5.a c(boolean z) {
            this.a = Boolean.valueOf(z);
            return this;
        }
    }

    sd(boolean z, boolean z2, a aVar) {
        this.a = z;
        this.b = z2;
    }

    @Override // com.spotify.remoteconfig.v5
    public boolean b() {
        return this.a;
    }

    @Override // com.spotify.remoteconfig.v5
    public boolean c() {
        return this.b;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof v5)) {
            return false;
        }
        v5 v5Var = (v5) obj;
        if (this.a == v5Var.b() && this.b == v5Var.c()) {
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
        StringBuilder V0 = je.V0("AndroidFeatureFreeTierTasteOnboardingProperties{tasteOnboardingSkipWhenDeeplink=");
        V0.append(this.a);
        V0.append(", toExtendedSearch=");
        return je.P0(V0, this.b, "}");
    }
}
