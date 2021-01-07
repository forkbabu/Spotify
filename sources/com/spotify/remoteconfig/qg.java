package com.spotify.remoteconfig;

import com.spotify.remoteconfig.oa;

/* access modifiers changed from: package-private */
public final class qg extends oa {
    private final boolean a;

    static final class b extends oa.a {
        private Boolean a;

        b() {
        }

        public oa a() {
            String str = this.a == null ? " enableSamsungPersonalization" : "";
            if (str.isEmpty()) {
                return new qg(this.a.booleanValue(), null);
            }
            throw new IllegalStateException(je.x0("Missing required properties:", str));
        }

        public oa.a b(boolean z) {
            this.a = Boolean.valueOf(z);
            return this;
        }
    }

    qg(boolean z, a aVar) {
        this.a = z;
    }

    @Override // com.spotify.remoteconfig.oa
    public boolean a() {
        return this.a;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof oa) || this.a != ((oa) obj).a()) {
            return false;
        }
        return true;
    }

    public int hashCode() {
        return (this.a ? 1231 : 1237) ^ 1000003;
    }

    public String toString() {
        return je.P0(je.V0("AndroidLibsSamsungPersonalizationProperties{enableSamsungPersonalization="), this.a, "}");
    }
}
