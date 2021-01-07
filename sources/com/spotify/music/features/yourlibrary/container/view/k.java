package com.spotify.music.features.yourlibrary.container.view;

import com.google.android.material.appbar.AppBarLayout;
import com.google.common.collect.ImmutableSortedMap;
import io.reactivex.functions.g;

public final /* synthetic */ class k implements g {
    public final /* synthetic */ x a;
    public final /* synthetic */ AppBarLayout.c b;

    public /* synthetic */ k(x xVar, AppBarLayout.c cVar) {
        this.a = xVar;
        this.b = cVar;
    }

    @Override // io.reactivex.functions.g
    public final void accept(Object obj) {
        this.a.m(this.b, (ImmutableSortedMap) obj);
    }
}
