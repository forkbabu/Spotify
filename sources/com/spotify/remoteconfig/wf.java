package com.spotify.remoteconfig;

import com.spotify.remoteconfig.e9;

final class wf extends e9 {
    private final boolean a;
    private final boolean b;

    static final class b extends e9.a {
        private Boolean a;
        private Boolean b;

        b() {
        }

        public e9 a() {
            String str = this.a == null ? " upnextQueueEnabled" : "";
            if (this.b == null) {
                str = je.x0(str, " upnextQueueProdEnabled");
            }
            if (str.isEmpty()) {
                return new wf(this.a.booleanValue(), this.b.booleanValue(), null);
            }
            throw new IllegalStateException(je.x0("Missing required properties:", str));
        }

        public e9.a b(boolean z) {
            this.a = Boolean.valueOf(z);
            return this;
        }

        public e9.a c(boolean z) {
            this.b = Boolean.valueOf(z);
            return this;
        }
    }

    wf(boolean z, boolean z2, a aVar) {
        this.a = z;
        this.b = z2;
    }

    @Override // com.spotify.remoteconfig.e9
    public boolean a() {
        return this.a;
    }

    @Override // com.spotify.remoteconfig.e9
    public boolean b() {
        return this.b;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof e9)) {
            return false;
        }
        e9 e9Var = (e9) obj;
        if (this.a == e9Var.a() && this.b == e9Var.b()) {
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
        StringBuilder V0 = je.V0("AndroidLibsNowplayingScrollWidgetsUpNextProperties{upnextQueueEnabled=");
        V0.append(this.a);
        V0.append(", upnextQueueProdEnabled=");
        return je.P0(V0, this.b, "}");
    }
}
