package com.spotify.music.newplaying.scroll.container;

import io.reactivex.h;
import io.reactivex.i;

public final /* synthetic */ class j implements i {
    public final /* synthetic */ b0 a;
    public final /* synthetic */ WidgetsContainer b;

    public /* synthetic */ j(b0 b0Var, WidgetsContainer widgetsContainer) {
        this.a = b0Var;
        this.b = widgetsContainer;
    }

    @Override // io.reactivex.i
    public final void subscribe(h hVar) {
        b0 b0Var = this.a;
        WidgetsContainer widgetsContainer = this.b;
        b0Var.getClass();
        h hVar2 = new h(b0Var, widgetsContainer, hVar);
        widgetsContainer.getViewTreeObserver().addOnScrollChangedListener(hVar2);
        hVar.e(new i(widgetsContainer, hVar2));
    }
}
