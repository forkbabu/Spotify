package com.spotify.music.features.playlistentity.story.header;

import android.view.View;
import com.google.android.material.appbar.AppBarLayout;

public final /* synthetic */ class v implements AppBarLayout.c {
    public final /* synthetic */ s0 a;
    public final /* synthetic */ View b;
    public final /* synthetic */ e0 c;

    public /* synthetic */ v(s0 s0Var, View view, e0 e0Var) {
        this.a = s0Var;
        this.b = view;
        this.c = e0Var;
    }

    @Override // com.google.android.material.appbar.AppBarLayout.b
    public final void onOffsetChanged(AppBarLayout appBarLayout, int i) {
        this.a.D(this.b, this.c, appBarLayout, i);
    }
}
