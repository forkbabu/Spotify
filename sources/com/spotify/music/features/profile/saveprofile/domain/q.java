package com.spotify.music.features.profile.saveprofile.domain;

import com.google.common.collect.ImmutableList;
import com.spotify.music.features.profile.saveprofile.domain.l;

public abstract class q {
    public static final q a;

    public static abstract class a {
        public abstract q a();

        public abstract a b(SaveProfileTask saveProfileTask);

        public abstract a c(String str);

        public abstract a d(String str);

        public abstract a e(String str);

        public abstract a f(String str);

        public abstract a g(String str);

        public abstract a h(String str);

        public abstract a i(float f);

        public abstract a j(SaveProfileState saveProfileState);

        public abstract a k(ImmutableList<SaveProfileTask> immutableList);

        public abstract a l(ImmutableList<SaveProfileTask> immutableList);

        public abstract a m(String str);

        public abstract a n(String str);
    }

    static {
        l.b bVar = new l.b();
        bVar.j(SaveProfileState.IDLE);
        bVar.i(0.0f);
        bVar.n("");
        bVar.m("");
        bVar.c("");
        bVar.d("");
        bVar.g("");
        bVar.h("");
        bVar.e("");
        bVar.f("");
        bVar.k(ImmutableList.of());
        bVar.l(ImmutableList.of());
        bVar.b(SaveProfileTask.NOTHING);
        a = bVar.a();
    }

    public abstract SaveProfileTask a();

    public abstract String b();

    public abstract String c();

    public abstract String d();

    public abstract String e();

    public abstract String f();

    public abstract String g();

    public abstract float h();

    public abstract SaveProfileState i();

    public abstract ImmutableList<SaveProfileTask> j();

    public abstract ImmutableList<SaveProfileTask> k();

    public abstract a l();

    public abstract String m();

    public abstract String n();
}
