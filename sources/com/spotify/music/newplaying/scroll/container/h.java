package com.spotify.music.newplaying.scroll.container;

import android.view.ViewTreeObserver;

public final /* synthetic */ class h implements ViewTreeObserver.OnScrollChangedListener {
    public final /* synthetic */ b0 a;
    public final /* synthetic */ WidgetsContainer b;
    public final /* synthetic */ io.reactivex.h c;

    public /* synthetic */ h(b0 b0Var, WidgetsContainer widgetsContainer, io.reactivex.h hVar) {
        this.a = b0Var;
        this.b = widgetsContainer;
        this.c = hVar;
    }

    @Override // android.view.ViewTreeObserver.OnScrollChangedListener
    public final void onScrollChanged() {
        this.a.b(this.b, this.c);
    }
}
