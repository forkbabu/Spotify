package com.spotify.music.nowplaying.common.view.close;

import com.spotify.mobile.android.ui.activity.c;
import com.spotify.music.nowplaying.common.view.close.d;

public class b implements d.a {
    private final c a;
    private final jqd b;
    private d c;

    public b(c cVar, jqd jqd) {
        this.a = cVar;
        this.b = jqd;
    }

    public void a() {
        this.b.m();
        this.a.a();
    }

    public void b(d dVar) {
        dVar.getClass();
        this.c = dVar;
        dVar.setListener(this);
    }

    public void c() {
        this.c.setListener(null);
    }
}
