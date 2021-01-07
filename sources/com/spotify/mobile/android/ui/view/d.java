package com.spotify.mobile.android.ui.view;

import android.animation.ValueAnimator;
import android.view.View;
import android.view.ViewGroup;

public final /* synthetic */ class d implements ValueAnimator.AnimatorUpdateListener {
    public final /* synthetic */ ViewGroup.MarginLayoutParams a;
    public final /* synthetic */ View b;

    public /* synthetic */ d(ViewGroup.MarginLayoutParams marginLayoutParams, View view) {
        this.a = marginLayoutParams;
        this.b = view;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        ViewGroup.MarginLayoutParams marginLayoutParams = this.a;
        View view = this.b;
        int i = DownloadHeaderView.A;
        marginLayoutParams.topMargin = ((Integer) valueAnimator.getAnimatedValue()).intValue();
        view.requestLayout();
    }
}
