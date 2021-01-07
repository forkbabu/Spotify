package com.spotify.music.nowplaying.podcast.mixedmedia.ui.flowables.position;

import defpackage.j1c;
import kotlin.jvm.internal.h;

public final class i {
    private Long a;
    private j1c.b.C0628b b = new j1c.b.C0628b(0, false, 2);
    private j1c.a c = j1c.a.c.c;
    private j1c.a.b.C0626a d;

    public final j1c.a a() {
        return this.c;
    }

    public final j1c.b.C0628b b() {
        return this.b;
    }

    public final j1c.a.b.C0626a c() {
        return this.d;
    }

    public final Long d() {
        return this.a;
    }

    public final void e() {
        this.a = null;
        this.b = new j1c.b.C0628b(0, false, 2);
        this.c = j1c.a.c.c;
        this.d = null;
    }

    public final void f(j1c.a aVar) {
        h.e(aVar, "<set-?>");
        this.c = aVar;
    }

    public final void g(j1c.b.C0628b bVar) {
        h.e(bVar, "<set-?>");
        this.b = bVar;
    }

    public final void h(j1c.a.b.C0626a aVar) {
        this.d = aVar;
    }

    public final void i(Long l) {
        this.a = l;
    }
}
