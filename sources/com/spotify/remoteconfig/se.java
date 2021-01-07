package com.spotify.remoteconfig;

import com.spotify.remoteconfig.i7;

final class se extends i7 {
    private final boolean a;
    private final int b;

    static final class b extends i7.a {
        private Boolean a;
        private Integer b;

        b() {
        }

        /* access modifiers changed from: package-private */
        public i7 a() {
            String str = this.a == null ? " enableFollowFeed" : "";
            if (this.b == null) {
                str = je.x0(str, " followFeedOuterBadgeCacheTtlSecs");
            }
            if (str.isEmpty()) {
                return new se(this.a.booleanValue(), this.b.intValue(), null);
            }
            throw new IllegalStateException(je.x0("Missing required properties:", str));
        }

        public i7.a b(boolean z) {
            this.a = Boolean.valueOf(z);
            return this;
        }

        public i7.a c(int i) {
            this.b = Integer.valueOf(i);
            return this;
        }
    }

    se(boolean z, int i, a aVar) {
        this.a = z;
        this.b = i;
    }

    @Override // com.spotify.remoteconfig.i7
    public boolean a() {
        return this.a;
    }

    @Override // com.spotify.remoteconfig.i7
    public int b() {
        return this.b;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof i7)) {
            return false;
        }
        i7 i7Var = (i7) obj;
        if (this.a == i7Var.a() && this.b == i7Var.b()) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        return (((this.a ? 1231 : 1237) ^ 1000003) * 1000003) ^ this.b;
    }

    public String toString() {
        StringBuilder V0 = je.V0("AndroidLibFollowFeedProperties{enableFollowFeed=");
        V0.append(this.a);
        V0.append(", followFeedOuterBadgeCacheTtlSecs=");
        return je.B0(V0, this.b, "}");
    }
}
