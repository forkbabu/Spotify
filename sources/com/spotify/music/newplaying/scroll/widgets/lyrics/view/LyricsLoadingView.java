package com.spotify.music.newplaying.scroll.widgets.lyrics.view;

import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.LinearLayout;
import com.comscore.streaming.WindowState;
import com.spotify.music.C0707R;

public class LyricsLoadingView extends LinearLayout {
    private AnimatorSet a;
    private View b;
    private View c;
    private View f;
    private View n;

    public LyricsLoadingView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    private static ObjectAnimator a(View view, int i) {
        view.setLayerType(2, null);
        ObjectAnimator duration = ObjectAnimator.ofFloat(view, "alpha", 0.08f, 0.16f, 0.08f).setDuration(1400L);
        duration.setRepeatCount(-1);
        duration.setRepeatMode(1);
        duration.setInterpolator(ta0.f);
        duration.setStartDelay((long) i);
        return duration;
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        this.b = findViewById(C0707R.id.view1);
        this.c = findViewById(C0707R.id.view2);
        this.f = findViewById(C0707R.id.view3);
        this.n = findViewById(C0707R.id.view4);
        this.a = new AnimatorSet();
    }

    /* access modifiers changed from: protected */
    @Override // android.view.View
    public void onVisibilityChanged(View view, int i) {
        super.onVisibilityChanged(view, i);
        AnimatorSet animatorSet = this.a;
        if (animatorSet != null) {
            if (i == 0) {
                animatorSet.cancel();
                this.a.playTogether(a(this.b, 0), a(this.c, 200), a(this.f, WindowState.NORMAL), a(this.n, 600));
                this.a.start();
            } else if (i == 4 || i == 8) {
                animatorSet.cancel();
                this.b.setLayerType(0, null);
                this.c.setLayerType(0, null);
                this.f.setLayerType(0, null);
                this.n.setLayerType(0, null);
            }
        }
    }

    public LyricsLoadingView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        LayoutInflater.from(context).inflate(C0707R.layout.lyrics_loading_view, this);
    }
}
