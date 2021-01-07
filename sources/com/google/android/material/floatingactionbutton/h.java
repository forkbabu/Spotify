package com.google.android.material.floatingactionbutton;

import android.view.ViewTreeObserver;

/* access modifiers changed from: package-private */
public class h implements ViewTreeObserver.OnPreDrawListener {
    final /* synthetic */ f a;

    h(f fVar) {
        this.a = fVar;
    }

    @Override // android.view.ViewTreeObserver.OnPreDrawListener
    public boolean onPreDraw() {
        this.a.y();
        return true;
    }
}
