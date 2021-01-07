package defpackage;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;

/* access modifiers changed from: package-private */
/* renamed from: k  reason: default package */
public class k extends AnimatorListenerAdapter {
    final /* synthetic */ l a;

    k(l lVar) {
        this.a = lVar;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public void onAnimationEnd(Animator animator) {
        animator.setTarget(null);
        if (this.a.c == animator) {
            this.a.c = null;
        }
    }
}
