package com.spotify.remoteconfig;

import com.spotify.remoteconfig.ma;

/* access modifiers changed from: package-private */
public final class pg extends ma {
    private final boolean a;

    static final class b extends ma.a {
        private Boolean a;

        b() {
        }

        public ma a() {
            String str = this.a == null ? " emitErrorsForLeaks" : "";
            if (str.isEmpty()) {
                return new pg(this.a.booleanValue(), null);
            }
            throw new IllegalStateException(je.x0("Missing required properties:", str));
        }

        public ma.a b(boolean z) {
            this.a = Boolean.valueOf(z);
            return this;
        }
    }

    pg(boolean z, a aVar) {
        this.a = z;
    }

    @Override // com.spotify.remoteconfig.ma
    public boolean a() {
        return this.a;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof ma) || this.a != ((ma) obj).a()) {
            return false;
        }
        return true;
    }

    public int hashCode() {
        return (this.a ? 1231 : 1237) ^ 1000003;
    }

    public String toString() {
        return je.P0(je.V0("AndroidLibsRxjava2Properties{emitErrorsForLeaks="), this.a, "}");
    }
}
