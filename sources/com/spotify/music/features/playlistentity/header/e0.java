package com.spotify.music.features.playlistentity.header;

import android.view.View;
import com.google.android.material.appbar.AppBarLayout;

public final /* synthetic */ class e0 implements AppBarLayout.c {
    public final /* synthetic */ z0 a;
    public final /* synthetic */ View b;

    public /* synthetic */ e0(z0 z0Var, View view) {
        this.a = z0Var;
        this.b = view;
    }

    @Override // com.google.android.material.appbar.AppBarLayout.b
    public final void onOffsetChanged(AppBarLayout appBarLayout, int i) {
        this.a.C(this.b, appBarLayout, i);
    }
}
