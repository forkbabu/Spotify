package com.spotify.mobile.android.hubframework.defaults.playback;

import com.google.common.base.Function;
import com.google.common.base.Predicate;
import com.google.common.collect.FluentIterable;
import com.spotify.mobile.android.util.LinkType;
import com.spotify.mobile.android.util.l0;
import java.util.Collections;

public final class k {
    public static final Predicate<String> a = new a();
    private static final Function<s81, Iterable<? extends s81>> b = new b();

    static class a implements Predicate<String> {
        a() {
        }

        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // com.google.common.base.Predicate
        public boolean apply(String str) {
            return l0.b(str, LinkType.TRACK);
        }
    }

    static class b implements Function<s81, Iterable<? extends s81>> {
        b() {
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // com.google.common.base.Function
        public Iterable<? extends s81> apply(s81 s81) {
            s81 s812 = s81;
            if (s812 == null) {
                return Collections.emptySet();
            }
            if (s812.children().isEmpty()) {
                return Collections.singleton(s812);
            }
            return FluentIterable.concat(Collections.singleton(s812), k.a(s812.children()));
        }
    }

    public static Iterable<? extends s81> a(Iterable<? extends s81> iterable) {
        return FluentIterable.from(iterable).transformAndConcat(b);
    }
}
