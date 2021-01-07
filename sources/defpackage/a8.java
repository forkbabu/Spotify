package defpackage;

import android.graphics.drawable.Animatable2;
import android.graphics.drawable.Drawable;

/* renamed from: a8  reason: default package */
class a8 extends Animatable2.AnimationCallback {
    final /* synthetic */ b8 a;

    a8(b8 b8Var) {
        this.a = b8Var;
    }

    @Override // android.graphics.drawable.Animatable2.AnimationCallback
    public void onAnimationEnd(Drawable drawable) {
        this.a.a(drawable);
    }

    @Override // android.graphics.drawable.Animatable2.AnimationCallback
    public void onAnimationStart(Drawable drawable) {
        this.a.getClass();
    }
}
