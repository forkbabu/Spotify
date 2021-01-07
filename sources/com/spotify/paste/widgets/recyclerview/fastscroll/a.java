package com.spotify.paste.widgets.recyclerview.fastscroll;

import android.animation.ObjectAnimator;
import android.animation.PropertyValuesHolder;
import android.view.View;
import android.view.ViewTreeObserver;

/* access modifiers changed from: package-private */
public class a implements ViewTreeObserver.OnPreDrawListener {
    final /* synthetic */ RecyclerViewFastScroller a;

    a(RecyclerViewFastScroller recyclerViewFastScroller) {
        this.a = recyclerViewFastScroller;
    }

    @Override // android.view.ViewTreeObserver.OnPreDrawListener
    public boolean onPreDraw() {
        this.a.getViewTreeObserver().removeOnPreDrawListener(this);
        ObjectAnimator ofPropertyValuesHolder = ObjectAnimator.ofPropertyValuesHolder(this.a, PropertyValuesHolder.ofFloat(View.ALPHA, 1.0f), PropertyValuesHolder.ofFloat(View.TRANSLATION_X, 0.0f));
        ofPropertyValuesHolder.setDuration(200L);
        ofPropertyValuesHolder.setInterpolator(xud.b(this.a.a.getContext()));
        ofPropertyValuesHolder.start();
        return true;
    }
}
