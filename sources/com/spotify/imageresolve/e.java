package com.spotify.imageresolve;

import com.google.common.base.Predicate;
import com.google.common.collect.Collections2;
import com.google.common.collect.ImmutableSet;
import io.reactivex.functions.l;

public final /* synthetic */ class e implements l {
    public static final /* synthetic */ e a = new e();

    private /* synthetic */ e() {
    }

    @Override // io.reactivex.functions.l
    public final Object apply(Object obj) {
        return ImmutableSet.copyOf(Collections2.transform(Collections2.filter((Iterable) ((CacheStatusResponse) obj).result(), (Predicate) a.a), d.a));
    }
}
