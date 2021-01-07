package com.spotify.mobile.android.util;

import android.view.View;
import android.view.ViewTreeObserver;

/* access modifiers changed from: package-private */
public final class e0 implements ViewTreeObserver.OnPreDrawListener {
    final /* synthetic */ qg0 a;
    final /* synthetic */ View b;
    final /* synthetic */ boolean c;

    e0(qg0 qg0, View view, boolean z) {
        this.a = qg0;
        this.b = view;
        this.c = z;
    }

    @Override // android.view.ViewTreeObserver.OnPreDrawListener
    public boolean onPreDraw() {
        this.a.accept(this.b);
        if (!this.c) {
            return true;
        }
        this.b.getViewTreeObserver().removeOnPreDrawListener(this);
        return true;
    }
}
