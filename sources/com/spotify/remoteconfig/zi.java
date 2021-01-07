package com.spotify.remoteconfig;

import com.spotify.remoteconfig.gk;

final class zi extends gk {
    private final boolean a;

    static final class b extends gk.a {
        private Boolean a;

        b() {
        }

        public gk a() {
            String str = this.a == null ? " emailUpdateEnabled" : "";
            if (str.isEmpty()) {
                return new zi(this.a.booleanValue(), null);
            }
            throw new IllegalStateException(je.x0("Missing required properties:", str));
        }

        public gk.a b(boolean z) {
            this.a = Boolean.valueOf(z);
            return this;
        }
    }

    zi(boolean z, a aVar) {
        this.a = z;
    }

    @Override // com.spotify.remoteconfig.gk
    public boolean a() {
        return this.a;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof gk) || this.a != ((gk) obj).a()) {
            return false;
        }
        return true;
    }

    public int hashCode() {
        return (this.a ? 1231 : 1237) ^ 1000003;
    }

    public String toString() {
        return je.P0(je.V0("UpdateEmailProperties{emailUpdateEnabled="), this.a, "}");
    }
}
