package com.spotify.music.features.yourlibrary.musicpages.view;

import com.google.android.material.appbar.AppBarLayout;
import com.spotify.android.glue.patterns.prettylist.u;

public final /* synthetic */ class a implements AppBarLayout.c {
    public final /* synthetic */ j0 a;
    public final /* synthetic */ u b;
    public final /* synthetic */ da2 c;

    public /* synthetic */ a(j0 j0Var, u uVar, da2 da2) {
        this.a = j0Var;
        this.b = uVar;
        this.c = da2;
    }

    @Override // com.google.android.material.appbar.AppBarLayout.b
    public final void onOffsetChanged(AppBarLayout appBarLayout, int i) {
        this.a.j(this.b, this.c, appBarLayout, i);
    }
}
