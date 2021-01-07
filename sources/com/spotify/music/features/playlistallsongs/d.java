package com.spotify.music.features.playlistallsongs;

import com.spotify.music.features.playlistallsongs.c;

public final class d implements c.a {
    private Integer a;
    private boolean b;
    private boolean c;
    private Boolean d;
    private boolean e;

    d() {
    }

    public c.a a(Boolean bool) {
        this.d = null;
        return this;
    }

    public c b() {
        return new c(this.b, this.c, this.d, this.e, this.a);
    }

    public c.a c(boolean z) {
        this.e = z;
        return this;
    }

    public c.a d(boolean z) {
        this.b = z;
        return this;
    }

    public c.a e(Integer num) {
        this.a = num;
        return this;
    }

    public c.a f(boolean z) {
        this.c = z;
        return this;
    }
}
