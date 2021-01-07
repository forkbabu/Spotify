package defpackage;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.os.Handler;

/* access modifiers changed from: package-private */
/* renamed from: i28  reason: default package */
public class i28 extends AnimatorListenerAdapter {
    final /* synthetic */ h28 a;

    i28(h28 h28) {
        this.a = h28;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public void onAnimationStart(Animator animator) {
        super.onAnimationStart(animator);
        new Handler().postDelayed(new d08(this), 10);
    }
}
