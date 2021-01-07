package com.spotify.remoteconfig;

import com.spotify.remoteconfig.ij;

final class li extends ij {
    private final boolean a;

    static final class b extends ij.a {
        private Boolean a;

        b() {
        }

        public ij a() {
            String str = this.a == null ? " connectSnacksEnabled" : "";
            if (str.isEmpty()) {
                return new li(this.a.booleanValue(), null);
            }
            throw new IllegalStateException(je.x0("Missing required properties:", str));
        }

        public ij.a b(boolean z) {
            this.a = Boolean.valueOf(z);
            return this;
        }
    }

    li(boolean z, a aVar) {
        this.a = z;
    }

    @Override // com.spotify.remoteconfig.ij
    public boolean a() {
        return this.a;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof ij) || this.a != ((ij) obj).a()) {
            return false;
        }
        return true;
    }

    public int hashCode() {
        return (this.a ? 1231 : 1237) ^ 1000003;
    }

    public String toString() {
        return je.P0(je.V0("ConnectSnacksProperties{connectSnacksEnabled="), this.a, "}");
    }
}
