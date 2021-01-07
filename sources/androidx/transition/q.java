package androidx.transition;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;

/* access modifiers changed from: package-private */
public class q extends AnimatorListenerAdapter {
    final /* synthetic */ m1 a;
    final /* synthetic */ Transition b;

    q(Transition transition, m1 m1Var) {
        this.b = transition;
        this.a = m1Var;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public void onAnimationEnd(Animator animator) {
        this.a.remove(animator);
        this.b.C.remove(animator);
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public void onAnimationStart(Animator animator) {
        this.b.C.add(animator);
    }
}
