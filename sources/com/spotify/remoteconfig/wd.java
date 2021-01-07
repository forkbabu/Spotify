package com.spotify.remoteconfig;

import com.spotify.remoteconfig.c6;

/* access modifiers changed from: package-private */
public final class wd extends c6 {
    private final boolean a;

    static final class b extends c6.a {
        private Boolean a;

        b() {
        }

        public c6 a() {
            String str = this.a == null ? " enableInappSdk" : "";
            if (str.isEmpty()) {
                return new wd(this.a.booleanValue(), null);
            }
            throw new IllegalStateException(je.x0("Missing required properties:", str));
        }

        public c6.a b(boolean z) {
            this.a = Boolean.valueOf(z);
            return this;
        }
    }

    wd(boolean z, a aVar) {
        this.a = z;
    }

    @Override // com.spotify.remoteconfig.c6
    public boolean a() {
        return this.a;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof c6) || this.a != ((c6) obj).a()) {
            return false;
        }
        return true;
    }

    public int hashCode() {
        return (this.a ? 1231 : 1237) ^ 1000003;
    }

    public String toString() {
        return je.P0(je.V0("AndroidFeatureInappmessageProperties{enableInappSdk="), this.a, "}");
    }
}
