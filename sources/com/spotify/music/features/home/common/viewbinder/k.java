package com.spotify.music.features.home.common.viewbinder;

import com.google.android.material.appbar.AppBarLayout;

public final /* synthetic */ class k implements AppBarLayout.c {
    public final /* synthetic */ y a;

    public /* synthetic */ k(y yVar) {
        this.a = yVar;
    }

    @Override // com.google.android.material.appbar.AppBarLayout.b
    public final void onOffsetChanged(AppBarLayout appBarLayout, int i) {
        this.a.S(appBarLayout, i);
    }
}
