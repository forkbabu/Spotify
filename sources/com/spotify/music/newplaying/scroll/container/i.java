package com.spotify.music.newplaying.scroll.container;

import android.view.ViewTreeObserver;
import io.reactivex.functions.f;

public final /* synthetic */ class i implements f {
    public final /* synthetic */ WidgetsContainer a;
    public final /* synthetic */ ViewTreeObserver.OnScrollChangedListener b;

    public /* synthetic */ i(WidgetsContainer widgetsContainer, ViewTreeObserver.OnScrollChangedListener onScrollChangedListener) {
        this.a = widgetsContainer;
        this.b = onScrollChangedListener;
    }

    @Override // io.reactivex.functions.f
    public final void cancel() {
        WidgetsContainer widgetsContainer = this.a;
        widgetsContainer.getViewTreeObserver().removeOnScrollChangedListener(this.b);
    }
}
