package defpackage;

import android.graphics.drawable.AnimationDrawable;

/* renamed from: yp4  reason: default package */
public final /* synthetic */ class yp4 implements Runnable {
    public final /* synthetic */ AnimationDrawable a;

    public /* synthetic */ yp4(AnimationDrawable animationDrawable) {
        this.a = animationDrawable;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.a.start();
    }
}
