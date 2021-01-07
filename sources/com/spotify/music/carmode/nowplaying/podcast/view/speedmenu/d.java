package com.spotify.music.carmode.nowplaying.podcast.view.speedmenu;

import com.spotify.music.carmode.nowplaying.podcast.view.speedmenu.j;

final class d extends j {
    private final int a;
    private final int b;

    static final class b implements j.a {
        private Integer a;
        private Integer b;

        b() {
        }

        public j a() {
            String str = this.a == null ? " contentDescription" : "";
            if (this.b == null) {
                str = je.x0(str, " speedValue");
            }
            if (str.isEmpty()) {
                return new d(this.a.intValue(), this.b.intValue(), null);
            }
            throw new IllegalStateException(je.x0("Missing required properties:", str));
        }

        public j.a b(int i) {
            this.a = Integer.valueOf(i);
            return this;
        }

        public j.a c(int i) {
            this.b = Integer.valueOf(i);
            return this;
        }
    }

    d(int i, int i2, a aVar) {
        this.a = i;
        this.b = i2;
    }

    @Override // com.spotify.music.carmode.nowplaying.podcast.view.speedmenu.j
    public int a() {
        return this.a;
    }

    @Override // com.spotify.music.carmode.nowplaying.podcast.view.speedmenu.j
    public int b() {
        return this.b;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof j)) {
            return false;
        }
        j jVar = (j) obj;
        if (this.a == jVar.a() && this.b == jVar.b()) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        return ((this.a ^ 1000003) * 1000003) ^ this.b;
    }

    public String toString() {
        StringBuilder V0 = je.V0("PlaybackSpeedMenuItem{contentDescription=");
        V0.append(this.a);
        V0.append(", speedValue=");
        return je.B0(V0, this.b, "}");
    }
}
