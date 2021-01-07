package com.spotify.music.features.yourlibrary.container.view;

public final /* synthetic */ class e implements Runnable {
    public final /* synthetic */ GroupedTabLayout a;
    public final /* synthetic */ int b;
    public final /* synthetic */ float c;

    public /* synthetic */ e(GroupedTabLayout groupedTabLayout, int i, float f) {
        this.a = groupedTabLayout;
        this.b = i;
        this.c = f;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.a.r(this.b, this.c);
    }
}
