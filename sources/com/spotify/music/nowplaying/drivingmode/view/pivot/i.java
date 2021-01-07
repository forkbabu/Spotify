package com.spotify.music.nowplaying.drivingmode.view.pivot;

import com.google.common.collect.ImmutableList;
import com.spotify.music.nowplaying.drivingmode.view.pivot.n;

final class i extends n {
    private final ImmutableList<l> a;
    private final int b;

    /* access modifiers changed from: package-private */
    public static final class b implements n.a {
        private ImmutableList<l> a;
        private Integer b;

        b() {
        }

        @Override // com.spotify.music.nowplaying.drivingmode.view.pivot.n.a
        public n.a a(int i) {
            this.b = Integer.valueOf(i);
            return this;
        }

        @Override // com.spotify.music.nowplaying.drivingmode.view.pivot.n.a
        public n.a b(ImmutableList<l> immutableList) {
            if (immutableList != null) {
                this.a = immutableList;
                return this;
            }
            throw new NullPointerException("Null pivotItems");
        }

        @Override // com.spotify.music.nowplaying.drivingmode.view.pivot.n.a
        public n build() {
            String str = this.a == null ? " pivotItems" : "";
            if (this.b == null) {
                str = je.x0(str, " startPosition");
            }
            if (str.isEmpty()) {
                return new i(this.a, this.b.intValue(), null);
            }
            throw new IllegalStateException(je.x0("Missing required properties:", str));
        }
    }

    i(ImmutableList immutableList, int i, a aVar) {
        this.a = immutableList;
        this.b = i;
    }

    @Override // com.spotify.music.nowplaying.drivingmode.view.pivot.n
    public ImmutableList<l> b() {
        return this.a;
    }

    @Override // com.spotify.music.nowplaying.drivingmode.view.pivot.n
    public int c() {
        return this.b;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof n)) {
            return false;
        }
        n nVar = (n) obj;
        if (!this.a.equals(nVar.b()) || this.b != nVar.c()) {
            return false;
        }
        return true;
    }

    public int hashCode() {
        return ((this.a.hashCode() ^ 1000003) * 1000003) ^ this.b;
    }

    public String toString() {
        StringBuilder V0 = je.V0("PivotItemList{pivotItems=");
        V0.append(this.a);
        V0.append(", startPosition=");
        return je.B0(V0, this.b, "}");
    }
}
