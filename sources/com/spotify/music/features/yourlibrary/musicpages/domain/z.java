package com.spotify.music.features.yourlibrary.musicpages.domain;

import com.google.common.base.Predicate;
import com.spotify.music.features.yourlibrary.musicpages.domain.s0;
import defpackage.di9;

public final /* synthetic */ class z implements Predicate {
    public final /* synthetic */ s0.e0 a;

    public /* synthetic */ z(s0.e0 e0Var) {
        this.a = e0Var;
    }

    @Override // com.google.common.base.Predicate
    public final boolean apply(Object obj) {
        return ((di9.d) obj).c().c().equals(this.a.Q().a().a());
    }
}
