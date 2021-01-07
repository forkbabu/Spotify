package com.spotify.music.features.hiddencontent.model;

import com.spotify.music.features.hiddencontent.model.d;
import com.spotify.playlist.models.o;

final class b extends d {
    private final o a;
    private final int b;

    /* access modifiers changed from: package-private */
    /* renamed from: com.spotify.music.features.hiddencontent.model.b$b  reason: collision with other inner class name */
    public static final class C0234b implements d.a {
        private o a;
        private Integer b;

        C0234b() {
        }

        @Override // com.spotify.music.features.hiddencontent.model.d.a
        public d.a a(int i) {
            this.b = Integer.valueOf(i);
            return this;
        }

        @Override // com.spotify.music.features.hiddencontent.model.d.a
        public d.a b(o oVar) {
            this.a = oVar;
            return this;
        }

        @Override // com.spotify.music.features.hiddencontent.model.d.a
        public d build() {
            String str = this.a == null ? " track" : "";
            if (this.b == null) {
                str = je.x0(str, " index");
            }
            if (str.isEmpty()) {
                return new b(this.a, this.b.intValue(), null);
            }
            throw new IllegalStateException(je.x0("Missing required properties:", str));
        }
    }

    b(o oVar, int i, a aVar) {
        this.a = oVar;
        this.b = i;
    }

    @Override // com.spotify.music.features.hiddencontent.model.d
    public int b() {
        return this.b;
    }

    @Override // com.spotify.music.features.hiddencontent.model.d
    public o c() {
        return this.a;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof d)) {
            return false;
        }
        d dVar = (d) obj;
        if (!this.a.equals(dVar.c()) || this.b != dVar.b()) {
            return false;
        }
        return true;
    }

    public int hashCode() {
        return ((this.a.hashCode() ^ 1000003) * 1000003) ^ this.b;
    }

    public String toString() {
        StringBuilder V0 = je.V0("ContextMenuTrack{track=");
        V0.append(this.a);
        V0.append(", index=");
        return je.B0(V0, this.b, "}");
    }
}
