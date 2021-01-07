package defpackage;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;

/* access modifiers changed from: package-private */
/* renamed from: m0f  reason: default package */
public class m0f extends AnimatorListenerAdapter {
    final /* synthetic */ Runnable a;
    final /* synthetic */ l0f b;

    m0f(l0f l0f, Runnable runnable) {
        this.b = l0f;
        this.a = runnable;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public void onAnimationEnd(Animator animator) {
        this.b.q.removeAllListeners();
        this.a.run();
        this.b.p.start();
    }
}
