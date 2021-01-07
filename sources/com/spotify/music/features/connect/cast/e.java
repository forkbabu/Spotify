package com.spotify.music.features.connect.cast;

import com.google.common.base.Predicate;
import defpackage.n6;

public final /* synthetic */ class e implements Predicate {
    public final /* synthetic */ n6.f a;

    public /* synthetic */ e(n6.f fVar) {
        this.a = fVar;
    }

    @Override // com.google.common.base.Predicate
    public final boolean apply(Object obj) {
        return this.a.i().equals(((n6.f) obj).i());
    }
}
