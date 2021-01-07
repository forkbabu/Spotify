package com.spotify.music.features.yourlibrary.musicpages.pages;

import com.google.common.base.Optional;
import com.google.common.collect.ImmutableList;
import com.spotify.mobile.android.util.LinkType;
import com.spotify.music.features.yourlibrary.musicpages.pages.o;
import com.spotify.music.libs.viewuri.c;

public abstract class v {

    public static abstract class a {
        public abstract a a(ImmutableList<LinkType> immutableList);

        public abstract v b();

        public abstract a c(ifd ifd);

        public abstract a d(com.spotify.instrumentation.a aVar);

        public abstract a e(Optional<c> optional);

        public abstract a f(Optional<c.b> optional);
    }

    public static a b() {
        o.b bVar = new o.b();
        bVar.e(Optional.absent());
        bVar.f(Optional.absent());
        bVar.a(ImmutableList.of());
        return bVar;
    }

    public abstract ImmutableList<LinkType> a();

    public abstract ifd c();

    public abstract com.spotify.instrumentation.a d();

    public abstract Optional<c> e();

    public abstract Optional<c.b> f();
}
