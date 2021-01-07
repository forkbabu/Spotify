package com.spotify.mobile.android.ui.view;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.view.animation.ScaleAnimation;
import android.widget.LinearLayout;
import com.spotify.mobile.android.util.n;
import com.spotify.music.C0707R;

public class ShufflePlayHeaderView extends LinearLayout {
    public ShufflePlayHeaderView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public static void a(n nVar, View view) {
        ScaleAnimation scaleAnimation = new ScaleAnimation(1.0f, 0.95f, 1.0f, 0.95f, 1, 0.5f, 1, 0.5f);
        scaleAnimation.setDuration(100);
        ScaleAnimation scaleAnimation2 = new ScaleAnimation(0.95f, 1.05f, 0.95f, 1.05f, 1, 0.5f, 1, 0.5f);
        scaleAnimation2.setDuration(150);
        ScaleAnimation scaleAnimation3 = new ScaleAnimation(1.05f, 1.0f, 1.05f, 1.0f, 1, 0.5f, 1, 0.5f);
        scaleAnimation3.setDuration(100);
        nVar.b(view, scaleAnimation, false);
        nVar.b(view, scaleAnimation2, false);
        nVar.b(view, scaleAnimation3, false);
    }

    public View getPlayButton() {
        return null;
    }

    /* access modifiers changed from: protected */
    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        findViewById(C0707R.id.content);
        new n();
        LinearLayout linearLayout = (LinearLayout) findViewById(C0707R.id.play_button_container);
    }
}
