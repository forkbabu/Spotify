package com.spotify.music.nowplaying.common.view.contextmenu;

import com.spotify.music.nowplaying.common.view.contextmenu.o;

final class h extends o {
    private final o.c a;
    private final o.b b;

    /* access modifiers changed from: package-private */
    public static final class b extends o.a {
        private o.c a;
        private o.b b;

        b() {
        }

        @Override // com.spotify.music.nowplaying.common.view.contextmenu.o.a
        public o a() {
            String str = this.a == null ? " forTrack" : "";
            if (this.b == null) {
                str = je.x0(str, " forShow");
            }
            if (str.isEmpty()) {
                return new h(this.a, this.b, null);
            }
            throw new IllegalStateException(je.x0("Missing required properties:", str));
        }

        @Override // com.spotify.music.nowplaying.common.view.contextmenu.o.a
        public o.a b(o.b bVar) {
            if (bVar != null) {
                this.b = bVar;
                return this;
            }
            throw new NullPointerException("Null forShow");
        }

        @Override // com.spotify.music.nowplaying.common.view.contextmenu.o.a
        public o.a c(o.c cVar) {
            if (cVar != null) {
                this.a = cVar;
                return this;
            }
            throw new NullPointerException("Null forTrack");
        }
    }

    h(o.c cVar, o.b bVar, a aVar) {
        this.a = cVar;
        this.b = bVar;
    }

    /* access modifiers changed from: package-private */
    @Override // com.spotify.music.nowplaying.common.view.contextmenu.o
    public o.b b() {
        return this.b;
    }

    /* access modifiers changed from: package-private */
    @Override // com.spotify.music.nowplaying.common.view.contextmenu.o
    public o.c c() {
        return this.a;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof o)) {
            return false;
        }
        o oVar = (o) obj;
        if (!this.a.equals(oVar.c()) || !this.b.equals(oVar.b())) {
            return false;
        }
        return true;
    }

    public int hashCode() {
        return ((this.a.hashCode() ^ 1000003) * 1000003) ^ this.b.hashCode();
    }

    public String toString() {
        StringBuilder V0 = je.V0("ContextMenuConfiguration{forTrack=");
        V0.append(this.a);
        V0.append(", forShow=");
        V0.append(this.b);
        V0.append("}");
        return V0.toString();
    }
}
