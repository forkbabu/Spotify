package com.spotify.android.glue.patterns.contextmenu.glue;

import android.view.ViewTreeObserver;

/* access modifiers changed from: package-private */
public class q implements ViewTreeObserver.OnGlobalLayoutListener {
    final /* synthetic */ o a;

    q(o oVar) {
        this.a = oVar;
    }

    @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
    public void onGlobalLayout() {
        o oVar = this.a;
        oVar.g = oVar.f.getTop();
        this.a.f.getViewTreeObserver().removeOnGlobalLayoutListener(this);
    }
}
