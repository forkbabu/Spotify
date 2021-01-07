package com.spotify.music.features.playlistentity.story.header;

import com.spotify.music.features.playlistentity.story.header.d0;

public abstract class f0 {

    public interface a {
        a a(boolean z);

        a b(boolean z);

        f0 build();

        a c(b66 b66);

        a d(boolean z);

        a e(boolean z);

        a f(boolean z);

        a g(boolean z);
    }

    static {
        d0.b bVar = new d0.b();
        bVar.f(false);
        d0.b bVar2 = bVar;
        bVar2.a(false);
        d0.b bVar3 = bVar2;
        bVar3.g(false);
        d0.b bVar4 = bVar3;
        bVar4.b(false);
        d0.b bVar5 = bVar4;
        bVar5.d(false);
        d0.b bVar6 = bVar5;
        bVar6.e(false);
        d0.b bVar7 = bVar6;
        bVar7.c(b66.e);
        bVar7.build();
    }

    public static a a() {
        return new d0.b();
    }

    public abstract boolean b();

    public abstract b66 c();

    public abstract boolean d();

    public abstract boolean e();

    public abstract boolean f();

    public abstract boolean g();

    public abstract boolean h();
}
