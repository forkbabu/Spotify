package com.spotify.remoteconfig;

import com.spotify.remoteconfig.qa;

final class rg extends qa {
    private final boolean a;

    static final class b extends qa.a {
        private Boolean a;

        b() {
        }

        public qa.a a(boolean z) {
            this.a = Boolean.valueOf(z);
            return this;
        }

        public qa b() {
            String str = this.a == null ? " alwaysShowBackgroundStartNotification" : "";
            if (str.isEmpty()) {
                return new rg(this.a.booleanValue(), null);
            }
            throw new IllegalStateException(je.x0("Missing required properties:", str));
        }
    }

    rg(boolean z, a aVar) {
        this.a = z;
    }

    @Override // com.spotify.remoteconfig.qa
    public boolean a() {
        return this.a;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof qa) || this.a != ((qa) obj).a()) {
            return false;
        }
        return true;
    }

    public int hashCode() {
        return (this.a ? 1231 : 1237) ^ 1000003;
    }

    public String toString() {
        return je.P0(je.V0("AndroidLibsServiceforegroundstarterProperties{alwaysShowBackgroundStartNotification="), this.a, "}");
    }
}
