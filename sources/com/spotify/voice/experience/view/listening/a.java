package com.spotify.voice.experience.view.listening;

import android.animation.ValueAnimator;

public final /* synthetic */ class a implements ValueAnimator.AnimatorUpdateListener {
    public final /* synthetic */ ListeningView a;

    public /* synthetic */ a(ListeningView listeningView) {
        this.a = listeningView;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        this.a.b(valueAnimator);
    }
}
