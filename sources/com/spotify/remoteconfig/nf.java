package com.spotify.remoteconfig;

import com.spotify.remoteconfig.q8;

final class nf extends q8 {
    private final boolean a;

    static final class b extends q8.a {
        private Boolean a;

        b() {
        }

        public q8 a() {
            String str = this.a == null ? " shouldRegisterMarketingFormatComponents" : "";
            if (str.isEmpty()) {
                return new nf(this.a.booleanValue(), null);
            }
            throw new IllegalStateException(je.x0("Missing required properties:", str));
        }

        public q8.a b(boolean z) {
            this.a = Boolean.valueOf(z);
            return this;
        }
    }

    nf(boolean z, a aVar) {
        this.a = z;
    }

    @Override // com.spotify.remoteconfig.q8
    public boolean a() {
        return this.a;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof q8) || this.a != ((q8) obj).a()) {
            return false;
        }
        return true;
    }

    public int hashCode() {
        return (this.a ? 1231 : 1237) ^ 1000003;
    }

    public String toString() {
        return je.P0(je.V0("AndroidLibsMarketingFormatsProperties{shouldRegisterMarketingFormatComponents="), this.a, "}");
    }
}
