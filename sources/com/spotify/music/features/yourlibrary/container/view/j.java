package com.spotify.music.features.yourlibrary.container.view;

import android.view.View;

public final /* synthetic */ class j implements View.OnClickListener {
    public final /* synthetic */ GroupedTabLayout a;
    public final /* synthetic */ int b;
    public final /* synthetic */ int c;

    public /* synthetic */ j(GroupedTabLayout groupedTabLayout, int i, int i2) {
        this.a = groupedTabLayout;
        this.b = i;
        this.c = i2;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        this.a.p(this.b, this.c, view);
    }
}
