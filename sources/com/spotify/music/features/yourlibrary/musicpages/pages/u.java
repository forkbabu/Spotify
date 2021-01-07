package com.spotify.music.features.yourlibrary.musicpages.pages;

import com.google.common.base.Optional;
import com.google.common.collect.ImmutableMap;
import com.spotify.music.features.yourlibrary.musicpages.pages.n;

public abstract class u {

    public static abstract class a {
        public abstract u a();

        public abstract a b(ImmutableMap<String, Boolean> immutableMap);

        public abstract a c(qpd qpd);

        public abstract a d(String str);

        public abstract a e(EmptyPageAction emptyPageAction);

        public abstract a f(CharSequence charSequence);

        public abstract a g(String str);

        public abstract a h(di9 di9);

        public abstract a i(CharSequence charSequence);

        public abstract a j(String str);

        public abstract a k(MusicPageId musicPageId);

        public abstract a l(PageAction pageAction);

        public abstract a m(String str);

        public abstract a n(boolean z);

        public abstract a o(boolean z);

        public abstract a p(boolean z);

        public abstract a q(boolean z);

        public abstract a r(String str);

        public abstract a s(Optional<String> optional);
    }

    public static a a() {
        n.b bVar = new n.b();
        bVar.g("");
        bVar.f("");
        bVar.d("");
        bVar.h(di9.a);
        bVar.e(EmptyPageAction.NO_ACTION);
        bVar.l(PageAction.NO_ACTION);
        bVar.m("");
        bVar.o(true);
        bVar.n(true);
        bVar.p(true);
        bVar.q(true);
        bVar.j("");
        bVar.i("");
        return bVar;
    }

    public abstract ImmutableMap<String, Boolean> b();

    public abstract qpd c();

    public abstract String d();

    public abstract EmptyPageAction e();

    public abstract CharSequence f();

    public abstract String g();

    public abstract di9 h();

    public abstract CharSequence i();

    public abstract String j();

    public abstract MusicPageId k();

    public abstract PageAction l();

    public abstract String m();

    public abstract boolean n();

    public abstract boolean o();

    public abstract boolean p();

    public abstract boolean q();

    public abstract String r();

    public abstract a s();

    public abstract Optional<String> t();
}
