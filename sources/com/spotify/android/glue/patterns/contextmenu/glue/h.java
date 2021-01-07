package com.spotify.android.glue.patterns.contextmenu.glue;

import android.view.ViewTreeObserver;

public final /* synthetic */ class h implements ViewTreeObserver.OnScrollChangedListener {
    public final /* synthetic */ o a;

    public /* synthetic */ h(o oVar) {
        this.a = oVar;
    }

    @Override // android.view.ViewTreeObserver.OnScrollChangedListener
    public final void onScrollChanged() {
        o.r(this.a);
    }
}
