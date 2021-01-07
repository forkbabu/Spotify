package com.spotify.remoteconfig;

import com.spotify.remoteconfig.c5;

final class gd extends c5 {
    private final boolean a;

    static final class b extends c5.a {
        private Boolean a;

        b() {
        }

        public c5 a() {
            String str = this.a == null ? " prelaunchEnabled" : "";
            if (str.isEmpty()) {
                return new gd(this.a.booleanValue(), null);
            }
            throw new IllegalStateException(je.x0("Missing required properties:", str));
        }

        public c5.a b(boolean z) {
            this.a = Boolean.valueOf(z);
            return this;
        }
    }

    gd(boolean z, a aVar) {
        this.a = z;
    }

    @Override // com.spotify.remoteconfig.c5
    public boolean a() {
        return this.a;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof c5) || this.a != ((c5) obj).a()) {
            return false;
        }
        return true;
    }

    public int hashCode() {
        return (this.a ? 1231 : 1237) ^ 1000003;
    }

    public String toString() {
        return je.P0(je.V0("AndroidFeatureAlarmWarmupProperties{prelaunchEnabled="), this.a, "}");
    }
}
