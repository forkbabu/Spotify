package com.spotify.music.features.yourlibrary.container.view;

import com.google.android.material.appbar.AppBarLayout;

final class z implements AppBarLayout.c {
    private int a = -1;
    private int b = -1;
    final /* synthetic */ da2 c;

    z(da2 da2) {
        this.c = da2;
    }

    @Override // com.google.android.material.appbar.AppBarLayout.b
    public void onOffsetChanged(AppBarLayout appBarLayout, int i) {
        int totalScrollRange = appBarLayout.getTotalScrollRange();
        if (totalScrollRange != this.a) {
            this.a = totalScrollRange;
            this.c.accept(o19.b(totalScrollRange));
        }
        if (i != this.b) {
            this.b = i;
            this.c.accept(o19.k(totalScrollRange + i));
        }
    }
}
