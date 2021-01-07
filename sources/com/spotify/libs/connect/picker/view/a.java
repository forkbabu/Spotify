package com.spotify.libs.connect.picker.view;

import android.graphics.drawable.AnimationDrawable;
import android.view.View;

public final /* synthetic */ class a implements qg0 {
    public final /* synthetic */ AnimationDrawable a;

    public /* synthetic */ a(AnimationDrawable animationDrawable) {
        this.a = animationDrawable;
    }

    @Override // defpackage.qg0
    public final void accept(Object obj) {
        View view = (View) obj;
        this.a.start();
    }
}
