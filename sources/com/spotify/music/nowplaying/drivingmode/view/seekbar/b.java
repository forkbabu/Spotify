package com.spotify.music.nowplaying.drivingmode.view.seekbar;

import android.content.res.Resources;
import android.view.View;
import android.view.ViewTreeObserver;

/* access modifiers changed from: package-private */
public class b implements ViewTreeObserver.OnPreDrawListener {
    final /* synthetic */ int a;
    final /* synthetic */ DrivingSeekbarView b;

    b(DrivingSeekbarView drivingSeekbarView, int i) {
        this.b = drivingSeekbarView;
        this.a = i;
    }

    @Override // android.view.ViewTreeObserver.OnPreDrawListener
    public boolean onPreDraw() {
        double d = (double) Resources.getSystem().getDisplayMetrics().heightPixels;
        Double.isNaN(d);
        int height = ((int) (d * 0.05d)) - this.b.w.getHeight();
        View view = this.b.w;
        int i = this.a;
        view.setPadding(i, height, i, 0);
        this.b.getViewTreeObserver().removeOnPreDrawListener(this);
        return false;
    }
}
