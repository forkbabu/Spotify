package com.spotify.remoteconfig;

import com.spotify.remoteconfig.z6;

/* access modifiers changed from: package-private */
public final class ne extends z6 {
    private final int a;
    private final boolean b;
    private final boolean c;
    private final boolean d;

    static final class b extends z6.a {
        private Integer a;
        private Boolean b;
        private Boolean c;
        private Boolean d;

        b() {
        }

        /* access modifiers changed from: package-private */
        public z6 a() {
            String str = this.a == null ? " videoDownloadBitrate" : "";
            if (this.b == null) {
                str = je.x0(str, " videoOfflineCheckDiskSpaceEnabled");
            }
            if (this.c == null) {
                str = je.x0(str, " videoOfflineEnabled");
            }
            if (this.d == null) {
                str = je.x0(str, " videoOfflineSubtitlesEnabled");
            }
            if (str.isEmpty()) {
                return new ne(this.a.intValue(), this.b.booleanValue(), this.c.booleanValue(), this.d.booleanValue(), null);
            }
            throw new IllegalStateException(je.x0("Missing required properties:", str));
        }

        public z6.a b(int i) {
            this.a = Integer.valueOf(i);
            return this;
        }

        public z6.a c(boolean z) {
            this.b = Boolean.valueOf(z);
            return this;
        }

        public z6.a d(boolean z) {
            this.c = Boolean.valueOf(z);
            return this;
        }

        public z6.a e(boolean z) {
            this.d = Boolean.valueOf(z);
            return this;
        }
    }

    ne(int i, boolean z, boolean z2, boolean z3, a aVar) {
        this.a = i;
        this.b = z;
        this.c = z2;
        this.d = z3;
    }

    @Override // com.spotify.remoteconfig.z6
    public int a() {
        return this.a;
    }

    @Override // com.spotify.remoteconfig.z6
    public boolean b() {
        return this.b;
    }

    @Override // com.spotify.remoteconfig.z6
    public boolean c() {
        return this.c;
    }

    @Override // com.spotify.remoteconfig.z6
    public boolean d() {
        return this.d;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof z6)) {
            return false;
        }
        z6 z6Var = (z6) obj;
        if (this.a == z6Var.a() && this.b == z6Var.b() && this.c == z6Var.c() && this.d == z6Var.d()) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        int i = 1231;
        int i2 = (((((this.a ^ 1000003) * 1000003) ^ (this.b ? 1231 : 1237)) * 1000003) ^ (this.c ? 1231 : 1237)) * 1000003;
        if (!this.d) {
            i = 1237;
        }
        return i2 ^ i;
    }

    public String toString() {
        StringBuilder V0 = je.V0("AndroidFeatureVideoProperties{videoDownloadBitrate=");
        V0.append(this.a);
        V0.append(", videoOfflineCheckDiskSpaceEnabled=");
        V0.append(this.b);
        V0.append(", videoOfflineEnabled=");
        V0.append(this.c);
        V0.append(", videoOfflineSubtitlesEnabled=");
        return je.P0(V0, this.d, "}");
    }
}
