package com.spotify.music.features.yourlibrary.musicpages.prefs.domain;

import com.google.common.base.Optional;
import com.google.common.collect.ImmutableList;
import com.spotify.music.features.yourlibrary.musicpages.prefs.domain.i;

public abstract class m {

    public static abstract class a {
        public abstract m a();

        public abstract a b(int i);

        public abstract a c(ImmutableList<u3<String, Long>> immutableList);

        public abstract a d(Optional<PrefsModel> optional);

        public abstract a e(Optional<String> optional);
    }

    public static a a() {
        i.b bVar = new i.b();
        bVar.e(Optional.absent());
        bVar.d(Optional.absent());
        bVar.c(ImmutableList.of());
        return bVar;
    }

    public abstract int b();

    public abstract ImmutableList<u3<String, Long>> c();

    public abstract Optional<PrefsModel> d();

    public abstract a e();

    public abstract Optional<String> f();
}
