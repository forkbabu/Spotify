package com.spotify.remoteconfig;

import com.spotify.remoteconfig.tj;

final class ri extends tj {
    private final int a;
    private final boolean b;

    /* access modifiers changed from: package-private */
    public static final class b extends tj.a {
        private Integer a;
        private Boolean b;

        b() {
        }

        /* access modifiers changed from: package-private */
        @Override // com.spotify.remoteconfig.tj.a
        public tj a() {
            String str = this.a == null ? " imageResolveConfigurationTtlSec" : "";
            if (this.b == null) {
                str = je.x0(str, " imageResolveEnabled");
            }
            if (str.isEmpty()) {
                return new ri(this.a.intValue(), this.b.booleanValue(), null);
            }
            throw new IllegalStateException(je.x0("Missing required properties:", str));
        }

        public tj.a c(int i) {
            this.a = Integer.valueOf(i);
            return this;
        }

        public tj.a d(boolean z) {
            this.b = Boolean.valueOf(z);
            return this;
        }
    }

    ri(int i, boolean z, a aVar) {
        this.a = i;
        this.b = z;
    }

    @Override // com.spotify.remoteconfig.tj
    public int b() {
        return this.a;
    }

    @Override // com.spotify.remoteconfig.tj
    public boolean c() {
        return this.b;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof tj)) {
            return false;
        }
        tj tjVar = (tj) obj;
        if (this.a == tjVar.b() && this.b == tjVar.c()) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        return ((this.a ^ 1000003) * 1000003) ^ (this.b ? 1231 : 1237);
    }

    public String toString() {
        StringBuilder V0 = je.V0("MusicLibsImageResolveForMusicProperties{imageResolveConfigurationTtlSec=");
        V0.append(this.a);
        V0.append(", imageResolveEnabled=");
        return je.P0(V0, this.b, "}");
    }
}
