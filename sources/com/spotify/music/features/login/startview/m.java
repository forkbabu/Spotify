package com.spotify.music.features.login.startview;

import android.view.ViewTreeObserver;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.spotify.music.C0707R;

class m implements ViewTreeObserver.OnGlobalLayoutListener {
    final /* synthetic */ StartFragment a;

    m(StartFragment startFragment) {
        this.a = startFragment;
    }

    @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
    public void onGlobalLayout() {
        StartFragment.K4(this.a).getViewTreeObserver().removeOnGlobalLayoutListener(this);
        int measuredHeight = StartFragment.L4(this.a).getMeasuredHeight();
        StartFragment startFragment = this.a;
        startFragment.h0.c((ConstraintLayout) startFragment.m4().findViewById(C0707R.id.relativeLayout), StartFragment.K4(this.a), measuredHeight);
    }
}
