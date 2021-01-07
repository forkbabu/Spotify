package com.spotify.remoteconfig;

import com.spotify.remoteconfig.z7;

/* access modifiers changed from: package-private */
public final class df extends z7 {
    private final boolean a;

    static final class b extends z7.a {
        private Boolean a;

        b() {
        }

        public z7 a() {
            String str = this.a == null ? " carModeEngineEnabled" : "";
            if (str.isEmpty()) {
                return new df(this.a.booleanValue(), null);
            }
            throw new IllegalStateException(je.x0("Missing required properties:", str));
        }

        public z7.a b(boolean z) {
            this.a = Boolean.valueOf(z);
            return this;
        }
    }

    df(boolean z, a aVar) {
        this.a = z;
    }

    @Override // com.spotify.remoteconfig.z7
    public boolean a() {
        return this.a;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof z7) || this.a != ((z7) obj).a()) {
            return false;
        }
        return true;
    }

    public int hashCode() {
        return (this.a ? 1231 : 1237) ^ 1000003;
    }

    public String toString() {
        return je.P0(je.V0("AndroidLibsCarModeEngineProperties{carModeEngineEnabled="), this.a, "}");
    }
}
