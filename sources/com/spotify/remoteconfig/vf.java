package com.spotify.remoteconfig;

import com.spotify.remoteconfig.c9;

/* access modifiers changed from: package-private */
public final class vf extends c9 {
    private final boolean a;
    private final boolean b;

    static final class b extends c9.a {
        private Boolean a;
        private Boolean b;

        b() {
        }

        public c9 a() {
            String str = this.a == null ? " podcastMoreForYouEnabled" : "";
            if (this.b == null) {
                str = je.x0(str, " podcastMoreForYouProdEnabled");
            }
            if (str.isEmpty()) {
                return new vf(this.a.booleanValue(), this.b.booleanValue(), null);
            }
            throw new IllegalStateException(je.x0("Missing required properties:", str));
        }

        public c9.a b(boolean z) {
            this.a = Boolean.valueOf(z);
            return this;
        }

        public c9.a c(boolean z) {
            this.b = Boolean.valueOf(z);
            return this;
        }
    }

    vf(boolean z, boolean z2, a aVar) {
        this.a = z;
        this.b = z2;
    }

    @Override // com.spotify.remoteconfig.c9
    public boolean a() {
        return this.a;
    }

    @Override // com.spotify.remoteconfig.c9
    public boolean b() {
        return this.b;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof c9)) {
            return false;
        }
        c9 c9Var = (c9) obj;
        if (this.a == c9Var.a() && this.b == c9Var.b()) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        int i = 1231;
        int i2 = ((this.a ? 1231 : 1237) ^ 1000003) * 1000003;
        if (!this.b) {
            i = 1237;
        }
        return i2 ^ i;
    }

    public String toString() {
        StringBuilder V0 = je.V0("AndroidLibsNowplayingScrollWidgetsPodcastMoreForYouProperties{podcastMoreForYouEnabled=");
        V0.append(this.a);
        V0.append(", podcastMoreForYouProdEnabled=");
        return je.P0(V0, this.b, "}");
    }
}
