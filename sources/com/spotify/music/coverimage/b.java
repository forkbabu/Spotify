package com.spotify.music.coverimage;

import android.widget.ImageView;

public final /* synthetic */ class b implements qg0 {
    public final /* synthetic */ CoverImageActivity a;
    public final /* synthetic */ int b;
    public final /* synthetic */ int c;
    public final /* synthetic */ int f;
    public final /* synthetic */ int n;

    public /* synthetic */ b(CoverImageActivity coverImageActivity, int i, int i2, int i3, int i4) {
        this.a = coverImageActivity;
        this.b = i;
        this.c = i2;
        this.f = i3;
        this.n = i4;
    }

    @Override // defpackage.qg0
    public final void accept(Object obj) {
        this.a.V0(this.b, this.c, this.f, this.n, (ImageView) obj);
    }
}
