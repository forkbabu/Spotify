package com.spotify.music.features.login.startview;

import android.os.Handler;
import android.os.Looper;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.transition.Transition;
import androidx.transition.t;

/* access modifiers changed from: package-private */
public final class p extends t {
    final /* synthetic */ AppCompatImageView a;

    p(AppCompatImageView appCompatImageView) {
        this.a = appCompatImageView;
    }

    @Override // androidx.transition.Transition.d
    public void d(Transition transition) {
        new Handler(Looper.getMainLooper()).postDelayed(new c(this.a), 100);
    }
}
