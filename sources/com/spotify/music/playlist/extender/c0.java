package com.spotify.music.playlist.extender;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.widget.ImageButton;

/* access modifiers changed from: package-private */
public class c0 extends AnimatorListenerAdapter {
    final /* synthetic */ ImageButton a;
    final /* synthetic */ String b;
    final /* synthetic */ int c;
    final /* synthetic */ d0 f;

    c0(d0 d0Var, ImageButton imageButton, String str, int i) {
        this.f = d0Var;
        this.a = imageButton;
        this.b = str;
        this.c = i;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public void onAnimationEnd(Animator animator) {
        ImageButton imageButton = this.a;
        imageButton.post(new i(this, this.b, this.c, imageButton));
        this.f.c = null;
    }
}
