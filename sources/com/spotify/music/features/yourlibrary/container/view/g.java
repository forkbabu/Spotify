package com.spotify.music.features.yourlibrary.container.view;

import android.view.View;

public final /* synthetic */ class g implements View.OnClickListener {
    public final /* synthetic */ GroupedTabLayout a;
    public final /* synthetic */ int b;
    public final /* synthetic */ int c;
    public final /* synthetic */ int f;

    public /* synthetic */ g(GroupedTabLayout groupedTabLayout, int i, int i2, int i3) {
        this.a = groupedTabLayout;
        this.b = i;
        this.c = i2;
        this.f = i3;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        this.a.q(this.b, this.c, this.f, view);
    }
}
