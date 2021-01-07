package com.spotify.music.nowplaying.drivingmode.view.heart;

import android.graphics.Rect;
import android.view.TouchDelegate;
import android.view.View;
import com.spotify.music.C0707R;

public final /* synthetic */ class a implements Runnable {
    public final /* synthetic */ DrivingHeartButton a;

    public /* synthetic */ a(DrivingHeartButton drivingHeartButton) {
        this.a = drivingHeartButton;
    }

    @Override // java.lang.Runnable
    public final void run() {
        DrivingHeartButton drivingHeartButton = this.a;
        Rect rect = new Rect();
        drivingHeartButton.getHitRect(rect);
        int dimensionPixelSize = drivingHeartButton.getContext().getResources().getDimensionPixelSize(C0707R.dimen.std_16dp);
        rect.set(rect.left - dimensionPixelSize, rect.top - dimensionPixelSize, rect.right + dimensionPixelSize, rect.bottom + dimensionPixelSize);
        ((View) drivingHeartButton.getParent()).setTouchDelegate(new TouchDelegate(rect, drivingHeartButton));
    }
}
