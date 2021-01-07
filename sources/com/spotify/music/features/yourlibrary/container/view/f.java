package com.spotify.music.features.yourlibrary.container.view;

public final /* synthetic */ class f implements Runnable {
    public final /* synthetic */ GroupedTabLayout a;
    public final /* synthetic */ int b;
    public final /* synthetic */ float c;

    public /* synthetic */ f(GroupedTabLayout groupedTabLayout, int i, float f) {
        this.a = groupedTabLayout;
        this.b = i;
        this.c = f;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.a.s(this.b, this.c);
    }
}
