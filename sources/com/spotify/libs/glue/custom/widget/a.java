package com.spotify.libs.glue.custom.widget;

import android.graphics.drawable.Animatable;

public final /* synthetic */ class a implements Runnable {
    public final /* synthetic */ Animatable a;

    public /* synthetic */ a(Animatable animatable) {
        this.a = animatable;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.a.start();
    }
}
