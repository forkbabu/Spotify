package com.spotify.libs.connect.picker.view;

import android.view.View;
import android.view.ViewTreeObserver;

/* access modifiers changed from: package-private */
public final class l implements ViewTreeObserver.OnPreDrawListener {
    final /* synthetic */ qg0 a;
    final /* synthetic */ View b;

    l(qg0 qg0, View view) {
        this.a = qg0;
        this.b = view;
    }

    @Override // android.view.ViewTreeObserver.OnPreDrawListener
    public boolean onPreDraw() {
        this.a.accept(this.b);
        this.b.getViewTreeObserver().removeOnPreDrawListener(this);
        return true;
    }
}
