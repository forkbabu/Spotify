package com.spotify.music.yourlibrary.filterchips;

import android.graphics.Rect;
import android.view.ViewTreeObserver;

class o implements ViewTreeObserver.OnPreDrawListener {
    final /* synthetic */ FilterChipsView a;

    o(FilterChipsView filterChipsView) {
        this.a = filterChipsView;
    }

    @Override // android.view.ViewTreeObserver.OnPreDrawListener
    public boolean onPreDraw() {
        if (!this.a.getGlobalVisibleRect(new Rect())) {
            return true;
        }
        this.a.getViewTreeObserver().removeOnPreDrawListener(this);
        if (FilterChipsView.a(this.a) == null) {
            return true;
        }
        FilterChipsView.a(this.a).c();
        return true;
    }
}
