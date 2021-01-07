package com.spotify.music.nowplaying.drivingmode.view.verticalsplitlayout;

import android.util.TypedValue;
import android.view.ViewTreeObserver;
import com.spotify.music.C0707R;

class c implements ViewTreeObserver.OnPreDrawListener {
    final /* synthetic */ VerticalSplitLayout a;

    c(VerticalSplitLayout verticalSplitLayout) {
        this.a = verticalSplitLayout;
    }

    @Override // android.view.ViewTreeObserver.OnPreDrawListener
    public boolean onPreDraw() {
        TypedValue typedValue = new TypedValue();
        this.a.getResources().getValue(C0707R.dimen.driving_pivot_entry_exit_height_percent, typedValue, true);
        float f = typedValue.getFloat();
        VerticalSplitLayout verticalSplitLayout = this.a;
        verticalSplitLayout.n = (int) (((float) verticalSplitLayout.getHeight()) * f);
        this.a.v();
        this.a.getViewTreeObserver().removeOnPreDrawListener(this);
        this.a.getViewTreeObserver().addOnPreDrawListener(new a(this));
        return true;
    }
}
