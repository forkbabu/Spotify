package com.spotify.remoteconfig;

import com.spotify.remoteconfig.ka;

/* access modifiers changed from: package-private */
public final class og extends ka {
    private final boolean a;

    static final class b extends ka.a {
        private Boolean a;

        b() {
        }

        public ka.a a(boolean z) {
            this.a = Boolean.valueOf(z);
            return this;
        }

        public ka b() {
            String str = this.a == null ? " allowContextMenuItem" : "";
            if (str.isEmpty()) {
                return new og(this.a.booleanValue(), null);
            }
            throw new IllegalStateException(je.x0("Missing required properties:", str));
        }
    }

    og(boolean z, a aVar) {
        this.a = z;
    }

    @Override // com.spotify.remoteconfig.ka
    public boolean a() {
        return this.a;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof ka) || this.a != ((ka) obj).a()) {
            return false;
        }
        return true;
    }

    public int hashCode() {
        return (this.a ? 1231 : 1237) ^ 1000003;
    }

    public String toString() {
        return je.P0(je.V0("AndroidLibsPromodisclosureProperties{allowContextMenuItem="), this.a, "}");
    }
}
