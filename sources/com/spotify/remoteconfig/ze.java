package com.spotify.remoteconfig;

import com.spotify.remoteconfig.s7;

/* access modifiers changed from: package-private */
public final class ze extends s7 {
    private final boolean a;

    static final class b extends s7.a {
        private Boolean a;

        b() {
        }

        public s7 a() {
            String str = this.a == null ? " enableHeartMicroInteraction" : "";
            if (str.isEmpty()) {
                return new ze(this.a.booleanValue(), null);
            }
            throw new IllegalStateException(je.x0("Missing required properties:", str));
        }

        public s7.a b(boolean z) {
            this.a = Boolean.valueOf(z);
            return this;
        }
    }

    ze(boolean z, a aVar) {
        this.a = z;
    }

    @Override // com.spotify.remoteconfig.s7
    public boolean a() {
        return this.a;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof s7) || this.a != ((s7) obj).a()) {
            return false;
        }
        return true;
    }

    public int hashCode() {
        return (this.a ? 1231 : 1237) ^ 1000003;
    }

    public String toString() {
        return je.P0(je.V0("AndroidLibsAnimatedHeartProperties{enableHeartMicroInteraction="), this.a, "}");
    }
}
