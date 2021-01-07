package com.spotify.music.features.yourlibrary.musicpages.prefs.domain;

import com.google.common.base.Function;
import com.google.common.base.Optional;
import com.google.common.collect.Collections2;
import com.google.common.collect.FluentIterable;
import com.google.common.collect.ImmutableList;
import com.google.common.collect.UnmodifiableListIterator;
import com.spotify.mobius.e0;
import com.spotify.mobius.s;
import com.spotify.music.features.yourlibrary.musicpages.prefs.domain.PrefsModel;
import com.spotify.music.features.yourlibrary.musicpages.prefs.domain.j;
import com.spotify.music.features.yourlibrary.musicpages.prefs.domain.k;
import com.spotify.music.features.yourlibrary.musicpages.prefs.domain.m;

public final class l {
    public static s<m, j> a(m mVar) {
        if (!mVar.f().isPresent()) {
            return s.c(mVar, z42.l(new j.b()));
        }
        if (!mVar.d().isPresent()) {
            return s.c(mVar, z42.l(new j.a(mVar.f().get())));
        }
        return s.b(mVar);
    }

    static e0 b(m mVar, k.b bVar) {
        PrefsModel f = bVar.f();
        UnmodifiableListIterator<u3<String, Long>> listIterator = mVar.c().listIterator();
        while (listIterator.hasNext()) {
            u3<String, Long> next = listIterator.next();
            f = d(f, next.a, next.b, mVar.b());
        }
        m.a e = mVar.e();
        e.d(Optional.of(f));
        e.c(ImmutableList.of());
        return e0.f(e.a());
    }

    static e0 c(m mVar, k.a aVar) {
        if (!mVar.d().isPresent()) {
            m.a e = mVar.e();
            e.c(ImmutableList.copyOf(FluentIterable.concat(mVar.c(), ImmutableList.of(new u3(aVar.g(), aVar.f())))));
            return e0.f(e.a());
        }
        m.a e2 = mVar.e();
        e2.d(Optional.of(d(mVar.d().get(), aVar.g(), aVar.f(), mVar.b())));
        return e0.f(e2.a());
    }

    private static PrefsModel d(PrefsModel prefsModel, String str, Long l, int i) {
        PrefsModel.a builder = prefsModel.toBuilder();
        ImmutableList sortedCopyOf = ImmutableList.sortedCopyOf(f.a, Collections2.transform((Iterable) prefsModel.pagePrefs(), (Function) new a(str, l)));
        if (sortedCopyOf.size() > i) {
            sortedCopyOf = sortedCopyOf.subList(0, i);
        }
        builder.b(sortedCopyOf);
        return builder.a();
    }
}
