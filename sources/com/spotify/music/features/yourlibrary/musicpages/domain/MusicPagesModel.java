package com.spotify.music.features.yourlibrary.musicpages.domain;

import com.google.common.base.Optional;
import com.google.common.collect.ImmutableMap;
import com.spotify.music.features.yourlibrary.musicpages.datasource.y3;
import com.spotify.music.features.yourlibrary.musicpages.domain.q0;
import com.spotify.music.features.yourlibrary.musicpages.domain.u0;
import com.spotify.music.features.yourlibrary.musicpages.item.MusicItem;
import com.spotify.music.features.yourlibrary.musicpages.pages.u;
import com.spotify.music.features.yourlibrary.musicpages.prefs.domain.PagePrefs;
import com.spotify.music.yourlibrary.interfaces.i;
import java.util.List;

public abstract class MusicPagesModel {

    public enum LoadingState {
        LOADING,
        LOADED,
        LOADED_PARTIALLY,
        LOADED_EMPTY,
        LOADED_EMPTY_WITH_FILTER,
        LOADED_EMPTY_WITH_TEXT_FILTER
    }

    public static abstract class a {
        public abstract a a(Optional<ImmutableMap<String, Boolean>> optional);

        public abstract a b(Optional<qpd> optional);

        public abstract MusicPagesModel c();

        public abstract a d(y3 y3Var);

        public abstract a e(Optional<Boolean> optional);

        public abstract a f(boolean z);

        public abstract a g(boolean z);

        public abstract a h(boolean z);

        public abstract a i(boolean z);

        public abstract a j(Optional<Boolean> optional);

        public abstract a k(LoadingState loadingState);

        public abstract a l(u uVar);

        public abstract a m(boolean z);

        public abstract a n(mpd mpd);

        public abstract a o(Optional<PagePrefs> optional);

        public abstract a p(u0 u0Var);

        public abstract a q(Optional<Boolean> optional);

        public abstract a r(Optional<Boolean> optional);

        public abstract a s(String str);

        public abstract a t(boolean z);

        public abstract a u(int i);

        public abstract a v(int i);

        public abstract a w(i iVar);
    }

    public static a d() {
        q0.b bVar = new q0.b();
        bVar.b(Optional.absent());
        bVar.a(Optional.absent());
        bVar.o(Optional.absent());
        bVar.v(0);
        bVar.u(0);
        bVar.d(y3.b);
        bVar.s("");
        bVar.r(Optional.absent());
        bVar.q(Optional.absent());
        bVar.e(Optional.absent());
        bVar.k(LoadingState.LOADING);
        bVar.t(false);
        bVar.f(false);
        bVar.j(Optional.absent());
        bVar.h(false);
        bVar.n(mpd.c());
        bVar.w(i.a);
        bVar.g(false);
        bVar.i(false);
        bVar.p(new u0.d());
        bVar.m(false);
        return bVar;
    }

    public abstract Optional<ImmutableMap<String, Boolean>> a();

    public abstract Optional<qpd> b();

    public abstract y3 c();

    public abstract Optional<Boolean> e();

    public List<fb9> f() {
        y3 c = c();
        for (int i = 0; i < c.getCount(); i++) {
            MusicItem item = c().getItem(i);
            if (!(item.h() == null || item.h().isEmpty())) {
                return item.h();
            }
        }
        return null;
    }

    public abstract boolean g();

    public abstract boolean h();

    public abstract boolean i();

    public abstract boolean j();

    public abstract Optional<Boolean> k();

    public abstract LoadingState l();

    public abstract u m();

    public abstract boolean n();

    public abstract mpd o();

    public abstract Optional<PagePrefs> p();

    public abstract u0 q();

    public abstract Optional<Boolean> r();

    public abstract Optional<Boolean> s();

    public abstract String t();

    public abstract boolean u();

    public abstract a v();

    public abstract int w();

    public abstract int x();

    public abstract i y();
}
