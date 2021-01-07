package com.spotify.remoteconfig;

import com.spotify.remoteconfig.lj;

/* access modifiers changed from: package-private */
public final class ni extends lj {
    private final boolean a;

    static final class b extends lj.a {
        private Boolean a;

        b() {
        }

        public lj a() {
            String str = this.a == null ? " emailVerifyEnabled" : "";
            if (str.isEmpty()) {
                return new ni(this.a.booleanValue(), null);
            }
            throw new IllegalStateException(je.x0("Missing required properties:", str));
        }

        public lj.a b(boolean z) {
            this.a = Boolean.valueOf(z);
            return this;
        }
    }

    ni(boolean z, a aVar) {
        this.a = z;
    }

    @Override // com.spotify.remoteconfig.lj
    public boolean a() {
        return this.a;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof lj) || this.a != ((lj) obj).a()) {
            return false;
        }
        return true;
    }

    public int hashCode() {
        return (this.a ? 1231 : 1237) ^ 1000003;
    }

    public String toString() {
        return je.P0(je.V0("EmailVerifyProperties{emailVerifyEnabled="), this.a, "}");
    }
}
