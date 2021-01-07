package com.spotify.remoteconfig;

import com.spotify.remoteconfig.l8;

final class kf extends l8 {
    private final boolean a;

    /* access modifiers changed from: package-private */
    public static final class b extends l8.a {
        private Boolean a;

        b() {
        }

        @Override // com.spotify.remoteconfig.l8.a
        public l8 a() {
            String str = this.a == null ? " applyContentAreaPadding" : "";
            if (str.isEmpty()) {
                return new kf(this.a.booleanValue(), null);
            }
            throw new IllegalStateException(je.x0("Missing required properties:", str));
        }

        public l8.a b(boolean z) {
            this.a = Boolean.valueOf(z);
            return this;
        }
    }

    kf(boolean z, a aVar) {
        this.a = z;
    }

    @Override // com.spotify.remoteconfig.l8
    public boolean a() {
        return this.a;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof l8) || this.a != ((l8) obj).a()) {
            return false;
        }
        return true;
    }

    public int hashCode() {
        return (this.a ? 1231 : 1237) ^ 1000003;
    }

    public String toString() {
        return je.P0(je.V0("AndroidLibsHugsProperties{applyContentAreaPadding="), this.a, "}");
    }
}
