package com.spotify.music.carmode.nowplaying.common.view;

import android.graphics.Rect;
import android.view.TouchDelegate;
import android.view.View;
import com.spotify.music.C0707R;

public final /* synthetic */ class d implements Runnable {
    public final /* synthetic */ HeartButton a;

    public /* synthetic */ d(HeartButton heartButton) {
        this.a = heartButton;
    }

    @Override // java.lang.Runnable
    public final void run() {
        HeartButton heartButton = this.a;
        Rect rect = new Rect();
        heartButton.getHitRect(rect);
        int dimensionPixelSize = heartButton.getContext().getResources().getDimensionPixelSize(C0707R.dimen.std_16dp);
        rect.set(rect.left - dimensionPixelSize, rect.top - dimensionPixelSize, rect.right + dimensionPixelSize, rect.bottom + dimensionPixelSize);
        ((View) heartButton.getParent()).setTouchDelegate(new TouchDelegate(rect, heartButton));
    }
}
