package com.spotify.music.podcast.ui.trailer;

import com.spotify.music.podcast.ui.trailer.c;

public abstract class e {

    public interface a {
        a a(Long l);

        a b(Long l);

        e build();

        a position(Long l);
    }

    static {
        c.b bVar = new c.b();
        bVar.position(0L);
        c.b bVar2 = bVar;
        bVar2.b(0L);
        c.b bVar3 = bVar2;
        bVar3.a(0L);
        bVar3.build();
        c.b bVar4 = new c.b();
        bVar4.position(-1L);
        c.b bVar5 = bVar4;
        bVar5.b(-1L);
        c.b bVar6 = bVar5;
        bVar6.a(-1L);
        bVar6.build();
    }

    public static a a() {
        return new c.b();
    }

    public abstract Long b();

    public abstract Long c();

    public abstract Long d();
}
