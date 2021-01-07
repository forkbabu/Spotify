package defpackage;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;

/* access modifiers changed from: package-private */
/* renamed from: mic  reason: default package */
public class mic extends AnimatorListenerAdapter {
    final /* synthetic */ nic a;

    mic(nic nic) {
        this.a = nic;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public void onAnimationEnd(Animator animator) {
        super.onAnimationEnd(animator);
        this.a.o.setVisibility(8);
    }
}
